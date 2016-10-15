 Car car1 = new Car(0,0,10,50);
  Car car2= new Car(0,50,5,20);
   Car car3 = new Car(0,100,30,60);
    Car car4 = new Car(0,150,3,60);
     Car car5 = new Car(0,200,50,6);
 Car car6= new Car(0,250,10,40);
  Car car7 = new Car(0,300,20,10);

int hop = 40;
 int frogX=200;
int frogY=390;
void setup(){
  size(400,400);
  
}
void draw(){
  car1.carmove();
  car2.carmove();
  car3.carmove();
  car4.carmove();
  car5.carmove();
  car6.carmove();
  car7.carmove();
  background(0,0,0);
  ellipse(frogX,frogY,20,20);
  fill(0,102,51);
  frogBound();
  car1.display();
  car2.display();
  car3.display();
    car4.display();
  car5.display();
  car6.display();
  car7.display();
  
if(intersects(car1) || intersects(car2)|| intersects(car3)|| intersects(car4)|| intersects(car5)|| intersects(car6)|| intersects(car7)){
frogX = 0;
frogY = 200;
}}


boolean intersects(Car car) {
if ((frogY > car.getY() && frogY < car.getY()+50) && (frogX > car.getX() && frogX < car.getX()+car.getSize()))
          return true;
    else 
        return false;
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
  int getX(){
    return X;
  }
  int getY(){
    return Y;
  }
  int getSize(){
    return Size;
  }
 void carmove(){
  X = Speed+X;
if(X>=400){
  X = 0;
}
 }
 Car(int  X, int Y,  int Speed, int  Size){
    this.X=X;
    this.Y=Y;
    this.Speed=Speed;
    this.Size=Size;
 }
 void display() 
  {
    fill(221,85, 187);
    rect(X, Y,  Size, 50);
  }
}

