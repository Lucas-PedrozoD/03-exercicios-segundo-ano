package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor professor= new Professor();

        System.out.print("Nome -->");
        professor.nome=sc.next();
        System.out.print("Total de Aulas semanal-->");
        professor.totalDeAulas=sc.nextInt();
        System.out.print("Valor da sua Hora/Aula -->");
        professor.valorAula= sc.nextDouble();

        System.out.println("Professor(a) "+ professor.nome);
        System.out.println("Seu salário bruto --> $ " + professor.calcularSalario());
    }
}
