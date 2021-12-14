public class Kagtha extends NPC{

    public Kagtha() {
        super.name = "Kagtha";
        super.hp = 500;
        super.strength = 100;
        super.defence = 100;
        super.lvl = 30;
    }

    public void dialog1(){
        System.out.println("I miss the days when legions of powerful ogres marched by the Horde's side into battle, " +
                            "the pathetic Alliance cowering at their ferocity. " +
                            "Perhaps those days will return before I am gone to the ancestors. " +
                            "\nHowever, that is not the case now. " +
                            "An ogre magi, Glubtok, has joined forces with the despicable " +
                            "Defias Brotherhood and acts as Foreman over their mining operations. " +
                            "The pathetic fool! End his life for me, and for the spirit and glory of the Horde!");
    }

    public void dialog2(String PCname){
        System.out.println("Do not be alarmed, " + PCname + " . I am close to you, waiting in the shadows. " +
                "You've done well.\n" +
                "You must continue the mission here - " +
                "I am too valuable to risk my life against petty criminals like these.");
    }

    public void dialog3(){
        System.out.println("Lok'tar ogar!");
    }
}
