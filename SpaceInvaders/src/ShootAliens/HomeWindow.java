package ShootAliens;

import java.awt.Graphics;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeWindow extends JPanel{
	
	JFrame window = new JFrame();
	HomeWindow()
	{
		window.add(this);
		
		try {
			File sound = new File("sounds//alien-spaceship_daniel_simion.mp3");
		AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
		Clip clip = AudioSystem.getClip();
		clip.open(ais);
		clip.start();
		
		}catch(Exception e) {System.out.println(e);}
		
		window.setLocation(50, 50);
		window.setUndecorated(true);
		window.setSize(960,540);
		window.setVisible(true);
		
	}
	
	
	public void paint(Graphics g)
	{
		ImageIcon background = new ImageIcon("images//CometPlannet.jpg");
		
		g.drawImage(background.getImage(),0,0,null);
	}

}
