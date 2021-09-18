class DiceCup {
  ArrayList<Die> dices = new ArrayList<Die>();              //Makes the dices an arraylist, so we can add and remove the dices later

  public DiceCup() {
  }                                       //Constructor

  public void addDie(int num) {
    for (int i=0; i<num; i++) {
      dices.add(new Die((color)random(#000000, #FFFFFF), (color)random(#000000, #FFFFFF)));      //Adds a die with a random color for the eyes and the die
    }
  }

  public void removeDie()
  {
    if(dices.size()>0) dices.remove(dices.size()-1);         //removes the last die in the arrayList
  }

  public void shake() {
    for (int i =0; i<dices.size(); i++) {
      dices.get(i).roll();                                   //rerolls all the dices
    }
  }

  public void draw(int x, int y, int size) {
    int[] counter = {0, 0};                                  //Counters
    for (int i=0; i<6; i++)                                  //Runs once for all the eyes on a die
    {
      for (int j=0; j<dices.size(); j++) {                   //Runs for the amount of dices in our dicecup
        if (dices.get(j).getDieValue()==i+1)                 //If the die is equal to the amount of eyes we are checking for
        {
          dices.get(j).draw(x*(counter[0]+1)+((size/2)*(counter[0]+1)), y*(counter[1]+1)+((size/2)*(counter[1]+1)), size);    //Draws the dices on a line. Depends on how many dices of with that amount of eyes.
          counter[0]++;                                      //Count up for each die that have been drawn
        }
      }
      if (counter[0]>0) {                                    //If one or more dices have been drawn for that amount of eyes
        counter[0]=0;                                        //Resets one counter
        counter[1]++;                                        //+1 so we go to the next line.
      }
    }
  }
}
