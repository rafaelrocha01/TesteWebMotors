# language: pt
Funcionalidade: consulta de marcas de veiculos

  Cenario: validar consulta de Marcas de veiculos
    Dado que eu possuo a url da api de consulta de marcas
    Quando eu fizer a requisição get
    Então a api deve retornar o status 200
    E a api deve retornar as marcas dos veiculos