/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

package estrutura_sequencial; 
import java.util.Scanner;
public class ex_quatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nmr_funcionario = 1;
        double hr_trabalho = sc.nextDouble();
        double recebe_hora = 10.00;
        double calculo = (hr_trabalho * recebe_hora);

        System.out.println("Numero funcionário: " + nmr_funcionario);
        System.out.println("Salario: R$ " + calculo);


    }
}
