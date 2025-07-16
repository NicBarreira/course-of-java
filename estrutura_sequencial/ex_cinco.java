/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/

package estrutura_sequencial;
import java.util.Scanner;
public class ex_cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod_peca_um = 1;
        int qtd_peca_um = sc.nextInt();
        double valor_peca_um = 5.30;
        double valor_total_peca_um = qtd_peca_um * valor_peca_um;
        
        int cod_peca_dois = 2;
        int qtd_peca_dois = sc.nextInt();
        double valor_peca_dois = 5.30;
        double valor_total_peca_dois = qtd_peca_dois * valor_peca_dois;

        double valor_total = valor_total_peca_um + valor_total_peca_dois;

        System.out.println("Valor a pagar: " + valor_total);


    }
}
