package main.AbstractFactory.abstractfactory5;

import main.AbstractFactory.abstractfactory5.cards.Shading;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;

public class DesenhosProva {

	public void draw_Retangulo(Graphics g, int yValue, Color color, Color backGround, Shading shading) {

		Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
		g2d.setStroke(new BasicStroke(5.0f));
		g2d.drawRect(40, yValue, 70, 40);

		g2d.setPaint(shading.getPaint(color, backGround));
		g2d.fillRect(40, yValue, 70, 40);

	}
	
	public void draw_Estrela(Graphics g, int yValue, Color color, Color backGround, Shading shading) {

		int x = 75;

	    Graphics2D g2d = (Graphics2D) g;

	    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);

        double startAngleRad = Math.toRadians(-18);
        double outerRadius = 10 * 2.63;
        double innerRadius = 10;
        
        double centerX = x;
        double centerY = yValue+20;
        
        Path2D path = new Path2D.Double();
        double deltaAngleRad = Math.PI / 5;
        for (int i = 0; i < 5 * 2; i++)
        {
            double angleRad = startAngleRad + i * deltaAngleRad;
            double ca = Math.cos(angleRad);
            double sa = Math.sin(angleRad);
            double relX = ca;
            double relY = sa;
            if ((i & 1) == 0)
            {
                relX *= outerRadius;
                relY *= outerRadius;
            }
            else
            {
                relX *= innerRadius;
                relY *= innerRadius;
            }
            if (i == 0)
            {
                path.moveTo(centerX + relX, centerY + relY);
            }
            else
            {
                path.lineTo(centerX + relX, centerY + relY);
            }
        }
        path.closePath();
        g2d.setColor(color);
		g2d.setStroke(new BasicStroke(5.0f));
        g2d.draw(path); 
        g2d.setPaint(shading.getPaint(color, backGround));
        g2d.fill(path);
        
	}
	
	public void draw_Triangulo(Graphics g, int yValue, Color color, Color backGround, Shading shading) {
		
	    Graphics2D g2d = (Graphics2D) g;

		int x[]={70,40,100};
		int y[]={yValue,yValue+30,yValue+30};
        g2d.setColor(color);
		g2d.setStroke(new BasicStroke(5.0f));
		g2d.drawPolygon(x,y,3);
        g2d.setPaint(shading.getPaint(color, backGround));
        g2d.fillPolygon(x,y,3);
	}


}
