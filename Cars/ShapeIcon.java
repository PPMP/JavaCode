package q5;

import java.awt.*;
import java.util.*;

import javax.swing.*;

/**
   An icon that contains a moveable shape.
*/
public class ShapeIcon implements Icon
{
   public ShapeIcon(MoveableShape shape,
      int width, int height)
   {
      this.width = width;
      this.height = height;
      this.shape = shape;
      cars.add(shape);
   }
   
   public int getIconWidth()
   {
      return width;
   }

   public int getIconHeight()
   {
      return height;
   }

   public void paintIcon(Component c, Graphics g, int x, int y)
   {
      Graphics2D g2 = (Graphics2D) g;
      for(MoveableShape icon : cars) {
    	  icon
    	  .draw(g2);  
      }
   }

   private int width;
   private int height;
   private MoveableShape shape;
   private ArrayList<MoveableShape> cars = new ArrayList<MoveableShape>();
}
