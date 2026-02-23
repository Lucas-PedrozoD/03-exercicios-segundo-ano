package exercicio01;

import java.util.Scanner;

public class Conta {

    // atributos ou propriedades ou vaiaveis de instancia
    String correntista;
    int numero;
    double saldo;


public void depositar( double valor){
    saldo += valor;
}

public void sacar(double valor ){
    saldo -= valor;
}

}