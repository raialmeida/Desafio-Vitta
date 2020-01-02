package TesteVittaSaraiva.pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteVittaSaraivaPages extends TesteVittaSaraivaBasePages {
	static String nomeusuario;
	public TesteVittaSaraivaPages(WebDriver driver) {
		super(driver);

	}

	public static void clicarCadastrar(WebDriver driver) {
		driver.findElement(EntreOuCadastre).click();

	}

	public static void verificarBotaoNoModal(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loadingModal));
		wait.until(ExpectedConditions.visibilityOfElementLocated(EntrarComClienteOuCadastre));
	}

	public static void clicarBotaoNoModal(WebDriver driver) {

		driver.findElement(EntrarComClienteOuCadastre).click();

	}

	/*
	 * 
	 * Metódo para alternar para a janela de cadastro Novo Usuario
	 */
	public static void verificarBotaoCadastrarNovaJanela(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String mainHandle = driver.getWindowHandle();
		driver.switchTo().window(wait.until((WebDriver drv) -> {
			for (String handle : drv.getWindowHandles()) {
				if (!handle.equals(mainHandle))
					return handle;
			}
			return null;
		}));
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(cadastrar));

	}

	public static void clicarBotaoCadastrar(WebDriver driver) {
		driver.findElement(cadastrar).click();
	}

	public static void clicarAbaPessoa(WebDriver driver) {
		driver.findElement(clicabapessoa).click();

	}

	public static void verificarCamposNaTela(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(nome));
		wait.until(ExpectedConditions.visibilityOfElementLocated(sobrenome));
		wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		wait.until(ExpectedConditions.visibilityOfElementLocated(senha));
		wait.until(ExpectedConditions.visibilityOfElementLocated(confirmarsenha));
		wait.until(ExpectedConditions.visibilityOfElementLocated(cpf));
		wait.until(ExpectedConditions.visibilityOfElementLocated(datadenascimento));
		wait.until(ExpectedConditions.visibilityOfElementLocated(celular));
		wait.until(ExpectedConditions.visibilityOfElementLocated(cep));

	}

	public static void digitarNome(WebDriver driver, String arg1) {
		driver.findElement(nome).sendKeys(arg1);

	}

	public static void digitarSobrenome(WebDriver driver, String arg1) {
		driver.findElement(sobrenome).sendKeys(arg1);

	}

	public static void digitarEmail(WebDriver driver, String arg1) {
		driver.findElement(email).sendKeys(arg1);

	}

	public static void digitarSenha(WebDriver driver, String arg1) {
		driver.findElement(senha).sendKeys(arg1);

	}

	public static void digitarConfirmarSenha(WebDriver driver, String arg1) {
		driver.findElement(confirmarsenha).sendKeys(arg1);

	}

	public static void digitarCpf(WebDriver driver, String arg1) {
		driver.findElement(cpf).sendKeys(arg1);

	}

	public static void selecionarSexo(WebDriver driver) {
		driver.findElement(sexo).click();

	}

	public static void digitarDataDeNascimento(WebDriver driver, String arg1) {
		driver.findElement(datadenascimento).sendKeys(arg1);

	}

	public static void digitarCelular(WebDriver driver, String arg1) {
		driver.findElement(celular).sendKeys(arg1);

	}

	public static void digitarEndereco(WebDriver driver, String arg1) {
		driver.findElement(cep).sendKeys(arg1);
	}

	public static void digitarNumero(WebDriver driver, String arg1) {
		driver.findElement(numero).click();
		driver.findElement(numero).sendKeys(arg1);
	}

	public static void digitarTelefoneParaContato(WebDriver driver, String arg1) {
		driver.findElement(telefonecontato).sendKeys(arg1);

	}

	public static void selecionarRecebimentoDeOfertas(WebDriver driver) {
		driver.findElement(selecionarrecebimentooferta).click();

	}

	public static void clickbotaoFinalizarCadastro(WebDriver driver) {
		driver.findElement(clicFinalizarcadastro).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void verificarUsuarioCadastrado(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String mainHandle = driver.getWindowHandle();
		driver.switchTo().window(wait.until((WebDriver drv) -> {
			for (String handle : drv.getWindowHandles()) {
				if (!handle.equals(mainHandle))
					return handle;
			}
			return null;
		}));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(verificarusuariocadastrado));
		
		String usuario = driver.findElement(verificarusuariocadastrado).getText(); 
		assertEquals(nomeusuario, usuario); 
		
	}

}
