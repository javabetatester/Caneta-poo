package caneta;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

    public void status() {
        System.out.println("------- STATUS DA CANETA -------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada: " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO! Não posso rabiscar com a caneta tampada");
        } else {
            System.out.println("Estou rabiscando...");
        }
    }

    public void tampar() {
        this.tampada = true;
        System.out.println("Caneta tampada");
    }

    public void destampar() {
        this.tampada = false;
        System.out.println("Caneta destampada");
    }
}