package BATLE;

import java.util.Scanner;

public class test {
    private static final  String GREATING = "WELCOME TO THE BATLE";
    static Scanner scanner = new Scanner(System.in);
    static {
        System.out.println(GREATING);
    }


    public static void main(String[] args) {




            System.out.println("Give a name to your archer");
            String name1 = scanner.nextLine();
            Archer archer1 = new Archer(name1);
            Archer archer2 = new Archer("Voladar");

            batle(archer1,archer2);

        }


    public static boolean oneIsDead(Archer a1, Archer a2){
        if(a1.getHealth()<0||a2.getHealth()<0) {
            System.out.println("BATLE IS ENDED");
            return true;
        }
        return false;
    }

    public static void batle(Archer archer1, Archer archer2) {
        while (!oneIsDead(archer1, archer2)) {
            System.out.println("Make shoot");
            String comand = scanner.nextLine();
            while (true) {
                if(comand.equalsIgnoreCase("exit")){break;}
                else if (comand.equalsIgnoreCase("shoot")) {
                    archer1.shoot(archer2);
                    break;
                } else System.out.println("wrong comand");
                comand = scanner.nextLine();
            }
            if(comand.equalsIgnoreCase("exit")){break;}
            if(oneIsDead(archer1,archer2))break;
            System.out.println("Voladar is shooting....");
            archer2.shoot(archer1);


        }
    }
}


