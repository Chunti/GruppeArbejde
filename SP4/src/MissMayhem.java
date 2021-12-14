public class MissMayhem extends Allies{
    public MissMayhem() {

        super.name = "MissMayhem";
        super.hp = 500;
        super.strength = 100;
        super.defence = 100;
        super.lvl = 30;
    }

    public void dialog1(){
        System.out.println("Time is money friend");
    }
    public void dialog2(){
        System.out.println("Run along now");
    }
    public void dialog3(){
        System.out.println("Hey there, we need your help!");
    }
    public void dialog4(){
        System.out.println("This is Deadmines. After chaos of the First War, " +
                            "the mines were abandoned and later thought to be haunted, " +
                            "leaving them relatively untouched." +
                            " Captain Bramblebeard and his crew inhabited the cave for a time until the " +
                            "Defias Brotherhood — a group of former laborers turned brigands - " +
                            "claimed the labyrinth as a base of operations and killed the captain and the crew. " +
                            "Their ambitious leader, Edwin VanCleef, was constructing a juggernaught " +
                            "at the bottom of the mines with the aid of the goblins. " +
                            "During his time living there, Edwin cheated the Bloodsail pirate Jerias Bloodvein. " +
                            "Edwin took not only the pirate's money, but also a woman Jerias had fancied. " +
                            "In retaliation, Jerias prepared to invade the Deadmines. " +
                            "Starting from Moonbrook, he and his crew descended down into the mines, " +
                            "killing Rhahk'Zor, Sneed, and Gilnid. " +
                            "All was according to plan until James Blackridge went behind the captain's back " +
                            "to rescue his parents. The two fought, and ultimately James beheaded Jerias. " +
                            "While James, his friends, and his family escaped the mine, " +
                            "the fate of Jerias's crew is unknown.");
    }
}
