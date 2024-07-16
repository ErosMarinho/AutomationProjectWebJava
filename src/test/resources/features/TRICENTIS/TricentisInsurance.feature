@TESTE
Feature: Realizar testes de cadastro dos menus Automobile, Truck, Motorcycle e Camper do site Tricentis
  Dado que eu queira preencher os formulários das  abas no sistema do Tricentis.

  @Regressivo @Smoke
  Scenario Outline: Testar a tela Automobile Insurance
    Given Acessa o site do Tricentis
    And Clica no menu Automobile
    And Preenche formulário da Aba 'Enter Vehicle Data' de Automobile Insurance <enginePerformance>,<dataManufacture>,<listPrice>,<licensePlateNumber>,<annualMileage>
    And Preenche formulário da Aba 'Enter Insurant Data' de Automobile Insurance <firstName>,<lastName>,<dateBirth>,<streetAddress>,<zipCode>,<city>,<website>
    And Preenche formulário da Aba 'Enter Product Data' de Automobile Insurance <startDate>
    And Preenche formulário da Aba 'Select Price Option' de Automobile Insurance
    And Preenche formulário da Aba 'Send Quote' de Automobile Insurance <email>,<phone>,<userName>,<password>,<confirmPassword>,<comments>
    Then Valida a mensagem 'Sending e-mail success!' de Automobile Insurance

    Examples: 
      | enginePerformance | dataManufacture | listPrice | licensePlateNumber | annualMileage | firstName   | lastName  | dateBirth    | streetAddress     | zipCode    | city        | website             | startDate    | email                        | phone        | userName    | password    | confirmPassword | comments                                    |
      | "2000"            | "10/10/1983"    | "100000"  | "ABC1EF2"          | "100000"      | "Francisco" | "Lacerda" | "10/18/1983" | "Rua Mario Gomes" | "53654875" | "São Paulo" | "www.google.com.br" | "05/10/2025" | "franciscolacerda@gmail.com" | "8199875425" | "Francisco" | "Avt123456" | "Avt123456"     | "Testando cadastro de Automobile Insurance" |

  @Regressivo @Smoke
  Scenario Outline: Testar a tela Truck Insurance
    Given Acessa o site do Tricentis
    And Clica no menu Truck
    And Preenche formulário da Aba 'Enter Vehicle Data' de Truck Insurance <enginePerformance>,<dataManufacture>,<payload>,<totalWeight>,<listPrice>,<licensePlateNumber>,<annualMileage>
    And Preenche formulário da Aba 'Enter Insurant Data' de Truck Insurance <firstName>,<lastName>,<dateBirth>,<streetAddress>,<zipCode>,<city>,<website>
    And Preenche formulário da Aba 'Enter Product Data' de Truck Insurance <startDate>
    And Preenche formulário da Aba 'Select Price Option' de Truck Insurance
    And Preenche formulário da Aba 'Send Quote' de Truck Insurance <email>,<phone>,<userName>,<password>,<confirmPassword>,<comments>
    Then Valida a mensagem 'Sending e-mail success!' de Truck Insurance

    Examples: 
      | enginePerformance | dataManufacture | payload | totalWeight | listPrice | licensePlateNumber | annualMileage | firstName  | lastName  | dateBirth    | streetAddress          | zipCode    | city             | website                | startDate    | email                       | phone        | userName   | password    | confirmPassword | comments                            |
      | "1000"            | "10/10/1983"    | "1000"  | "50000"     | "100000"  | "EFG5F2"           | "100000"      | "Leonardo" | "Mineiro" | "10/20/1983" | "Avenida João de Deus" | "54321167" | "Rio de Janeiro" | "www.truckstar.com.br" | "05/10/2025" | "leonardomineiro@gmail.com" | "8199875425" | "Leonardo" | "Avt123456" | "Avt123456"     | "Testando cadastro Truck Insurance" |

  @Regressivo @Smoke
  Scenario Outline: Testar a tela Motorcycle Insurance
    Given Acessa o site do Tricentis
    And Clica no menu Motorcycle
    And Preenche formulário da Aba 'Enter Vehicle Data' de Motorcycle Insurance <cylinderCapacity>,<enginePerformance>,<dataManufacture>,<listPrice>,<annualMileage>
    And Preenche formulário da Aba 'Enter Insurant Data' de Motorcycle Insurance <firstName>,<lastName>,<dateBirth>,<streetAddress>,<zipCode>,<city>,<website>
    And Preenche formulário da Aba 'Enter Product Data' de Motorcycle Insurance <startDate>
    And Preenche formulário da Aba 'Select Price Option' de Motorcycle Insurance
    And Preenche formulário da Aba 'Send Quote' de Motorcycle Insurance <email>,<phone>,<userName>,<password>,<confirmPassword>,<comments>
    Then Valida a mensagem 'Sending e-mail success!' de Motorcycle Insurance

    Examples: 
      | cylinderCapacity | enginePerformance | dataManufacture | listPrice | annualMileage | firstName | lastName  | dateBirth    | streetAddress          | zipCode    | city             | website          | startDate    | email                     | phone        | userName | password    | confirmPassword | comments                                 |
      | "2000"           | "2000"            | "10/25/1999"    | "100000"  | "100000"      | "Marina"  | "Marinho" | "10/20/1998" | "Rua Angelo Rodrigues" | "53846459" | "Belo Horizonte" | "www.uol.com.br" | "05/30/2025" | "marinamarinho@gmail.com" | "8199875425" | "Marina" | "Avt123456" | "Avt123456"     | "Testando cadastro Motorcycle Insurance" |

  @Regressivo @Smoke
  Scenario Outline: Testar a tela Camper Insurance
    Given Acessa o site do Tricentis
    And Clica no menu Camper
    And Preenche formulário da Aba 'Enter Vehicle Data' de Camper Insurance <enginePerformance>,<dataManufacture>,<payload>,<totalWeight>,<listPrice>,<licensePlateNumber>,<annualMileage>
    And Preenche formulário da Aba 'Enter Insurant Data' de Camper Insurance <firstName>,<lastName>,<dateBirth>,<streetAddress>,<zipCode>,<city>,<website>
    And Preenche formulário da Aba 'Enter Product Data' de Camper Insurance <startDate>
    And Preenche formulário da Aba 'Select Price Option' de Camper Insurance
    And Preenche formulário da Aba 'Send Quote' de Camper Insurance <email>,<phone>,<userName>,<password>,<confirmPassword>,<comments>
    Then Valida a mensagem 'Sending e-mail success!' de Camper Insurance

    Examples: 
      | enginePerformance | dataManufacture | payload | totalWeight | listPrice | licensePlateNumber | annualMileage | firstName | lastName   | dateBirth    | streetAddress    | zipCode    | city     | website              | startDate    | email                       | phone        | userName  | password    | confirmPassword | comments                             |
      | "2000"            | "10/10/1995"    | "1000"  | "50000"     | "100000"  | "ABC1EF2"          | "100000"      | "Jonatas" | "Ferreira" | "10/20/1983" | "Rua Mario Melo" | "34564897" | "Santos" | "www.jurandy.com.br" | "05/10/2025" | "jonatasferreira@gmail.com" | "8199875425" | "Jonatas" | "Avt123456" | "Avt123456"     | "Testando cadastro Camper Insurance" |
