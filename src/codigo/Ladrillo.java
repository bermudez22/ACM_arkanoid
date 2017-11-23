package codigo;

import java.awt.Color;

import acm.graphics.GRect;

/**
 * 
 * 
 * @author Juan Antonio Bermudez
 *
 *La clase Ladrillo sirve para dibujar los ladrillos
 *del juego
 */

public class Ladrillo extends GRect {
	/**
	 * contruye un ladrillo
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * 
	 * futuros cambios: que admite numero de golpes
	 */

	public Ladrillo(double x, double y, double width, double height, Color _color) {
		super(x, y, width, height);
		setFilled(true);
		setFillColor(_color);
		
	}

}
