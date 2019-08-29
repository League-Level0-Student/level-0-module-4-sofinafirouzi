import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch




PImage donkey;
PImage tail;
boolean gameover = false;
int tailx = 676;
int taily = 119;
void setup(){
 donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to 
 
  size(798,570);
   donkey.resize(width,height);
  tail.resize(80,300);     //replace width, height with your tail's dimensions
  Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to

}

void draw(){
  if(gameover){
  background (donkey);
  }
  else{
    if(dist(0, 0, mouseX, mouseY) > 30){
  background(#C5EFF7);
    }
    else{
      background(donkey);
    }
  }
 if(gameover = true){   
image(tail, mouseX, mouseY);
rect(0, 0, 30, 30);
rect(676, 119, 40, 40);
 }
 if(mousePressed){
  gameover = true;
 }
   
  
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
 }
 
