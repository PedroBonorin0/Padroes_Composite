package composite;

public class Dependente extends Socio{
  private String nome;
  private String relacao;

  public Dependente(String nome, String relacao) {
    super(nome);
    this.relacao = relacao;
  }

  @Override
  public String getSocio() {
    return "Dependente: " + this.getNome() + " - " + this.relacao + "\n";
  }
}
