package ConceitoA1;

public class Celular {
    public String modeloCelular;
    public String marcaCelular;
    public String corCelular;
    public boolean telaCelular;
    public boolean bateriaCelular;
    public String cargaCelular;

    public void statusCelular() {
        System.out.println("------- STATUS DO CELULAR -------");
        System.out.println("Modelo: " + this.modeloCelular);
        System.out.println("Marca: " + this.marcaCelular);
        System.out.println("Cor: " + this.corCelular);
        System.out.println("Tela: " + this.telaCelular);
        System.out.println("Bateria: " + this.bateriaCelular);
        System.out.println("Carga: " + this.cargaCelular);
    }
    public void verMensagem(){
        if (this.telaCelular == true) {
            System.out.println("Consigo ver a mensagem, bacana!");}
        else {
            System.out.println("Tesla desligada...");}
    }

    public void verBateria(){
        if (this.bateriaCelular == true) {
            System.out.println("Consigo ver a bateria!");
        } else {
            System.out.println("Infelizmente não tem bateria.");
        }
    }

    public void verCarga(){
        if (this.bateriaCelular == true) {
            this.cargaCelular = ("100%");
        } else {
            this.cargaCelular = ("0%");
        }
    }

}