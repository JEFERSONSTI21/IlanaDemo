@demo
Feature: Login on salesforce website

  Background: Processes are carried out on the demo page
    Given user enters the demo page
    When a user fills out the login form correctly
    Then the home successful

  @CasoUno
  Scenario Outline: registration is done in forms
    When Registration of the form is carried out
      | firstName   | lastName   | email   | mobile   |
      | <firstName> | <lastName> | <email> | <mobile> |

    Examples:
      | firstName | lastName | email                      | mobile     |
      | Jeferson  | Pedraza  | jeferson.pedraza@gmail.com | 3504515805 |




