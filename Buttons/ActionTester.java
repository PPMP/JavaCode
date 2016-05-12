package q4;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class ActionTester implements Icon
{
	   public ActionTester(int aSize)
	   {
	      size = aSize;
	   }
	   
	   public void setID(int id) {
		   this.id = id;
	   }

	   public int getIconWidth()
	   {
	      return size;
	   }

	   public int getIconHeight()
	   {
	      return size;
	   }

	   public void paintIcon(Component c, Graphics g, int x, int y)
	   {
	      Graphics2D g2 = (Graphics2D) g;
	      Ellipse2D.Double planet = new Ellipse2D.Double(x, y,
	            size, size);
	      g2.setColor(redColor);
	      if(this.id == 1) {
	      g2.setColor(redColor);
	      }
	      else if(this.id == 2) {
	    	  g2.setColor(blueColor);
	      }
	      else if(this.id == 3) {
	    	  g2.setColor(greenColor);
	      }
	      g2.fill(planet);
	   }

	private int size;
	private int id;
    Color redColor = Color.RED;
	Color blueColor = Color.BLUE;
	Color greenColor = Color.GREEN;
	
	static JButton redButton = new JButton("Red");
	static JButton blueButton = new JButton("Blue");
	static JButton greenButton = new JButton("Green");
	
	private static JButton createButton(int index) {
		if(index == 0) {
			return redButton;
		}
		else if(index == 1)
		{
			return blueButton;
		}
		else 
		{
			return greenButton;
		}
	}
	public static void main(String[] args)
   {
     final JFrame frame = new JFrame();
     final ActionTester redIcon = new ActionTester(50);
     final JLabel label = new JLabel(redIcon);
     frame.add(label);

  	redButton.setBackground(Color.red);
  	redButton.setOpaque(true);
  	redButton.setBorderPainted(false);
  	
  	blueButton.setBackground(Color.blue);
	blueButton.setOpaque(true);
	blueButton.setBorderPainted(false);
	
	greenButton.setBackground(Color.green);
	greenButton.setOpaque(true);
	greenButton.setBorderPainted(false);
  	

      blueButton.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
            	redIcon.setID(2);
            	label.repaint();
            }
         });

      redButton.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
            	redIcon.setID(1);
            	label.repaint();
            }
         });
      
		greenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				redIcon.setID(3);
				label.repaint();
			}
		});

      frame.setLayout(new FlowLayout());
      
      for(int i=0; i < 3; i++){
      frame.add(createButton(i));
      }

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}
