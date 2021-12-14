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

        enemies.damageTaken = damage-(enemies.defence/2);
        return enemies.hp < enemies.damageTaken;
    }

    public boolean enemiesAttack() {
        int enemiesStrength = enemies.strength;
        int diceDamage = (int)(6*Math.random());
        int damage = diceDamage+(enemiesStrength/2);

        player.damageTaken = damage-(player.defence/2);
        return player.hp < player.damageTaken;
    }
}
