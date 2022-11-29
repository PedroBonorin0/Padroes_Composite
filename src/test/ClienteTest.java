package test;

import composite.Cliente;
import composite.Clube;
import composite.Dependente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

  @Test
  void deveRetornarSociosEDependentes() {
    Cliente cliente1 = new Cliente("Gilberto");
    Dependente dep11 = new Dependente("Pedro", "Filho");
    Dependente dep12 = new Dependente("Carlos", "Filho");
    Dependente dep13 = new Dependente("Maria", "Filho");
    cliente1.addSocio(dep11);
    cliente1.addSocio(dep12);
    cliente1.addSocio(dep13);

    Cliente cliente2 = new Cliente("Luis");
    Dependente dep21 = new Dependente("Simone", "Esposa");
    Dependente dep22 = new Dependente("Vitor", "Filho");
    cliente2.addSocio(dep21);
    cliente2.addSocio(dep22);

    Cliente socios = new Cliente("Lista de Sócios:");
    socios.addSocio(cliente1);
    socios.addSocio(cliente2);

    Clube clube = new Clube();
    clube.setSocios(socios);

    assertEquals("Socio: Lista de Sócios:\n" +
            "Socio: Gilberto\n" +
            "Dependente: Pedro - Filho\n" +
            "Dependente: Carlos - Filho\n" +
            "Dependente: Maria - Filho\n" +
            "Socio: Luis\n" +
            "Dependente: Simone - Esposa\n" +
            "Dependente: Vitor - Filho\n", clube.getSocios());
  }

  @Test
  void deveRetornarExecacaoClubeSemSocio() {
    try {
      Clube clube = new Clube();
      clube.getSocios();
      fail();
    }
    catch (NullPointerException e) {
      assertEquals("Clube sem Sócios", e.getMessage());
    }
  }
}