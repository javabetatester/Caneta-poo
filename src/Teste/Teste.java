package Teste;

import caneta.Caneta;

public class Teste {
    public static void main(String[] args) {
        // Instanciando uma caneta
        Caneta c1 = new Caneta();

        // Configurando os atributos
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5F;
        c1.carga = 90;
        c1.tampada = true;

        // Usando os métodos da classe Caneta
        c1.status();
        c1.destampar();
        c1.rabiscar();
        c1.status();

        // Criando uma segunda caneta
        Caneta c2 = new Caneta();
        c2.modelo = "Faber Castell";
        c2.cor = "Vermelha";
        c2.ponta = 0.5F;
        c2.tampada = false;

        c2.status();
        c2.rabiscar();
        c2.tampar();
    }
}