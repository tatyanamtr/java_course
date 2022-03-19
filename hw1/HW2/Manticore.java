package HW2;

public class Manticore extends Creature {

    public Manticore() {
        this.name ="Manticore";
        this.attackRange=15;
        this.defence=13;
        this.health=80;
        this.speed=7;
        this.minAttackForce=14;
        this.maxAttackForce=20;
        this.setPosition(25);

    }


    @Override
    public void superPower() {
        this.attack();
    }
}
