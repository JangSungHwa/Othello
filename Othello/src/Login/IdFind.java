package Login;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class IdFind extends JFrame{
	JButton ID;
	JButton NickName;
	
	IdFind(){
		setSize(250,100);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // ���� 
		setResizable(false); // âũ�� ���� ����
		setLocationRelativeTo(null);
		
		JLayeredPane Layer = new JLayeredPane();
		Layer.setBounds(0,0,250,100);
		Layer.setLayout(null);
		
		ID = new JButton("ID�� ã��");
		ID.setBounds(20,12, 90,40);
		
		NickName = new JButton("NickName\n���� ã��");
		NickName.setBounds(130,12,90,40);
		
		Layer.add(ID);
		Layer.add(NickName);
		
		add(Layer);
		setVisible(true);
	}
}
