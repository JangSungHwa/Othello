package Game_System;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainMenu extends JFrame{
	
	ImageIcon background = new ImageIcon(MainMenu.class.getResource("../images/�Ϸ���Ʈ.png"));
	ImageIcon start = new ImageIcon(MainMenu.class.getResource("../images/���ӽ���.png"));
	Dimension d = new Dimension();
	
	public JPanel Gamepanel = new JPanel() {	
		@Override
		public void paint(Graphics g) {
			d = getSize();
//			g.drawImage(background.getImage(),0,0,d.width,d.height,null);
//			g.drawImage(start.getImage(), 700, 200, 250, 100, null);
//			repaint();
		}
	};
	public MainMenu(){
		setTitle("Othello_MainMenu");
		setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(Gamepanel);
		
		JButton start_butn = new JButton("Game Start");
		Gamepanel.add(start_butn);
		Gamepanel.setLayout(null);
		start_butn.setBounds(15, 345, 960, 100);
//		start_butn.setOpaque(false);
//		start_butn.setFocusPainted(false); // ���� �Ǿ����� ����� �׵θ� ����
//		start_butn.setContentAreaFilled(false);				
		
		start_butn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Othello frame = new Othello();
				dispose();
			}
		});
	}
}
