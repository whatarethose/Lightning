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

int startX = 0;
int startY=150;
int endX = 0;
int endY = 150;
int r = (int)(Math.random()*256);
int g = (int)(Math.random()*256);
int b = (int)(Math.random()*256);
public void setup()
{
	background(0);
	strokeWeight(2);
  	size(300,300);

}
public void draw()
{
	stroke(255,255,0);
	while( endX < 300){
		endX = startX + (int)(Math.random()*10);
		endY= startY+(int)(Math.random()*20)-10;
		line(startX,startY,endX,endY);
		startX=endX;
		startY =endY;
	}
}
public void mousePressed()
{
	startX=0;
	startY=150;
	endX=0;
	endY=150;
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
