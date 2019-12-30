package TesteVittaSaraiva.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TesteVittaSaraivaBasePages {

	protected WebDriver driver;

	public TesteVittaSaraivaBasePages(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
 
	}
	static By EntreOuCadastre = By.id("link-account");
	static By loadingModal = By.xpath("//*[@id=\"vtexIdContainer\"]/div");
	static By EntrarComClienteOuCadastre = By.id("vtexIdUI-saraiva-oauth");
	static By cadastrar = By.linkText("CADASTRAR");

	static By nome = By.id("InputNome1");
	static By sobrenome = By.id("InputSobrenome1");
	static By email = By.id("InputEmail1");
	static By senha = By.id("InputSenha1");
	static By confirmarsenha = By.id("InputConfirmeSenha1");
	static By cpf = By.id("InputCpf1");
	static By sexo = By.xpath("//*[@id=\"newUser\"]//*[contains(text(),'Masculino')]");
	static By datadenascimento = By.id("InputDataNascimento1");
	static By celular = By.id("InputCelular1");
	static By cep = By.id("InputCep1");
	static By selecionarrecebimentooferta = By.xpath("//*[@id=\"newUser\"]//*[contains(text(),'Desejo receber e-mails de ofertas promocionais')] ");
	static By clicbotao = By.xpath("FinalizarCadastro1");
	
	
}
