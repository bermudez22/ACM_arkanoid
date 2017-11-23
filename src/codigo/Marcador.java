package codigo;

import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GRect;

public class Marcador  extends GRect{
	
	GLabel texto = new GLabel("");

	public Marcador(double width, double height) {
		super(width, height);
		setFilled(true);
		setColor(Color.white);
		texto.setLabel("hola");
	}

	public void dibuja(Arkanoid _arkanoid) {
		_arkanoid.add(this, _arkanoid.getWidth() - 50, getY());
		_arkanoid.add (texto,  _arkanoid.getWidth() -50, getY());
		
		
		
	}
	
	
	
	
}
