void setup(){
  PImage face = loadImage("face.jpg");
    background(face);
  size(992,744);
 
}

int leftx = 496;
int lefty = 120;
int minx = 473;
int miny = 109;
int maxx = 520;
int maxy = 134;
void draw(){
  if(mouseX<minx){
   leftx = minx;
 }
 
 else if(mouseX>maxx){
   leftx=maxx;
 }
 else{
   leftx=mouseX;
 }
 if(mouseY<miny){
   lefty =miny;
 }
 else if(mouseY>maxy) {
   lefty = maxy;
 }
 else{
   lefty=mouseY;
 }
 
 
 
  fill(#FFFFFF);
  ellipse(496 , 120 , 80, 60);
  ellipse(625, 178, 80, 60);
  fill(#000000);
  ellipse(leftx,lefty,20,15);
 ellipse(leftx+(625-496), lefty+(178-120), 20,15);
 
 
  
}
