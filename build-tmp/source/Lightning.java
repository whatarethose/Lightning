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

int startX = mouseX;
int startY=mouseY;
int endX = 0;
int endY = 150;
int lightningDrawn;
public void setup()
{
  background(255);
  strokeWeight(2);
    size(300,300);

}
public void draw()
{

}
public void mousePressed()
{
	drawLightning();
}
public int randomColor(){
  return color((int)(Math.random()*255),(int)(Math.random()*255),
    (int)(Math.random()*255));
}
public void clear(){
	background(255);
}
public void keyPressed(){
	if(	key == 'a'){
		clear();
	}
}
public void drawLightning(){
	startX=mouseX;
  	startY=mouseY;
  	endX=0;
	for(int x = 0;x < (int)(Math.random()*10);x++){
	stroke(randomColor());
  	while( endX < 300)
  	{
   		endX = startX + (int)(Math.random()*10);
    	endY= startY+(int)(Math.random()*20)-10;
    	line(startX,startY,endX,endY);
    	startX=endX;
    	startY =endY;
  	}
  	endX=0;
  }	
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
