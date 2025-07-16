/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */

package estrutura_condicional;
import java.util.Scanner;
public class ex_um {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x > 0 ){
            System.out.println("Positivo");
        }
        else{
            System.out.println("Negativo");
        }

    }
    
}
