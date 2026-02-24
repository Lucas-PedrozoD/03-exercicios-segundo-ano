package exercicio02;

public class Paciente {
    String nome;
    int idade;

    public int maxima (){
        return  220 - idade;
    }

    public double[] freqAlvo (){
        double[] alvo = new double[2];
        double fm = maxima();
        alvo[0]=fm* 0.5;
        alvo[1]=fm * 0.85;
        return alvo;

    }
}
