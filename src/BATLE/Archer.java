package BATLE;
public class Archer implements Shooter{
    private String name;
    private int health = 100;


    public Archer(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }
    @Override
    public void shoot(Archer enemy) {
        enemy.health = (int) (enemy.health - (Math.random() * 10));
        if(enemy.health>0){
        System.out.println(enemy.name+" "+"health:"+enemy.health);}
        else
            System.out.println(enemy.name+" "+"dead");

    }
}
