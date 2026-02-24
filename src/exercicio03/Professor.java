package exercicio03;

public class Professor {
    String nome;
    int totalDeAulas;
    Double valorAula;

    public double calcularSalario (){
        double salariobase;
        double horaAtividade;
        double descansoSemanal;
        salariobase = totalDeAulas * valorAula * 4.5;
        horaAtividade = salariobase * 0.05;
        descansoSemanal= (salariobase + horaAtividade) / 6;
        return salariobase + horaAtividade + descansoSemanal;
    }



}
