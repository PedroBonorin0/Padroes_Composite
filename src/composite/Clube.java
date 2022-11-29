package composite;

public class Clube {
  private Socio socios;

  public void setSocios(Socio socios) {
    this.socios = socios;
  }

  public String getSocios() {
    if (this.socios == null) {
      throw new NullPointerException("Clube sem Sócios");
    }
    return this.socios.getSocio();
  }
}
