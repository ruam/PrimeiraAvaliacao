import static org.junit.Assert.*;
import org.junit.Test;
public class EstatisticasSimplesTest {
	@Test
	public void deveCalcularValorMinimoEntreDoisValores() {
	double valoresDeEntrada[] = {9,5};
	double valorMinimoCalculado = EstatisticasSimples.calculaValorMinimo(valoresDeEntrada);
	assertEquals(5, valorMinimoCalculado, 0);
	}

	@Test
	public void deveCalcularValorMaximoEntreDoisValores() {
	double valoresDeEntrada[] = {5,9};
	double valorMinimoCalculado = EstatisticasSimples.calculaValorMaximo(valoresDeEntrada);
	assertEquals(9, valorMinimoCalculado, 0);
	}

	@Test
	public void deveCalcularQuantidadeDeValores() {
	double valoresDeEntrada[] = {9,5};
	int quantidadeDeValores = EstatisticasSimples.calculaQuantidade(valoresDeEntrada);
	assertEquals(2, quantidadeDeValores);
	}

	@Test
	public void deveCalcularMediaDeDoisValores() {
	double valoresDeEntrada[] = {9,5};
	double mediaDeValores = EstatisticasSimples.calculaMedia(valoresDeEntrada);
	assertEquals(7, mediaDeValores, 0);
	}

	@Test
	public void deveEfetuarTodosCalculosParaDoisValores() {
	double valoresDeEntrada[] = {9,5};
	double valoresDeSaida[] = EstatisticasSimples.calcula(valoresDeEntrada);
	assertArrayEquals(new double[] {5,9,2,7}, valoresDeSaida, 0);
	}
	@Test
	public void deveCalcularValorMinimoEntreDezValores() {
	double valoresDeEntrada[] = {1024,512,254,128,64,32,16,2,4,8};
	double valorMinimoCalculado = EstatisticasSimples.calculaValorMinimoDez(valoresDeEntrada);
	assertEquals(2, valorMinimoCalculado, 0);
	}
	@Test
	public void deveCalcularValorMaximoEntreDezValores() {
	double valoresDeEntrada[] = {1024,512,254,128,64,32,16,2,4,8};
	double valorMaximoCalculado = EstatisticasSimples.calculaValorMaximoDez(valoresDeEntrada);
	assertEquals(1024, valorMaximoCalculado, 0);
	}
	@Test
	public void deveCalcularMediaEntreDezValores() {
	double valoresDeEntrada[] = {1024,512,254,128,64,32,16,2,4,8};
	double valorMediaCalculado = EstatisticasSimples.calculaValorMediaDez(valoresDeEntrada);
	assertEquals(204.4, valorMediaCalculado, 0);
	}
	@Test
	public void deveEfetuarTodosCalculosParaDezValores() {
	double valoresDeEntrada[] = {1024,512,254,128,64,32,16,2,4,8};
	double valoresDeSaida[] = EstatisticasSimples.calculaDez(valoresDeEntrada);
	assertArrayEquals(new double[] {2,1024,204.4}, valoresDeSaida, 0);
	}
}

