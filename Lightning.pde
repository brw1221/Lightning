int startx = 0;
int starty = 250;
int endx = 0;
int endy = 250;

void setup()
{
  size(500,500);
  background(0);
  strokeWeight(3);

}
void draw()
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
void mousePressed()
{
	startx = -20;
	starty = (int)(Math.random()*500);
	endx = mouseX;
	endy = mouseY;
	redraw();

}

