package codigo;

import java.awt.Color;

import acm.graphics.GRect;
/**
 *  
 * @author Juan Bermudez
 *
 *La calse barra es la que dibuja el cursor del juego
 */

public class Barra extends GRect {
	/**
	 * crea el sursor del juego
	 * @param width  -> el ancho del cursor
	 * @param height -> el alto del cursor
	 * @param _color -> color del cursor
	 * 
	 */
	
	
	public Barra (double width, double height, Color _color) {
	super(width, height);
	setFilled(true);
	setFillColor(_color);
	
	}
	/**
	 * mueveBarra reposiciona la barra en la coordeanda
	 * en la que esta el raton
	 * @param posX -> la posicion X del raton. La Y la optiene de la 
	 * propia barra
	 * @param anchoPantalla porque asi no tengo que pasar mas.
	 */
	public void mueveBarra (int posX, int anchoPantalla) {
		if (posX + getWidth()< anchoPantalla) {
			setLocation(posX, getY());
			
		}
		
	}
}
