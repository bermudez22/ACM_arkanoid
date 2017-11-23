
package codigo;

import java.awt.Color;
import java.awt.event.MouseEvent;

/*
 * Autor: Juan Antonio Bermudez Chacon
 * 
 * El Arkanoid pero orientado a odjetos
 */

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Arkanoid extends acm.program.GraphicsProgram {

	Pelota pelota1 = new Pelota(7, Color.BLUE);
	//Pelota pelota2 = new Pelota(30, Color.BLACK);
	Barra barra1 = new Barra(60, 15, Color.RED);
	RandomGenerator aleatorio = new RandomGenerator();
	int anchoLadrillo = 25;
	int altoLadrillo = 15;
	int espacioMenu = 200;
	//El sitema del marcador
	int puntuacion = 0;
	Marcador marcador = new Marcador (20, 40);


	public void init () {

		addMouseListeners();
		setSize (600, 600);
		GRect lateral = new GRect(3, getHeight());
		lateral.setFilled(true);
		add(lateral, getWidth()-200, 0);
		add(pelota1, 0, getHeight()*0.60 - pelota1.getHeight());
		//add(pelota2, 0, getHeight()*0.80 - pelota1.getHeight());
		add(barra1, 0, getHeight()*0.80);


	}

	public void run ( ) {
		dibujaNivel01();
		marcador.dibuja(this);

		while (true) {
			pelota1.muevete(this);
			//pelota2.muevete(this);
			pause(5);
		}


	}
	public void mouseMoved (MouseEvent evento) {
		barra1.mueveBarra(evento.getX(), getWidth()- espacioMenu);

	}

	private void dibujaNivel01 () {
		for (int j=0; j < 14; j++) {
			for(int i=j; i < 14; i++) {
				Ladrillo miLadrillo = 
						new Ladrillo(anchoLadrillo*i - anchoLadrillo*j/2,
								altoLadrillo*j + altoLadrillo,
								anchoLadrillo,
								altoLadrillo,
								aleatorio.nextColor());
				add(miLadrillo);
				pause(7);
			}
		}
	}

}