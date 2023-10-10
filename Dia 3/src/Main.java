import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        /*Forma que eu fiz: 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        String num1 = String.valueOf(num);
        int tamanho = num1.length();
        if (tamanho == 1)
        System.out.println("O número tem 1 digito");
        else if (tamanho == 2)
        System.out.println("O número tem 2 digitos");
        else if (tamanho == 3)
        System.out.println("O número tem 3 digitos");
        else if (tamanho == 4)
        System.out.println("O número tem 4 digitos");
        else
        System.out.println("O número tem 5 ou mais digitos");*/
        // Forma que o professor fez: 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        if (num >= 0 && num < 10 )
        System.out.println("O número tem 1 digito");
        else if (num >= 10 && num < 100 )
        System.out.println("O número tem 2 digitos");
        else if (num >= 100 && num < 1000 )
        System.out.println("O número tem 3 digitos");
        else if (num >= 1000 && num < 10000 )
        System.out.println("O número tem 4 digitos");
        else
        System.out.println("O número tem 5 ou mais digitos");
    }
}
