package scenarios;

import static driver.DriverFactory.getDriver;
import static java.lang.String.format;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.relopes.alelo.model.Diretor;
import br.com.relopes.alelo.model.Filme;
import core.BaseTest;
import page.GoogleResultPage;
import page.GoogleSearchPage;

/**
 *
 * Exercicio 1 (Parte 2/2)
 * construa um codigo de automação
 * (utilizar selenium, Junit e chromeDriver que busque no google o diretor e
 * o filme e retorne a quantidade aproximada de resultados para a busca.
 *
 * @author renato.lopes
 * @date 06/12/2019
 */
public class PesquisaFilmeGoogleTest extends BaseTest {

  private static final String BASE_URL = "https://www.google.com.br";

  private static List<Diretor> diretores;

  @BeforeClass
  public static void setUp() {
    // TODO Externalizar a massa de dados 'hardcoded'

    Diretor diretor1 = new Diretor();
    diretor1.setNome("Frank Darabont");
    diretor1.setDataNascimento("28/01/1959");
    diretor1.adicionarFilme(new Filme("À Espera de um Milagre", "1999"));
    diretor1.adicionarFilme(new Filme("Um Sonho de Liberdade", "1994"));

    Diretor diretor2 = new Diretor();
    diretor2.setNome("Quentin Tarantino");
    diretor2.setDataNascimento("27/03/1963");
    diretor2.adicionarFilme(new Filme("Pulp Fiction: Tempo de Violência", "1994"));

    diretores = Arrays.asList(diretor1, diretor2);
  }

  @Test
  public void devePesquisarPorDiretorEFilmeComSucesso() {

    Diretor diretor = diretores.get(1);

    GoogleSearchPage searchPage = new GoogleSearchPage(getDriver());

    GoogleResultPage resultPage = searchPage
        .open(BASE_URL)
        .pesquisarPor(format("%s - %s", diretor, diretor.getFilmes().get(0)));

    assertThat("Quantidade aproxima de resultados deve ser maior que zero",
        resultPage.getTotalResultadoAproximado(), greaterThan(0L));
  }

}
