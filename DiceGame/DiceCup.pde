class DiceCup {
  ArrayList<Die> dices = new ArrayList<Die>();

  public DiceCup() {
  }

  public void addDie(int num) {
    for (int i=0; i<num; i++) {
      dices.add(new Die((color)random(#000000, #FFFFFF), (color)random(#000000, #FFFFFF)));
    }
  }

  public void shake() {
    for (int i =0; i<dices.size(); i++) {
      dices.get(i).roll();
    }
    //die.draw(100,100,200);
  }

  public void draw(int x, int y, int size) {
    int[] counter = {0, 0};
    for (int i=0; i<6; i++)
    {
      for (int j=0; j<dices.size(); j++) {
        if (dices.get(j).getDieValue()==i+1)
        {
          dices.get(j).draw(x*(counter[0]+1)+((size/2)*(counter[0]+1)), y*(counter[1]+1)+((size/2)*(counter[1]+1)), size);
          counter[0]++;
        }
      }
      if (counter[0]>0) {
        counter[0]=0;
        counter[1]++;
      }
    }
  }
}
