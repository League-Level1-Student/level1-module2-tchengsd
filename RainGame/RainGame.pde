int score = 0;
void setup(){
  size(400,400);
}
int rainY = 0;
int randomNumber = (int) random(width);
void draw(){
  background(0,200,255);
  fill(0,0,175);
  stroke(0,0,175);
  ellipse(randomNumber,rainY,10,10);
  rainY+=7;
  if(rainY>400){
    checkCatch(randomNumber);
    rainY = 0;
    randomNumber = (int) random(width);
  }
  fill(200,200,200);
  stroke(150,150,150);
  rect(mouseX,340,50,60);
  fill(0);
  textSize(16);
  text("Score: " + score,20,20);
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+50)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }