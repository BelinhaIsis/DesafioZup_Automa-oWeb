package paginas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.pt.E;
import util.Reutilizaveis;

public class pedido extends Reutilizaveis {

	WebElement elemento = null;

	String baseUrl = "https://nagem.com.br/";
	String tituloPagina = "";

	By txtPesquisarProduto = By.id("buscaGeral");

	// By btnPesquisar = By.cssSelector("button[type='submit']");
	By btnPesquisar = By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/div[2]/div[2]/div/form/div/span/button");
	By pesquisaProd = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/a/div/div[1]/img");
	By btnCompra = By.id("btnComprar");
	//By btnRemover = By.cssSelector("i[class=\"fa fa-trash fa-2x click-hover negative\"]");
	By btnRemover = By.xpath("//*[@id=\"linhaProduto_342254\"]/div[5]/span/a/i");

	protected WebDriver navegador = getDriver("chrome");

	public pedido() {
	}

	public void openBrowse() {
		navegador.get(baseUrl);
		navegador.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(navegador, 5);
		tituloPagina = navegador.getTitle();
	}

	public void pesquisarProduto(String arg1) throws Exception {
		try {

			elemento = navegador.findElement(txtPesquisarProduto);
			elemento.clear();
			elemento.sendKeys(arg1);
//			CopiarTela("faco a busca do produto");
			elemento = navegador.findElement(btnPesquisar);
			elemento.click();

			// String ValidacaoProd =
			// navegador.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div/span[1]")).getText();
			// String nomeLimpo = ValidacaoProd.substring(12, ValidacaoProd.length() - 1);

			// if (nomeLimpo.equals("Mouse Multilaser USB Classic Box Preto MO179")) {
			// System.out.println("Produto valido");
			// }

			// assertEquals("Mouse Multilaser USB Classic Box Preto MO179", nomeLimpo);

		} catch (Exception e) {
			// TODO: handle exception
			CopiarTela("ERRO: faco a busca do produto");
			throw new Exception("Problema na execução deste passo:  >>>>  " + e.toString());
		}
	}

	public void escolhoProdutoLista() throws Throwable {

		WebDriverWait wait2 = new WebDriverWait(navegador, 30);
		elemento = navegador.findElement(pesquisaProd);
		elemento.click();

	}

	public void adicionoCarrinho() throws Throwable {

		Thread.sleep(30);
		WebDriverWait wait2 = new WebDriverWait(navegador, 30);
		elemento = wait2.until(ExpectedConditions.elementToBeClickable(btnCompra));
		elemento.click();
		Thread.sleep(30);

	}

	public void validoProdutoCarrinho(String arg1) throws Throwable {

		Thread.sleep(900000);
		WebElement element = navegador.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/div[3]/div[2]/div/div/div[2]/div/a/span"));
		Thread.sleep(9000);
		String qtdNoCarrinho = element.getText();
		assertEquals("1", qtdNoCarrinho);

		JavascriptExecutor js = (JavascriptExecutor) navegador;
		js.executeScript("alert('SUCESSO: Ver o total de itens no carrinho')");
		Thread.sleep(9000);

		JavascriptExecutor js1 = (JavascriptExecutor) navegador;
		js1.executeScript("alert(qtdNoCarrinho)");
		Thread.sleep(9000);

		CopiarTela("faco a busca do produto");
	}
	
	
	public void carrinhoCompra() throws Throwable {
		
		Thread.sleep(30);
		WebDriverWait wait2 = new WebDriverWait(navegador, 30);
		navegador.get("https://nagem.com.br/carrinho");
	}
	
	public void removoProduto() throws Throwable {
		
		Thread.sleep(30);
		WebDriverWait wait2 = new WebDriverWait(navegador, 30);
		elemento =  wait2.until(ExpectedConditions.elementToBeClickable(btnRemover));
		elemento.click();

	}
}
