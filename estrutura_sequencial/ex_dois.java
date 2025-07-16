/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.*/

package estrutura_sequencial; 

import java.util.Scanner;

public class ex_dois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double area_circulo = Math.PI * Math.pow(raio, 2);

        System.out.println("A= " + area_circulo);
        
    }
}
