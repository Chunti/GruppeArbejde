class DiceCup{
  Die die;
  public DiceCup(){
  }
  
  public void addDie(int num){
    die = new Die((color)random(#000000,#FFFFFF),(color)random(#000000,#FFFFFF));
  }
  public void shake(){
    die.roll();
    //die.draw(100,100,200);
  }
  
  public void draw(int x, int y, int size){
    for(int i=0;i<1;i++){
      die.draw(x,y,size);
    }
  }
  
}
