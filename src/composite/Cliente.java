package composite;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Socio{
  private List<Socio> socios;

  public Cliente(String nome) {
    super(nome);
    this.socios = new ArrayList<Socio>();
  }

  @Override
  public String getSocio() {
    String saida = "";
    saida = "Socio: " + this.getNome() + "\n";
    for (Socio socio : socios) {
      saida += socio.getSocio();
    }
    return saida;
  }

  public void addSocio(Socio socio) {
    this.socios.add(socio);
  }
}
