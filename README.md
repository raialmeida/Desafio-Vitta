# Desafio-Vitta

1. No repositório contém a documentação do [Casos de Testes](https://github.com/raialmeida/Desafio-Vitta/blob/master/Doc_Vitta.xlsx?raw=true).
2. Contém bugs encontrados no [documento Word](https://github.com/raialmeida/Desafio-Vitta/blob/master/Evidencias%20Teste%20bug%20report.docx?raw=true).

## Ferramentas Utilizada.

  ##### _Instalar todas abaixo._

 - Eclpse Version: 2019-09 R (4.13.0)
 - Plugin do Cucumber (Instalado dentro do Eclipse, informações abaixo)
 - JDK 8
 - chromedriver Version 79.0.3945.36 (Só baixar, informações abaixo)


## Linguagem/S.O

 - Java
 - S.O Windows

## Instruções para executar os testes.

 - Quando for executar os testes verificar antes o caminho do driver.
   Verificar na pacote Suporte a classe Browser nela estar definido o caminho.
   No caso está defenido como "target\\Driver\\chromedriver.exe", a pasta 'Driver' foi criada dentro da pasta 'target',
   caso quando for clonar pode ser que a pasta não existe. Então criá-lo.
   
 - A pasta 'screenshot' talvez ao clonar o projeto não existe e só criar dentro da pasta 'target'. Pasta para armazenar
   o print da tela.
   
 - No caminho src\test\resources tem a pasta Feature dentro tem o arquivo BDD onde deve colocar os dados para realizar o cadastro.
  
 - Instalar o plugin Cucumber dentro do Eclipse em HELP > ECLIPSE MARKETPLACE e pesquisar cucumber e clicar em install.
 
 - Baixar o chromedriver e colocar na pasta de destino onde será executado. No projeto está "target\\Driver\\chromedriver.exe"
 
 - Todas as dependências necessárias estão no arquivo pom.xml, ao abrir e salvar o arquivo as dependências serão instaladas automaticamente.
   
 - Baixar o chromedriver e colocar na pasta _Driver_ ou então colocar na pasta desejável, so definir o caminho do driver
   na classe Browser.
 
 - Dentro do pacote TesteWebJump.runner contém a classe Runner.
    - Executar a classe **Runner** para executar os testes.
   
  
