package br.com.relopes.alelo.core;

import java.util.Scanner;

import br.com.relopes.alelo.model.Diretor;
import br.com.relopes.alelo.model.Filme;

/**
 *
 * Exercicio 1 (Parte 1/2)
 * Uma empresa de filmes, contratou um sistema da sua empresa - considerando que
 * existe a necessidade de cadastrar diretor (nome, nascimento) e filmes (nome, ano de lançamento)
 *
 * @author renato.lopes
 * @date 06/12/2019
 */
public class CadastraDiretor {

  private static Scanner sc = new Scanner(System.in);
  private static Diretor diretor = new Diretor();

  public static void main(String[] args) {

    int opcao = -1;

    while (opcao != 0) {

      menu();

      opcao = Integer.parseInt(sc.nextLine());

      switch (opcao) {
        case 1:
          cadastrar();
          break;
        case 2:
          consultar();
          break;
        case 0:
          System.out.println("Ate a proxima!");
          sc.close();
          break;
        default:
          System.err.println("Opcao (" + opcao + ") invalida!");
      }

    }
  }

  private static void menu() {
    System.out.println();
    System.out.println("*************** SISTEMA DE CADASTRO DE FILMES ***************");
    System.out.println("1 - Cadastrar");
    System.out.println("2 - Consultar");
    System.out.println("0 - Sair");
    System.out.println();

    System.out.print("Digite a opcao: ");
  }

  private static void cadastrar() {
    System.out.println();
    System.out.println("*************** NOVO CADASTRO ***************");

    cadastarDiretor();
    cadastrarFilmes();

    System.out.println();
  }

  private static void cadastarDiretor() {

    System.out.print("Digite o nome do diretor: ");
    String nomeDiretor = sc.nextLine();

    System.out.print("Digite a data de nascimento do diretor (dd/mm/aaaa): ");
    String dataNascimentoDiretor = sc.nextLine();

    diretor.setNome(nomeDiretor);
    diretor.setDataNascimento(dataNascimentoDiretor);
  }

  private static void cadastrarFilmes() {

    int opcao = -1;

    while (opcao != 2) {

      System.out.println("Deseja adicionar um novo filme? ");
      System.out.println("1 - Sim");
      System.out.println("2 - Nao");
      System.out.println();

      System.out.print("Digite a opcao: ");

      opcao = Integer.parseInt(sc.nextLine());

      switch (opcao) {
        case 1:
          System.out.println();
          System.out.print("Digite o nome do filme: ");
          String nomeFilme = sc.nextLine();

          System.out.print("Digite o ano de lancamento deste filme: ");
          String anoLancamentoFilme = sc.nextLine();

          diretor.adicionarFilme(new Filme(nomeFilme, anoLancamentoFilme));
          System.out.println();
          break;
        case 2:
          System.out.println();
          System.out.println("Voltando para o menu principal...");
          break;
        default:
          System.err.println("Opcao (" + opcao + ") invalida!");
      }
    }

  }

  private static void consultar() {
    System.out.println();
    System.out.println("*************** CONSULTA ***************");
    System.out.println(diretor);
    System.out.println(diretor.getFilmes().size() + " filmes cadastrados: ");
    diretor.getFilmes().forEach(System.out::println);
  }

}
