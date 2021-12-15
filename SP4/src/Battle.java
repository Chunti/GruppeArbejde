public class Battle {
    PC player;
    Enemies enemies;
    Attack attack;
    public Battle(PC player, Enemies enemies) {
        this.player = player;
        this.enemies = enemies;
        attack = new Attack(player,enemies);
    }

    public boolean attackEnemies(){
        boolean enemyIsDead = attack.playerAttack();
        return enemyIsDead;
    }

    public boolean attackPlayer(){
        boolean playerIsDead = attack.enemiesAttack();
        return playerIsDead;
    }

    public boolean flee(){
        int number = (player.lvl - enemies.lvl) *2;
        int fleenumber = (int)(10*Math.random()+1);
        return fleenumber >= 6 + number;
    }

    public void finishBattle(){
        System.out.println("You killed the monster! You gained " + enemies.getExperience() + " experience");
        player.gainExperience(enemies.getExperience());
        int itemRoll = (int)(100*Math.random()+1);
        if (itemRoll <100) {
            player.inventory.addItem();
            System.out.println("You received an item!");
        }

    }
}
