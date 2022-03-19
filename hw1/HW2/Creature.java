package HW2;

import java.util.Random;

public abstract class Creature implements Fightable{
    String name;
    int attackRange;
    int defence;
    int attackForce;
    int minAttackForce;
    int maxAttackForce;
    int health;
    int speed;
    Creature enemy;
    private int position;

    public int setPosition(int pos) {
        this.position = pos;
        return this.position;
    };
    public int getPosition() {
        return this.position;
    }

    public int getAttackForce() {
        return this.attackForce;
    }

    public void setAttackForce() {
        this.attackForce = (int) ((Math.random() * (this.maxAttackForce-this.minAttackForce) ) + this.minAttackForce);
    }

    public Creature() {
    }

    public void attack() {
        if (Math.abs(this.getPosition()-enemy.getPosition())>this.attackRange) {
            this.move();
        } else {
            this.setAttackForce();
            System.out.print(this.name + " attacks. ");
            if(this.getAttackForce()-enemy.defence<=0) {
                System.out.print(enemy.name + " defends and takes no damage. ");
                System.out.println(enemy.name + "'s health is " + enemy.health);
            } else {
                enemy.health -= (this.getAttackForce() - enemy.defence);
                if (enemy.health <= 0) {
                    enemy.die();
                } else {
                    System.out.print(enemy.name + " takes " + (this.getAttackForce() - enemy.defence) + " damage. ");
                    System.out.println(enemy.name + "'s health is " + enemy.health);
                }
            }

        }
    }

    public void die() {
        System.out.println(this.name + " is dead :(");
    }
    public void action() {
//        this.attack();
        Random rnd = new Random();
        if (Math.random() <= 0.1) {
           this.superPower();
       } else {
           this.attack();
       }
    }

    void move() {
        System.out.print(this.name + " is moving. ");
        if(this.getPosition()< enemy.getPosition()) {
            this.setPosition(this.getPosition()+this.speed);
            System.out.println(this.name + "'s position is " + this.getPosition());
        } else {
            this.setPosition(this.getPosition()-this.speed);
            System.out.println(this.name + "'s position is " + this.getPosition());
        }
    };
}
