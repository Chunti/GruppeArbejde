public class Battle {
    PC player;
    Enemies enemies;
    Attack attack;
    public Battle(PC player, Enemies enemies) {
        this.player = player;
        this.enemies = enemies;
        Attack attack = new Attack(player,enemies);
    }

    public boolean attackEnemies(){
        boolean enemyIsDead = attack.playerAttack();
        if (enemyIsDead)player.experience += enemies.experience;
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


}
