package br.com.relopes.alelo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renato.lopes
 * @date 06/12/2019
 */
public class Diretor implements Serializable {

  private String nome;
  private String dataNascimento;
  private List<Filme> filmes = new ArrayList<Filme>();

  public Diretor() {

  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public List<Filme> getFilmes() {
    return filmes;
  }

  public void setFilmes(List<Filme> filmes) {
    this.filmes = filmes;
  }

  public void adicionarFilme(Filme filme) {
    this.filmes.add(filme);
  }

  @Override
  public String toString() {
    return nome;
  }
}
