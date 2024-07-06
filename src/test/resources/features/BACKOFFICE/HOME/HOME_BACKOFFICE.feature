@TESTE
Feature: Tela do site Tricentis
  Dado que eu queira acessar o sistema do Tricentis para testar a funcionalidade da tela.

  @Regressivo @Smoke
  Scenario Outline: Testar funcionalidade dos componentes na tela
    Given Acessa o site do Tricentis
    ##And Preencher os campos para acesso <Email>,<Senha>
 

    Examples: 
      | Email                    | Senha     |
      | "planner@planner.com.br" | "Planner" |