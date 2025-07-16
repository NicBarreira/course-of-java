/*
 *Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

package estrutura_sequencial;
import java.util.Scanner;
public class ex_seis {
    public static void main(String[] args) {
        double a, b ,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();


        double area_triangulo = (a*c) / 2;
        double area_circulo = Math.PI * Math.pow(c, 2);
        double area_trapezio = (a + b) * c /2;
        double area_quadrado = b*b;
        double area_retangulo = b*a; 


        System.out.println("TRIANGULO = " + area_triangulo);
        System.out.println("CIRCULO = " + area_circulo);
        System.out.println("TRAPEZIO = " + area_trapezio);
        System.out.println("QUADRADO = " + area_quadrado);
        System.out.println("RETANGULO = " + area_retangulo);
    }   
}
