package br.com.relopes.alelo.model;

import java.io.Serializable;

/**
 *
 * @author renato.lopes
 * @date 06/12/2019
 */
public class Filme implements Serializable {

  private String nome;
  private String anoLancamento;

  public Filme() {

  }

  public Filme(String nome, String anoLancamento) {
    this.nome = nome;
    this.anoLancamento = anoLancamento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getAnoLancamento() {
    return anoLancamento;
  }

  public void setAnoLancamento(String anoLancamento) {
    this.anoLancamento = anoLancamento;
  }

  @Override
  public String toString() {
    return String.format("%s (%s)", nome, anoLancamento);
  }
}
