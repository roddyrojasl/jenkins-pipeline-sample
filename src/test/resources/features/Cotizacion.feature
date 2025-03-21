Feature: Cotizacion de SOAT
  Como dueño de un vehiculo
  Quiero usar la pagina web de interseguro
  Para cotizar y adquirir un SOAT

  Background:
    Given que "Ruben" navega en la pagina de cotizacion

  Scenario: Cotizar SOAT de cliente
    When ingresa la placa "FDS447" de su vehiculo
    And los sus datos personales y del vehiculo
    Then  Ruben valida su nuevo SOAT
