package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();
        double [] alvo;


        System.out.print("Nome -->");
        paciente.nome=sc.next();

        System.out.print("Idade -->");
        paciente.idade=sc.nextInt();
        alvo  = paciente.freqAlvo();
        System.out.println(paciente.nome);
        System.out.println("Frequencia maxima: " + paciente.maxima());
        System.out.println("Sua frequencia alvo está entre " + "\n50% --> " +alvo[0] + "\n85% --> " + alvo[1]);

    }
}
