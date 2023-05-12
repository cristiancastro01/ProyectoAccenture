Feature: Realizar compra en swaglabs

  Background:
    Given El usuario realiza el proceso de logueo

    Scenario: Realizar proceso de compra en la aplicacion
      Given El usuario filtra por orden alfabetico
      When El usuario agrega al carrito los productos
      |Sauce Labs Backpack      |
      |Sauce Labs Bike Light    |
      Then El usuario finaliza la compra