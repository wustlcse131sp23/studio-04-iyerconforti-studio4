package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledRectangle(.5, 0.5, 0.35, 0.2);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(0.5, 0.5, 0.23, 0.13);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(.05);
		StdDraw.line(.27, 0.37, 0.5, 0.5);
		StdDraw.line(0.5, 0.5, 0.73, 0.37);
		StdDraw.text(0.5, 0.55, "FLAG");
	}
}