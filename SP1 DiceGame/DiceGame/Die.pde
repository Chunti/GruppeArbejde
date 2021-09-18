class Die {
  int dieValue;                                    //The value of the die
  color eyeColor;                                  //The color of the eyes on the die
  color dieColor;                                  //The color of the die

  public Die(color eyeColor, color dieColor) {     //Constructor
    this.eyeColor = eyeColor;                      //Sets the color of the eyes on the die
    this.dieColor = dieColor;                      //Sets the color of the die
  }

  public void roll() {
    dieValue = (int)random(1, 7);                  //Sets the dieValue to a random number between 1 and 6
  }
  public int getDieValue() {
    return dieValue;                               //Returns the value of the die
  }
  public void draw(int x, int y, int size) {
    fill(dieColor);                                //Fills in the color of the die
    rect(x, y, size, size, 5);                     //Draws the die
    int[] xPos = {x+(size/4), x-(size/4)};         //Position of the dots on the x axes [0] = Right [1] = Left
    int[] yPos = {y+(size/4), y-(size/4)};         //Position of the dots on the y axes [0] = Low [1] = High
    size/=6;                                       //Converts the size of the die to be used for the size of the eyes
    fill(eyeColor);                                //Fills in the color of the eyes
    switch(dieValue) {                             //Switches depending on the value of the die
    case 1:
      ellipse(x, y, size, size);                   //draws the dots on the dices, depending on the dices values.
      break;
    case 2:
      ellipse(xPos[0], yPos[0], size, size);
      ellipse(xPos[1], yPos[1], size, size);
      break;
    case 3:
      ellipse(x, y, size, size);
      ellipse(xPos[1], yPos[1], size, size);
      ellipse(xPos[0], yPos[0], size, size);
      break;
    case 4:
      ellipse(xPos[1], yPos[1], size, size);
      ellipse(xPos[0], yPos[0], size, size);
      ellipse(xPos[1], yPos[0], size, size);
      ellipse(xPos[0], yPos[1], size, size);
      break;
    case 5:
      ellipse(x, y, size, size);
      ellipse(xPos[1], yPos[1], size, size);
      ellipse(xPos[0], yPos[0], size, size);
      ellipse(xPos[1], yPos[0], size, size);
      ellipse(xPos[0], yPos[1], size, size);
      break;
    case 6:
      ellipse(xPos[1], y, size, size);
      ellipse(xPos[0], y, size, size);
      ellipse(xPos[1], yPos[0], size, size);
      ellipse(xPos[0], yPos[1], size, size);
      ellipse(xPos[1], yPos[1], size, size);
      ellipse(xPos[0], yPos[0], size, size);
      break;
    }
  }
}
