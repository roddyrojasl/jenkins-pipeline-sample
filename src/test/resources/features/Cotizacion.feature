Feature: Cotizacion de SOAT
  Como dueño de un vehiculo
  Quiero usar la pagina web de interseguro
  Para cotizar y adquirir un SOAT


  Scenario: Cotizar SOAT de cliente natural
    Given que "Ruben" persona "natural" navega en la pagina de cotizacion
    When ingresa la placa "FDS549" de su vehiculo
    And los sus datos personales y del vehiculo
    Then  Ruben valida su nuevo SOAT

  Scenario: Cotizar SOAT de cliente persona juridica
    Given que "Eduardo" persona "juridica" navega en la pagina de cotizacion
    When ingresa la placa "FDS541" de su vehiculo
    And los sus datos personales y del vehiculo
    Then  Ruben valida su nuevo SOAT