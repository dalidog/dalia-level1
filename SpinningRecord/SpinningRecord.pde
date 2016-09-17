import ddf.minim.*;
int angle = 0;
PImage pictureOfRecord;
 
Minim minim;  
AudioPlayer song;
void setup(){
  pictureOfRecord= loadImage("record.jpg"); 
         size(pictureOfRecord.width,pictureOfRecord.height);
         minim = new Minim(this);  
         song = minim.loadFile("awesomeTrack.mp3", 512);

}
void draw(){
 
    if(mousePressed){
           angle = angle+1;
    rotateImage(pictureOfRecord,angle);

song.play();
    }
 
     image(pictureOfRecord, 0, 0);
}
void rotateImage(PImage image, int amountToRotate) {
      translate(width/2, height/2);
      rotate(amountToRotate*TWO_PI/360);                              
      translate(-image.width/2, -image.height/2);
}
    


