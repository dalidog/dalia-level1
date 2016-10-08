 Car car1 = new Car(0,0,20,4);
  //Car car2= new Car();
   //Car car3 = new Car();
    //Car car4 = new Car();
     //Car car5 = new Car();
  //Car car6= new Car();
   //Car car7 = new Car();
//Car car8 = new Car();
int hop = 50;
 int frogX=200;
int frogY=390;
void setup(){
  size(400,400);
  
}
void draw(){
  background(0,0,0);
  ellipse(frogX,frogY,20,20);
  fill(0,102,51);
  frogBound();
  car1.display();
  


}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
      frogY=frogY-hop;
      }
      else if(keyCode == DOWN)
      {
       frogY=frogY+50;
      }
      else if(keyCode == RIGHT)
      {
      frogX=frogX+50;
      }
      else if(keyCode == LEFT)
      {
             frogX=frogX-50;
      }
   }
}
void frogBound(){
  if (frogX>400){
  frogX =400;
}
if (frogX<0){
  frogX =0;
}
if (frogY<0){
  frogY =0;
}
if (frogY>400){
  frogY =400;
}
}
class Car{
   int X;
   int Y;
   int Speed;
   int Size;
 Car(int  X, int Y,  int Speed, int  Size){
    this.X=X;
    this.Y=Y;
    this.Speed=Speed;
    this.Size=Size;
 }
 void display() 
  {
    fill(0,255,0);
    rect(X, Y,  Size, 50);
  }
}

