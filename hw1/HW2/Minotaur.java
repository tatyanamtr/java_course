package HW2;

public class Minotaur extends Creature {

    public Minotaur() {
        this.name ="Minotaur";
        this.attackRange=14;
        this.defence=12;
        this.health=50;
        this.speed=6;
        this.minAttackForce=12;
        this.maxAttackForce=20;
        this.setPosition(0);

    }


    @Override
    public void superPower() {
        if(this.health<=30) {
            this.health+=20;
        } else {
            this.health=50;
        }
        System.out.println(this.name + " heals himself! " + this.name + "'s health is " + this.health);

    }
}
