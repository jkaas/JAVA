import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
	
	void launchFrame() {
		setSize(300,300);
		setLocation(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		BallGame game = new BallGame();
		game.launchFrame();
	}

}
