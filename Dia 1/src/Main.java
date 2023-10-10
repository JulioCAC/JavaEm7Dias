import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        float num1 = sc.nextFloat();
        System.out.print("Digite o segundo número: ");
        float num2 = sc.nextFloat();
        float soma = num1 + num2;
        System.out.print("A soma dos números é: ");
        System.out.print(soma);
        
    }
}