/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 6nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */
package estrutura_condicional;
import java.util.Scanner;

public class ex_seis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nmr = sc.nextDouble();

        if (nmr >= 0 && nmr <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (nmr > 25 && nmr <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (nmr > 50 && nmr <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (nmr > 75 && nmr <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}