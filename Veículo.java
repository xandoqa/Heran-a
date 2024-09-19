
// Classe base Veiculo
public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor da classe Veiculo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para simular aceleração
    public void acelerar() {
        System.out.println("O veículo " + modelo + " está acelerando.");
    }

    // Método para exibir as informações do veículo
    public void exibirInformacao() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    // Getters e Setters (Boas práticas de encapsulamento)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
