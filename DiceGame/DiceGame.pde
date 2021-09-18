void setup() {
  size(800, 800);
  rectMode(CENTER);
  ellipseMode(CENTER);
  DiceCup diceCup = new DiceCup();
  diceCup.addDie(15);
  diceCup.shake();
  diceCup.draw(50, 50, 50);


  //die.roll();
  //println("der er rollet " + die.getDieValue);
  //die.draw(100,100,200);
}
