package main.AbstractFactory.abstractfactory5;

import main.AbstractFactory.abstractfactory5.abstractfactory.CardAbstractFactory;
import main.AbstractFactory.abstractfactory5.abstractfactory.CardDafaultFactory;
import main.AbstractFactory.abstractfactory5.abstractfactory.CardProvaFactory;
import main.AbstractFactory.abstractfactory5.cards.Card;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Properties;
import javax.swing.*;

public class Solitaire extends JFrame {

	private final int BWIDTH = 660; // the initial board width

	private final int BHEIGHT = 750; // the board height

	private final int DELTA_WIDTH = 160; // the change in width when needed

	private JFrame frame; // a pointer to the application itself

	private Deck deck; // the deck of cards

	private Set set; // a data structure of up to three cards

	private JComponent c; // the container where the cards are displayed

	private Card cardsInContainer[] = new Card[21]; // the dealt cards

	private int numCardsInContainer = 0; // the number of cards that have
											// been dealt

	private CardAbstractFactory cardAbstractFactory;

	// pt is the array of points where the cards are displayed
	// We limit the size to 21, since 21 cards MUST have a set
	// Most of the time only the first 12 positions are used
	private Point pt[] = { new Point(10, 10), new Point(10, 220),
			new Point(10, 430), new Point(170, 10), new Point(170, 220),
			new Point(170, 430), new Point(330, 10), new Point(330, 220),
			new Point(330, 430), new Point(490, 10), new Point(490, 220),
			new Point(490, 430), new Point(650, 10), new Point(650, 220),
			new Point(650, 430), new Point(810, 10), new Point(810, 220),
			new Point(810, 430), new Point(970, 10), new Point(970, 220),
			new Point(970, 430), };

	// The constructor sets up the Frame and adds some cards to it.
	public Solitaire() throws IOException {
		// Initialize the JFrame
		super("Solitaire Game");
		frame = this;
		setSize(BWIDTH, BHEIGHT);
		c = (JComponent) getContentPane();
		c.setLayout(null);
		Properties props = new Properties();
		props.load(new InputStreamReader(new FileInputStream(new File("conf.properties"))));
		String factory = props.getProperty("type");
		if (factory.equals("prova"))
			cardAbstractFactory = new CardProvaFactory();
		else
			cardAbstractFactory = new CardDafaultFactory();

		// add the menu bar to the application
		setJMenuBar(new SetMenuBar());

		// set is the cards that have been clicked
		set = new Set();

		// new up a deck and shuffle it
		deck = new Deck(cardAbstractFactory);
		deck.shuffle();

		// deal twelve cards to the display
		// each gets a mouse listener to handle clicks
		// We maintain a separate array (cardsInContainer) for
		// easy access to all the cards in the display
		for (int i = 0; i < 12; i++) {
			Card card = deck.dealOneCard();
			card.setIndex(i);
			card.setLocation(pt[i]);
			card.addMouseListener(new CardMouseListener());
			cardsInContainer[i] = card;
			c.add(card);
		}
		numCardsInContainer = 12;

		// add the hint button to the display
		JButton hint = new JButton("Hint");
		hint.setBounds(200, 650, 80, 30);
		hint.addActionListener(new SetFinder());
		c.add(hint);

		// add the exit button to the display
		JButton exit = new JButton("Exit");
		exit.setBounds(40, 650, 80, 30);
		exit.addActionListener(new GameExit());
		c.add(exit);

		// set the close operation and display the frame
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); waarom deed ik het nou
		// zo? Ik ben het vergeten...
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		show();
	}

	// This method searches the board for a set. It returns true and sets the
	// parameter to the set, if one if found.
	public boolean findSet(Set tester) {
		for (int i = 0; i < numCardsInContainer - 2; i++) {
			Card cd = cardsInContainer[i];
			tester.add(cd);
			for (int j = i + 1; j < numCardsInContainer - 1; j++) {
				Card cd2 = cardsInContainer[j];
				tester.add(cd2);
				for (int k = j + 1; k < numCardsInContainer; k++) {
					Card cd3 = cardsInContainer[k];
					tester.add(cd3);
					if (tester.isSet()) {
						return true;
					}
					tester.remove(cd3);
				}
				tester.remove(cd2);
			}
			tester.remove(cd);
		}
		return false;
	}

	// The CardMouseListener handles mouse clicks on cards
	class CardMouseListener extends MouseAdapter {

		// mouseClicked highlights/unhighlights on clicks
		// It also checks to see if there are three cards in the set
		public void mouseClicked(MouseEvent e) {

			Card card = (Card) e.getSource(); // find the card that was
												// clicked

			// Remove the card from the potential set on a second click
			if (set.contains(card)) {
				set.remove(card);
				card.setBold(false);
				card.paintImmediately(0, 0, 150, 200);
			}

			// Add a card on from the potential set on the first click
			else if (set.size() < 3) {
				set.add(card);
				card.setBold(true);
				card.paintImmediately(0, 0, 150, 200);
			}

			// If three cards in the set, check if it is a set
			if (set.size() == 3) {

				// if a set flash the cards, etc.
				if (set.isSet()) {
					set.flashSet();

					// Don't replace the cards if the deck is empty or
					// there are already more than 12 cards
					if (deck.isEmpty() || numCardsInContainer > 12) {
						for (int k = 0; k < 3; k++) {
							Card card1 = (Card) set.get(k);
							int start = card1.getIndex();
							c.remove(card1);

							// We pull the remaining cards back to the left
							for (int l = start + 1; l < numCardsInContainer; l++) {
								Card card2 = cardsInContainer[l];
								card2.setIndex(l - 1);
								card2.setLocation(pt[l - 1]);
								cardsInContainer[l - 1] = card2;
								card2.paintImmediately(0, 0, 150, 200);
							}
							numCardsInContainer--;
						}
						// Shrink the window back one column
						frame.setSize(frame.getWidth() - DELTA_WIDTH, frame
								.getHeight());
						if (deck.isEmpty() && findSet(new Set())) {
							JOptionPane
									.showMessageDialog(frame,
											"Deck is used up, but sets remain to be found.");
						}

					}

					// Replace the cards
					else {
						for (int k = 0; k < set.size(); k++) {
							Card cd = (Card) set.get(k);
							c.remove(cd);
							Card next = deck.dealOneCard();
							next.setLocation(cd.getLocation());
							next.setIndex(cd.getIndex());
							cardsInContainer[next.getIndex()] = next;
							next.addMouseListener(new CardMouseListener());
							c.add(next);
							next.paintImmediately(0, 0, 150, 200);
						}
					}
				}

				// if not a set, unhighlight the cards
				else {
					JOptionPane.showMessageDialog(frame, "Not a Set!");
					for (int i = 0; i < 3; i++) {
						Card cd = (Card) set.get(i);
						cd.setBold(false);
						cd.repaint();
					}
				}
				// Whether we found a set or not, we start again
				set = new Set();
			}
			if (deck.isEmpty() && !findSet(new Set())) {
				JOptionPane.showMessageDialog(frame,
						"Game Over!  You played well.");
			}

		}
	}

	// This class handles the hint button events
	private class SetFinder implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Set tester = new Set();

			// If no set is present add three more cards
			if (!findSet(tester)) {

				// If the deck is not empty we can proceed
				if (!deck.isEmpty()) {
					JOptionPane.showMessageDialog(frame,
							"No sets found.  Expanding by 3 cards!");
					frame.setSize(frame.getWidth() + DELTA_WIDTH, frame
							.getHeight());
					frame.getLayout().layoutContainer(frame);
					for (int i = 0; i < 3; i++) {
						Card card = deck.dealOneCard();
						card.setIndex(numCardsInContainer);
						card.setLocation(pt[numCardsInContainer]);
						card.addMouseListener(new CardMouseListener());
						cardsInContainer[numCardsInContainer] = card;
						c.add(card);
						numCardsInContainer++;
						card.paintImmediately(0, 0, 150, 200);
					}

					// revalidating the contentPane is needed to have the cards
					// show up
					frame.validate();
					// c.revalidate();
					// c.repaint(1);
				}

				// If the deckis empty the game is over
				else {
					JOptionPane
							.showMessageDialog(frame,
									"The game is over! Choose File -> New to start a new game.");
				}
			}

			// We have found a set, so we flash those cards
			else {
				tester.flashSet();
			}
		}
	}

	// This class handles the exit button events
	private class GameExit implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	/** This class represents our menu */
	private class SetMenuBar extends JMenuBar {
		// the menus and menu items
		private JMenu menu = new JMenu("File");

		private JMenuItem newItem = new JMenuItem("New");

		private JMenuItem exitItem = new JMenuItem("Exit");

		private JMenu help = new JMenu("Help");

		private JMenuItem helpItem = new JMenuItem("Help");

		// We use anonymous objects for some of our menu listeners
		public SetMenuBar() {

			// newItem has an anonymous handler
			newItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					// Remove the cards from the display
					Card card;
					for (int i = 0; i < numCardsInContainer; i++) {
						card = cardsInContainer[i];
						c.remove(card);
					}
					numCardsInContainer = 0;
					frame.repaint(5);

					// Start with a fresh deck of cards
					set = new Set();
					deck = new Deck(cardAbstractFactory);
					deck.shuffle();

					// Deal twelve cards to the display
					for (int i = 0; i < 12; i++) {
						card = deck.dealOneCard();
						card.setIndex(i);
						card.setLocation(pt[i]);
						card.addMouseListener(new CardMouseListener());
						cardsInContainer[i] = card;
						c.add(card);
					}
					numCardsInContainer = 12;
					frame.setSize(BWIDTH, BHEIGHT);
					frame.repaint();

				}
			});

			// Exit the system elegantly
			exitItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});

			// Help pops open a window telling the user to check out the web
			// site
			helpItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFrame helpWindow = new JFrame();
					helpWindow.setSize(450, 100);
					helpWindow.getContentPane().add(new HelpPane());
					helpWindow.show();
				}
			});

			// Add the items to the menus and the menus to the menubar
			menu.add(newItem);
			menu.add(exitItem);
			help.add(helpItem);

			add(menu);
			add(help);
		}
	}

	// We use an JEditorPane for the help window
	class HelpPane extends JEditorPane {
		public HelpPane() {
			super("Help", "Good luck finding the patterns!");
		}
	}

	// execute application
	public static void main(String args[]) throws IOException {
		new Solitaire();
	}
}
