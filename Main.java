// Classe Main para testar o código
public class Main {
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        carro.exibirInformacao();
        carro.acelerar();
        carro.abrirPortaMalas();

        System.out.println(); // Linha em branco para separar os resultados

        // Criando um objeto Moto
        Moto moto = new Moto("Yamaha", "MT-07", 2019, true);
        moto.exibirInformacao();
        moto.acelerar();
        moto.empinar();
    }
}
