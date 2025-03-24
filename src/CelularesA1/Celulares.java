package ConceitoA1;

public class Celulares {
    public static void main(String[] args) {
        // Criando o primeiro celular
        Celular c1 = new Celular();
        c1.modeloCelular = "Galaxy S22";
        c1.marcaCelular = "Samsung";
        c1.corCelular = "Preto";
        c1.telaCelular = true;
        c1.bateriaCelular = true;
        c1.verCarga(); // Vai definir a carga como 100%

        // Mostrar status do celular
        c1.statusCelular();

        // Testando os métodos
        c1.verMensagem();
        c1.verBateria();

        System.out.println("\n--- Segundo celular ---\n");

        // Criando o segundo celular
        Celular c2 = new Celular();
        c2.modeloCelular = "iPhone 14";
        c2.marcaCelular = "Apple";
        c2.corCelular = "Branco";
        c2.telaCelular = false;
        c2.bateriaCelular = false;
        c2.verCarga(); // Vai definir a carga como 0%

        // Mostrar status do celular
        c2.statusCelular();

        // Testando os métodos
        c2.verMensagem();
        c2.verBateria();
    }
}