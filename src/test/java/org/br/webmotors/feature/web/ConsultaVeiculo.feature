# language: pt
Funcionalidade: consulta de veiculos

  Cenario: validar marca modelo e versão na consulta de veiculos
    Dado que eu esteja na pagina inicial da webmotors
    Quando clicar em ver ofertas
    E eu selecionar a marca "honda" o modelo "CITY" e a versão "1.5 DX 16V FLEX 4P AUTOMÁTICO"
    Então o site deve retornar uma lista com o veiculo da marca "HONDA" modelo "CITY" e versão "1.5 DX 16V FLEX 4P AUTOMÁTICO"