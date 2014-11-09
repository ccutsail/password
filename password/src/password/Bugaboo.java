package password;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Bugaboo {

	protected static JFrame frame;
	protected static JPasswordField pwdEnterThePassword;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bugaboo window = new Bugaboo();
					Bugaboo.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bugaboo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		pwdEnterThePassword = new JPasswordField();
		pwdEnterThePassword.setBounds(64, 113, 134, 20);
		frame.getContentPane().add(pwdEnterThePassword);
		
		HandleClick guess = new HandleClick();
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(272, 82, 89, 23);
		btnSubmit.addMouseListener(guess);
		
		frame.getContentPane().add(btnSubmit);
		
		HandleClickHelp help = new HandleClickHelp();
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(272, 135, 89, 23);
		frame.getContentPane().add(btnHelp);
		btnHelp.addMouseListener(help);
		
		JLabel lblEnterThePassword = new JLabel("Enter the Password. . .");
		lblEnterThePassword.setBounds(64, 86, 134, 14);
		frame.getContentPane().add(lblEnterThePassword);
		


	}


}
class HandleClick implements MouseListener{

	
	public void mouseClicked(MouseEvent e) {

		char [] bugaboo = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };
		char[] password = Bugaboo.pwdEnterThePassword.getPassword();
		if (Arrays.equals (password, bugaboo)){
			 JOptionPane.showMessageDialog(null,"Correct!");
		}
		else{
			 JOptionPane.showMessageDialog(null,"Your answer is wrong. Boo.");
			
		}
		
			
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class HandleClickHelp implements MouseListener{

	
	public void mouseClicked(MouseEvent e) {
	
		 JOptionPane.showMessageDialog(null,"The answer rhymes with shmugaloo");
	}
		
			
	

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

