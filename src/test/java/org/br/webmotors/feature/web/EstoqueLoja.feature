# language: pt
Funcionalidade: consulta de veiculos

  Cenário: validar listagem do estoque de uma loja
    Dado que eu esteja na pagina inicial da webmotors
    Quando clicar em ver ofertas
    E eu selecionar no menu lateral o checkbox loja
    E eu clicar e um dos veiculos do reultado
    E eu clicar em ver todos os carros deste vendedor
    Então o site deve me retornar uma lista com o estoque da loja