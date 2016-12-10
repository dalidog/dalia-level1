float X ;
float Y ;
float pipeX;
float pipeY;
int Width;
int Height;
float pipeWidth ;
float pipeHeight ;
float birdYVelocity ;
float gravity = 0.06;
void setup() {
  size(500, 500);
  birdYVelocity = 0;
  pipeHeight = random(100, 400);
  pipeY = 500-pipeHeight;
  ;
  pipeWidth = 100;
  X = 150;
  Y = 250;
  Width = 20;
  Height = 20;
  pipeX = 450;
}

void draw() {
  Y = Y + birdYVelocity;
  birdYVelocity +=gravity;
  background(0, 191, 255);
  fill(220, 20, 60);    
  ellipse(X, Y, Width, Height);
  fill(0, 51, 0) ; 

  rect(pipeX, pipeY, pipeWidth, pipeHeight)  ;
  pipeX-=1;
  if (pipeX <=0) {
    pipeX=450;
    pipeHeight = random(100, 400);
    pipeY = 500-pipeHeight;
  }
  if (intersects2(X,Y,pipeX,pipeY, pipeHeight)){
    Y = 250;
    pipeX = 450;
  }
  rect(pipeX, pipeY-400, pipeWidth, pipeHeight)  ;
  pipeX-=1;
  if (pipeX <=0) {
    pipeX=450;
    pipeHeight = random(100, 400);
    pipeY = 500-pipeHeight;
  }
 if (intersects(X,Y,pipeX,pipeY-400, pipeHeight)){
    Y = 250;
    pipeX = 450;
  }
}

void mousePressed() {
  birdYVelocity =-2;
  System.out.println(birdYVelocity);
}
boolean intersects(float birdX, float birdY, float pipeX, float pipeY, float pipeWidth) {
  if (birdY > pipeY - 4 && birdX > pipeX && birdX < pipeX + pipeWidth)
    return true;
  else 
  return false;
}
boolean intersects2(float birdX, float birdY, float pipeX, float pipeY, float pipeWidth) {
  if (birdY < pipeY + pipeWidth  && birdX > pipeX && birdX < pipeX + pipeWidth)
    return true;
  else 
  return false;
}
