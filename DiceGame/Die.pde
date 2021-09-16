class Die{
  int dieValue;
  color eyeColor;
  color dieColor;
  
  public Die(color eyeColor, color dieColor){
    this.eyeColor = eyeColor;
    this.dieColor = dieColor;
  }

  public void roll(){
    //dieValue = (int)random(1,7);
      dieValue =1;
}
  public int getDieValue(){
    return dieValue;
  }
  public void draw(int x, int y, int size){
    fill(dieColor);
    rect(x,y,size,size,5);    
    int[] xPos = {x+(size/4),x-(size/4)}; //[0] = Right [1] = Left
    int[] yPos = {y+(size/4),y-(size/4)}; //[0] = Low [1] = High
    size/=6;
    fill(eyeColor);
    switch(dieValue){
      case 1:
      ellipse(x,y,size,size);
      break;
      case 2:
      ellipse(xPos[0],yPos[0],size,size);
      ellipse(xPos[1],yPos[1],size,size);
      break;
      case 3:
      ellipse(x,y,size,size);
      ellipse(xPos[1],yPos[1],size,size);
      ellipse(xPos[0],yPos[0],size,size);
      break;
      case 4:
      ellipse(xPos[1],yPos[1],size,size);
      ellipse(xPos[0],yPos[0],size,size);
      ellipse(xPos[1],yPos[0],size,size);
      ellipse(xPos[0],yPos[1],size,size);
      break;
      case 5:
      ellipse(x,y,size,size);
      ellipse(xPos[1],yPos[1],size,size);
      ellipse(xPos[0],yPos[0],size,size);
      ellipse(xPos[1],yPos[0],size,size);
      ellipse(xPos[0],yPos[1],size,size);
      break;
      case 6:
      ellipse(xPos[1],y,size,size);
      ellipse(xPos[0],y,size,size);
      ellipse(xPos[1],yPos[0],size,size);
      ellipse(xPos[0],yPos[1],size,size);
      ellipse(xPos[1],yPos[1],size,size);
      ellipse(xPos[0],yPos[0],size,size);
      break;
  }
}
}
