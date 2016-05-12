package q5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final MoveableShape shape
            = new CarShape(0, 0, CAR_WIDTH);
      
      final MoveableShape shapetwo
      = new CarShape(0, 50, CAR_WIDTH);
      
      final MoveableShape shapethree
      = new CarShape(0, 100, CAR_WIDTH);
      
      final MoveableShape shapefour
      = new CarShape(0, 150, CAR_WIDTH);

      ShapeIcon icon = new ShapeIcon(shape,
            ICON_WIDTH, ICON_HEIGHT);
      
      ShapeIcon icontwo = new ShapeIcon(shapetwo,
              ICON_WIDTH, ICON_HEIGHT);
      
      ShapeIcon iconthree = new ShapeIcon(shapethree,
              ICON_WIDTH, ICON_HEIGHT);
        
      ShapeIcon iconfour = new ShapeIcon(shapefour,
                ICON_WIDTH, ICON_HEIGHT);

      final JLabel label = new JLabel(icon);
      final JLabel labeltwo = new JLabel(icontwo);
      final JLabel labelthree = new JLabel(iconthree);
      final JLabel labelfour = new JLabel(iconfour);
      
      frame.setLayout(new GridLayout());
      frame.add(label);
      frame.add(labeltwo);
      frame.add(labelthree);
      frame.add(labelfour);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

      final int DELAY = 100;
      // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               shape.translate(1, 0);
               shapetwo.translate(1, 0);
               shapethree.translate(1, 0);
               shapefour.translate(1, 0);
               label.repaint();
               labeltwo.repaint();
               labelthree.repaint();
               labelfour.repaint();
            }
         });
      t.start();
   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}

