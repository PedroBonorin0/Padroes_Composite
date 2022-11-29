package composite;

public abstract class Socio {
  private String nome;

  public Socio(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public abstract String getSocio();
}
