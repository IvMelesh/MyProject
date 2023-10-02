package MyWorks;
import java.io.IOException;
import java.util.Scanner;


public class Calculator {
    private static Scanner scanner = new Scanner(System.in);
     {
        System.out.println("Добро пожаловать в КАЛЬКУЛЯТОР!");
         System.out.println("Для начала работы введите команду \\start");
         try {
             checkStart();
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }
     }

     static void checkStart() throws IOException {
         String line= "";
         while (!((line = scanner.nextLine()).equals("\\start"))){
             System.out.println("Неправильная команда.Повторите команду!");
         }
         startCalc();
    }
    static void startCalc() throws IOException {
        double num1 = getNum();
        double num2 = getNum();
        char op = getOp();
        double result = calculate(num1,num2,op);
        printResult(result);

    }

    private static double getNum(){
        System.out.println("Введите число");
        double num;
        if(scanner.hasNextDouble()){
            num=scanner.nextDouble();
        }
        else {
            System.out.println("Неверное число.Повторите ввод");
            scanner.next();
            num = getNum();
        }
        return num;


    }

    private static char getOp(){
        System.out.println("Введите операцию");
        char opTmp = scanner.next().charAt(0);
        char op;
        if(opTmp=='+'||opTmp=='-'||opTmp=='/'||opTmp=='*'){
            op = opTmp;
        }
        else {
            System.out.println("Несуществующая операция, повторите ввод");
            op = getOp();
        }
        return op;
    }

    private static double calculate(double num1,double num2,char op){
         double result;
         switch (op){
             case '+':result = num1+num2;break;
             case '-':result = num1-num2;break;
             case '/':result = num1/num2;break;
             case '*':result = num1*num2;break;
             default:result=0;
         }
         return result;
    }

    private static void printResult(double result){
         String line = String.valueOf(result);
        String[] array = line.split("\\.");
        String check = array[1];
        for (int i =0;i<check.length();i++){
            if(check.charAt(i)=='0') {
                if(i==(check.length()-1)){
                    Integer a = (int) result;
                    System.out.printf("Результат:%d", a);
                }
                continue;
            }
            else System.out.printf("Результат:%f", result);break;
        }


    }

}


