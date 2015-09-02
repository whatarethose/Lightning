int startX = mouseX;
int startY=mouseY;
int endX = 0;
int endY = 150;
int lightningDrawn;
void setup()
{
  background(255);
  strokeWeight(2);
  size(300,300);

}
void draw()
{

}
void mousePressed()
{
	drawLightning();
}
color randomColor(){
  	return color((int)(Math.random()*255),(int)(Math.random()*255),
    (int)(Math.random()*255));
}
void clear(){
	background(255);
}
void keyPressed(){
	if(	key == 'a'){
		clear();
	}
}
void drawLightning(){
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
  	startX=mouseX;
  	startY=mouseY;
  	endX=0;
  }	
}