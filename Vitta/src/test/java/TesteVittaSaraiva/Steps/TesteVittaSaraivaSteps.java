package TesteVittaSaraiva.Steps;

import org.openqa.selenium.WebDriver;

import Suporte.Browser;
import TesteVittaSaraiva.pages.TesteVittaSaraivaPages;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class TesteVittaSaraivaSteps {

	protected WebDriver driver;
	Browser print = new Browser();

	@Dado("^que eu acesse o site Saraiva$")
	public void queEuAcesseOSiteSaraiva() throws Throwable {
		driver = Browser.Iniciadriver();
		print.Print("Evi Site");
	}

	@Quando("^clicar no link entre ou cadastre-se$")
	public void clicarNoLinkEntreOuCadastreSe() throws Throwable {
		TesteVittaSaraivaPages.clicarCadastrar(driver);

	}

	@Então("^devera exibir um modal com botão ENTRAR COM CLIENTE SARAIVA OU CDASTRE -SE$")
	public void deveraExibirUmModalComBotãoENTRARCOMCLIENTESARAIVAOUCDASTRESE() throws Throwable {
		TesteVittaSaraivaPages.verificarBotaoNoModal(driver);
		print.Print("Evi Modal ENTRAR COM CLIENTE SARAIVA OU CDASTRE -SE");
	}

	@Então("^clicar no botão$")
	public void clicarNoBotão() throws Throwable {
		TesteVittaSaraivaPages.clicarBotaoNoModal(driver);
	}

	@Então("^deve exibir uma tela com botão CADASTRAR$")
	public void deveExibirUmaTelaComBotãoCADASTRAR() throws Throwable {
		TesteVittaSaraivaPages.verificarBotaoCadastrarNovaJanela(driver);
		print.Print("Evi Tela com o botão CADASTRAR");
	}

	@Então("^clicar no botão cadastrar$")
	public void clicarNoBotãocadastrar() throws Throwable {
		TesteVittaSaraivaPages.clicarBotaoCadastrar(driver);
	}

	@Então("^clicar na Aba Pessoa Física$")
	public void clicarNaSeçãoPessoaFísica() throws Throwable {
		TesteVittaSaraivaPages.clicarAbaPessoa(driver);
		print.Print("Evi Aba Pessoa Física");
	}

	@Então("^e exibido na tela os campos para preenchimento$")
	public void eExibidoNaTelaOsCamposParaPreenchimento() throws Throwable {
		TesteVittaSaraivaPages.verificarCamposNaTela(driver);
		print.Print("Evi Tela com os campos Obrigatórios");

	}

	@Então("^digitar \"([^\"]*)\" no campo Nome$")
	public void digitarNoCampoNome(String nome) throws Throwable {
		TesteVittaSaraivaPages.digitarNome(driver, nome);
	}

	@Então("^digitar \"([^\"]*)\" no campo Sobrenome$")
	public void digitarNoCampoSobrenome(String arg1) throws Throwable {
		TesteVittaSaraivaPages.digitarSobrenome(driver, arg1);
	}

	@Então("^digitar \"([^\"]*)\" no campo E-mail$")
	public void digitarNoCampoEMail(String arg1) throws Throwable {
		TesteVittaSaraivaPages.digitarEmail(driver, arg1);
	}

	@Então("^digitar \"([^\"]*)\" no campo Senha$")
	public void digitarNoCampoSenha(String arg1) throws Throwable {
		TesteVittaSaraivaPages.digitarSenha(driver, arg1);
	}

	@Então("^digitar \"([^\"]*)\" no campo Confirmar Senha$")
	public void digitarNoCampoConfirmarSenha(String arg1) throws Throwable {
		TesteVittaSaraivaPages.digitarConfirmarSenha(driver, arg1);
	}

	@Então("^digitar \"([^\"]*)\" no campo CPF$")
	public void digitarNoCampoCPF(String arg1) throws Throwable {
		TesteVittaSaraivaPages.digitarCpf(driver, arg1);
	}

	@Então("^marcar radio button o Sexo$")
	public void marcarRadioButtonOSexo() throws Throwable {
		TesteVittaSaraivaPages.selecionarSexo(driver);
	}

	@Então("^digitar \"([^\"]*)\" no campo Data de Nascimento$")
	public void digitarNoCampoDataDeNascimento(String arg1) throws Throwable {
		TesteVittaSaraivaPages.digitarDataDeNascimento(driver, arg1);
	}

	@Então("^digitar \"([^\"]*)\" no campo Celular$")
	public void digitarNoCampoCelular(String arg1) throws Throwable {
		TesteVittaSaraivaPages.digitarCelular(driver, arg1);
		print.Print("Evi Tela 1 com os campos preenchidos");
	}

	@Então("^digitar \"([^\"]*)\" no campo cep$")
	public void digitarNoCampoEndereço(String arg1) throws Throwable {
		TesteVittaSaraivaPages.digitarEndereco(driver, arg1);
	}

	@Então("^digitar \"([^\"]*)\" no campo numero$")
	public void digitar(String arg1) throws Throwable {
		TesteVittaSaraivaPages.digitarNumero(driver, arg1);
	}
	@Então("^digitar \"([^\"]*)\" telefone para contato$")
	public void digitarTelefoneParaContato(String arg1) throws Throwable {
		TesteVittaSaraivaPages.digitarTelefoneParaContato(driver, arg1);
	}

	@Então("^Aceitar recebimento de ofertas$")
	public void aceitarRecebimentoDeOfertas() throws Throwable {
		TesteVittaSaraivaPages.selecionarRecebimentoDeOfertas(driver);
		print.Print("Evi Tela 2 com os campos preenchidos");
	}

	@Então("^clicar no botão Finalizar Cadastro$")
	public void clicarNoBotãoFinalizarCadastro() throws Throwable {
		TesteVittaSaraivaPages.clickbotaoFinalizarCadastro(driver);
		print.Print("Evi Finalizar Cadastro");
	}
	@Então("^verificar \"([^\"]*)\" usuario cadastrado$")
	public void verificarUsuarioCadastrado(String arg1) throws Throwable {
		TesteVittaSaraivaPages.verificarUsuarioCadastrado(driver, arg1);
		print.Print("Evi Tela Usuário Cadastrado");
	}
	@Então("^fechar browser$")
	public void fecharBrowser() throws Throwable {
		driver.close(); 
	}
}
