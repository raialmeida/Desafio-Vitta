#language: pt
Funcionalidade: cadastrar usuário na loja.

  
  Esquema do Cenario: Acessar o site da loja e cadastrar o usuario. 
  
    Dado que eu acesse o site Saraiva 
    Quando clicar no link entre ou cadastre-se
    Então devera exibir um modal com botão ENTRAR COM CLIENTE SARAIVA OU CDASTRE -SE
    E clicar no botão
    Então deve exibir uma tela com botão CADASTRAR
    E clicar no botão cadastrar
    Então e exibido na tela os campos para preenchimento 
    E digitar "<nome>" no campo Nome
    E digitar "<sobrenome>" no campo Sobrenome
    E digitar "<e-mail>" no campo E-mail
    E digitar "<senha>" no campo Senha 
    E digitar "<confirmar senha>" no campo Confirmar Senha
    E digitar "<CPF>" no campo CPF
    E marcar radio button o Sexo
    E digitar "<data nascimento>" no campo Data de Nascimento
    E digitar "<celular>" no campo Celular
    E digitar "<endereço cep>" no campo Endereço
    E Aceitar recebimento de ofertas 
    Então clicar no botão Finalizar Cadastro
    Então fechar browser
    

    
 Exemplos:
    
    
   |nome| sobrenome| e-mail               | senha        | confirmar senha| CPF       |data nascimento| celular   |endereço cep|
   |Rai | Almeida  |raialmeida@hotmail.com| 123456       |123456          |64448625230| 12/02/1994    |11946759055|04432-030   |


