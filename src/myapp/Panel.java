package myapp;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Panel extends JPanel implements Runnable {
	// Game sizing
	final int pixelSize = 16; // original pixel size
	final int screenScale = 3; // to make sure the game doesn't look too small 
	
	final int scaledTiles = pixelSize * screenScale; // scale 16x16 to 48x48 while maintaining resolution
	final int maxScreenCol = 16; // max tiles to fit screen width
	final int maxScreenRow = 12; // same with above for height
	final int screenWidth = scaledTiles * maxScreenCol; // 768px
	final int screenHeight = scaledTiles * maxScreenRow; // 576px
	
	Thread gameThread;
	
	public Panel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}

	public void startGameThread() {
		gameThread = new Thread(this);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
