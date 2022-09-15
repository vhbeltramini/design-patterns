package main.Prototype.prototype02.prototype02;

import main.Prototype.prototype02.prototype02.jogo.Ogro;
import main.Prototype.prototype02.prototype02.jogo.Spawner;
import main.Prototype.prototype02.prototype02.jogo.Zumbi;

public class OJogo {

	public static void main(String[] args) throws Exception {
		Spawner<Ogro> caverna = new Spawner<>(new Ogro(50));
		
		Ogro clone = caverna.spawn();
		System.out.println(clone);
		
		Spawner<Zumbi> lab = new Spawner<Zumbi>(new Zumbi(10, 2));
		Spawner<Ogro> labDois = new Spawner<Ogro>(new Ogro(10));

		Zumbi zClone = lab.spawn();
		System.out.println(zClone);
		System.out.println(lab.spawn());
		
		Zumbi superZ = lab.spawn();
		superZ.setVida(100);
		System.out.println(superZ);

		Ogro superO = labDois.spawn();
		System.out.println(superO);
		superO.setVida(200);
		System.out.println(superO);

	}

}
	