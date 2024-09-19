// Classe Moto que herda de Veiculo
public class Moto extends Veiculo {
    private boolean temCarenagem;

    // Construtor de Moto
    public Moto(String marca, String modelo, int ano, boolean temCarenagem) {
        super(marca, modelo, ano);  // Chama o construtor da classe base Veiculo
        this.temCarenagem = temCarenagem;
    }

    // Método para empinar a moto
    public void empinar() {
        System.out.println("A moto " + getModelo() + " está empinando.");
    }

    // Sobrescrita do método exibirInformacao
    @Override
    public void exibirInformacao() {
        super.exibirInformacao();  // Chama o método da classe base
        System.out.println("Tem carenagem: " + (temCarenagem ? "Sim" : "Não"));
    }

    // Getter e Setter para temCarenagem
    public boolean isTemCarenagem() {
        return temCarenagem;
    }

    public void setTemCarenagem(boolean temCarenagem) {
        this.temCarenagem = temCarenagem;
    }
}
