import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100;//小球的横坐标
	double y = 100;//小球的纵坐标
	
	boolean right = true;//方向
	
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次!");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		x = x + 1;
	
	
	if(right) {
		x = x + 10;
	}else {
		x = x - 10;
	}
	
	if(x > 856 - 40 - 30) {//856是窗口宽度，40是桌子
		right = false;
	}
	
	if(x < 0) {
		right = true;
	}
	
	}
	//窗口加载
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//重画窗口，每秒画25次
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		BallGame game = new BallGame();
		game.launchFrame();
	}

}
