import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1. Additon \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exit");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter two Numbers");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    int a = num1 + num2;
                    System.out.println("\n" + a);
                    break;

                case 2:
                    System.out.println("Enter two Numbers");
                    int num3 = sc.nextInt();
                    int num4 = sc.nextInt();
                    int b = num3 - num4;
                    System.out.println("\n" + b);
                    break;

                case 3:
                    System.out.println("Enter two Numbers");
                    int num5 = sc.nextInt();
                    int num6 = sc.nextInt();
                    int c = num5 * num6;
                    System.out.println("\n" + c);
                    break;

                case 4:
                    System.out.println("Enter two Numbers");
                    int num7 = sc.nextInt();
                    int num8 = sc.nextInt();
                    if(num7 != 0 && num8 == 0) throw new Exception("Can't divide a number by zero..");
                    int d = num7 / num8;
                    System.out.println("\n" + d);
                    break;

                case 5: System.exit(0);
            }
        }
    }
}