package br.com.isabela.steps;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import atu.testrecorder.ATUTestRecorder;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import paginas.pedido;
import util.Reutilizaveis;
import cucumber.api.java.pt.E;

public class DesafioAutomacaoSteps2 extends pedido {

	Reutilizaveis util = new Reutilizaveis();

	@Dado("^que estou no site da Nagem$")
	public void que_estou_no_site_da_Nagem() throws Throwable {
		// util.iniciarGravacao();
		openBrowse();
		// CopiarTela("Tela inicial do Site");
	}

	@Quando("^faco a busca do produto \"([^\"]*)\"$")
	public void faco_a_busca_do_produto(String arg1) throws Exception {
		try {
			pesquisarProduto(arg1);
			// CopiarTela("faco a busca do produto");
		} catch (Exception e) {
			// TODO: handle exception
			// CopiarTela("ERRO: faco a busca do produto");
			throw new Exception("Problema na execu��o deste passo:  >>>>  " + e.toString());
		}
	}

	@E("^escolho um produto na lista$")
	public void escolho_um_produto_na_lista() throws Throwable {
		escolhoProdutoLista();
	}

	@E("^adiciono no carrinho$")
	public void adiciono_no_carrinho() throws Throwable {

		adicionoCarrinho();
	}

	@Então("^meu carrinho devera ter (\\d+) só produto$")

	public void valido_produto_no_carrinho(String arg1) throws Throwable {

		validoProdutoCarrinho(arg1);

		CopiarTela("faco a busca do produto");

		navegador.quit();
		// gravavideo.stop();

	}

	@Quando("^faco a busca por dois produtos \"([^\"]*)\"$")
	public void faco_a_busca_por_dois_produtos(String arg2) throws Throwable {

		Thread.sleep(3000);
		navegador.navigate().to("https://nagem.com.br/");
		navegador.findElement(By.id("buscaGeral")).clear();
		navegador.findElement(By.id("buscaGeral")).sendKeys("Teclado Sem Fio p/ PS3");
		navegador.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/div[2]/div[2]/div/form/div/span/button")).click();

	}

	@Quando("^escolho produtos na lista$")
	public void escolho_produtos_na_lista() throws Throwable {
		navegador.findElement(By.xpath("//*[@id=\"prodList_1\"]/div/div[1]/img")).click();
	}

	@Quando("^adicionos no carrinho$")
	public void adicionos_no_carrinho() throws Throwable {

		WebDriverWait wait2 = new WebDriverWait(navegador, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("btnComprar"))).click();
		Thread.sleep(30);
	}

	@Então("^meu carrinho devera ter dois produto$")
	public void meu_carrinho_devera_ter_dois_produto() throws Throwable {

		Thread.sleep(900000);
		WebElement element = navegador.findElement(
				By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/div[3]/div[2]/div/div/div[2]/div/a/span"));
		Thread.sleep(9000);
		String qtdNoCarrinho = element.getText();
		assertEquals("2", qtdNoCarrinho);

	}

	@Dado("^que estou no meu carrinho de compra$")
	public void que_estou_no_meu_carrinho_de_compra() throws Throwable {
		
		carrinhoCompra();
	}

	@Quando("^removo um produto$")
	public void removo_um_produto() throws Throwable {

		removoProduto();

	}

}
