DiceCup diceCup;                                     //Makes our class avalible everywhere

void setup() {
  size(1000, 800);                                   //Sets the window size
  background(255);                                   //Sets the background
  rectMode(CENTER);                                  //Sets the squares to center mode
  ellipseMode(CENTER);                               //Sets the dots to center mode
  diceCup = new DiceCup();                           //Initialize the dicecup object
  diceCup.addDie(15);                                //Adds a number of dices to the dicecup
}

void draw() {
}                                        //Makes the program run

void mousePressed() {
  background(255);                                   //repainting the background
  diceCup.shake();                                   //Rerolls the dices
  diceCup.draw(75, 75, 75);                          //draws the dices
}

void keyPressed() {                                   //When a key is pressed
  int tast = keyCode;                                //Reads which key is pressed
  if (tast == 'W') diceCup.addDie(1);                //Adds a die to the dicecup
  else if (tast == 'R') diceCup.removeDie();          //Removes a die from the dicecup
}
