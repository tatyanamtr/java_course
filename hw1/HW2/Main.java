package HW2;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        start();
    }



    public static void start() throws InterruptedException {
        Minotaur minotaur = new Minotaur();
        Creature manticore = new Manticore();
        minotaur.enemy = manticore;
        manticore.enemy=minotaur;

        while (minotaur.health>0 && manticore.health>0) {

            if (Math.random() <= 0.5) {
                minotaur.action();
            } else {
                manticore.action();
            }
            Thread.sleep(1000);


        }
    }

}
