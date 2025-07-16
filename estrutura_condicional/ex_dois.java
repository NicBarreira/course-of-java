/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
package estrutura_condicional;
import java.util.Scanner;
public class ex_dois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    }
}
