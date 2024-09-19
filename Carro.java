// Classe Carro que herda de Veiculo
public class Carro extends Veiculo {
    private int portas;

    // Construtor de Carro
    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);  // Chama o construtor da classe base Veiculo
        this.portas = portas;
    }

    // Método para abrir o porta-malas
    public void abrirPortaMalas() {
        System.out.println("O porta-malas do " + getModelo() + " está aberto.");
    }

    // Sobrescrita do método exibirInformacao
    @Override
    public void exibirInformacao() {
        super.exibirInformacao();  // Chama o método da classe base
        System.out.println("Número de portas: " + portas);
    }

    // Getter e Setter para portas
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
