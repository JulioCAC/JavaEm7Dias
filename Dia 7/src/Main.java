import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        //Desafio 1 do dia 7
        Scanner sc = new Scanner(System.in);
        System.out.println("Desafio 1: ");
        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite um numero: ");
        int n2 = sc.nextInt();
        System.out.println("Digite um numero: ");
        int n3 = sc.nextInt();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        //Desafio 2 do dia 7
        System.out.println("Desafio 2: ");
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        if (n % 2 != 0){
            System.out.println("Impar");
        }
        else {
            if (n >= 2 && n < 5){
            System.out.println("A");
            }
            else if (n >= 6 && n <= 20){
            System.out.println("B");
            }
             else{
            System.out.println("C");
            }
        }

        //Desafio 3 do dia 7
        System.out.println("Desafio 3: ");
        System.out.println("Digite um número: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite a operação que deseja fazer (*, +, -, /):");
        char op = sc.next().charAt(0);
        System.out.println("Digite um número: ");
        double num2 = sc.nextDouble();

        if (op == '*') {
            System.out.println(num1 * num2);
        }

        else if (op == '+') {
            System.out.println(num1 + num2);
        }

        else if (op == '-') {
            System.out.println(num1 - num2);
        }

        else if (op == '/') {
            System.out.println(num1 / num2);
        }
 
        else { 
            System.out.println("escolha invalida");
        }



    }
}
