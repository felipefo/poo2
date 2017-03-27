
package adatperrectangle;

import rectangle.DrawRectangle;


public class AdatperRectangle  {    
   private DrawRectangle rectangle;    
   AdatperRectangle(int x1, int y1, int x2, int y2){          
       int w = x2 - x1 ;
       int h = y2 - y1;
       rectangle = new DrawRectangle(x1, y1,w , h);       
   }
    
}
