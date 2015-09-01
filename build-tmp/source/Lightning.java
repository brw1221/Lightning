import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startx = 0;
int starty = 250;
int endx = 0;
int endy = 250;

public void setup()
{
  size(500,500);
  background(0);
  strokeWeight(3);

}
public void draw()
{
	stroke((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
	while (endy < 500)
	{
		
		endx = startx + (int)(Math.random()*10);
		endy = starty + (int)((Math.random()*20)-10);
		line(startx,starty,endx,endy);
		startx = endx;
		starty = endy;
	}
}
public void mousePressed()
{
	startx = -20;
	starty = (int)(Math.random()*500);
	endx = mouseX;
	endy = mouseY;
	redraw();

}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
