public class Attack {
    PC player;
    Enemies enemies;


    public Attack(PC player, Enemies enemies) {
        this.player = player;
        this.enemies = enemies;
    }

    public boolean playerAttack(){
        int weaponDamage = player.weapon.damage;
        int armorDamage = player.armor.damage;
        int playerStrength = player.strength;
        int diceDamage = (int)(6*Math.random());
        int damage = weaponDamage+armorDamage+diceDamage+(playerStrength/2);
        int totalDamage = damage-(enemies.defence/2);

        if(totalDamage <=0) {
            System.out.println("Attack missed");
            return false;
        }
        else{
            enemies.damageTaken += totalDamage;

            System.out.println("You dealt " + (damage-(enemies.defence/2)) + " damage to the monster.");
            return enemies.hp < enemies.damageTaken;
        }

    }

    public boolean enemiesAttack() {
        int enemiesStrength = enemies.strength;
        int diceDamage = (int)(6*Math.random());
        int damage = diceDamage+(enemiesStrength/2);
        int totalDamage = damage-(player.defence/2);

        if(totalDamage <= 0){
            System.out.println("The " + enemies.name + " attaked, but you dodged the attack");
            return false;
        }
        else{
            player.damageTaken += totalDamage;
            System.out.println("The " + enemies.name +" hits you and dealt " + (damage-(player.defence/2))+ " damage." +
                    "\nYou now have " + (player.hp-player.damageTaken) + " HP left");
            return player.hp < player.damageTaken;
        }
    }
}
