package q5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
    
public class Bargraph extends JComponent {

	private JFrame frame;
	private JTextField textField_2;
	private JPanel panel_1;
	private JTextField textField;
	private JPanel panel_2;
	private JTextField textField_1;
	private JPanel panel_3;
	
	/**
	 * Launch the application.
	 */
	private static class Rect extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
		    super.paintComponent(g);  
		    g.drawRect(230,80,50,50);  
		    g.setColor(Color.RED);  
		    g.fillRect(230,80,50,50);  
		  }
	}

        
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bargraph window = new Bargraph();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public Bargraph() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		final JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField_2 = new JTextField();
		textField_2.setText("100.00");
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				 if(arg0.getKeyChar() == '5') {
					 Rect fieldOne = new Rect();
					 fieldOne.setBackground(Color.RED);
						panel_1 = new JPanel();
						panel.add(panel_1);
						panel_1.setPreferredSize(new Dimension(50,50));
						fieldOne.setPreferredSize(new Dimension(50,40));
						panel_1.add(fieldOne);
				 }
			}
		});
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		Rect fieldOne = new Rect();
		Rect fieldTwo = new Rect();
		Rect fieldThree = new Rect();
		
		fieldOne.setBackground(Color.RED);
		panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setPreferredSize(new Dimension(300,50));
		fieldOne.setPreferredSize(new Dimension(300,40));
		panel_1.add(fieldOne);
		
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
			}
		});
		textField.setText("100.00");
		panel.add(textField);
		textField.setColumns(10);
		
		panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setPreferredSize(new Dimension(300,50));
		fieldTwo.setBackground(Color.YELLOW);
		fieldTwo.setPreferredSize(new Dimension(300,40));
		panel_2.add(fieldTwo);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
			}
		});
		textField_1.setText("100.00");
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setPreferredSize(new Dimension(300,50));
		fieldThree.setBackground(Color.BLUE);
		fieldThree.setPreferredSize(new Dimension(300,40));
		panel_3.add(fieldThree);
	}
}
