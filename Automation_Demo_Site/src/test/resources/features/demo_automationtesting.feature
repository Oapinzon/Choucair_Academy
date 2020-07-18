#Autor Jean Carlos Caballero
@stories
Feature:
  Demo Automationtesting
  as a user, I want to automate registration in Automation Demo Site with the screenplay automation guide

  @scenario1
  Scenario: Access the Web Automation demo
    Given than jean wants to access the Web Demo Site
    When He makes the register on the page
      | firstName  | lastName  | address             | email                | phone      | gender | hobbies1 | hobbies3 | languages1 | languages2 | skills     | country | selectCountry | year | month     | day | password | confirmPassword |
      | Omar       | Pinzon    | Panama Rep. Panama  | oapinzon@hotmail.com | 1234567891 | Male   | Cricket  | Hockey   | Spanish    | English    | Python     | Aruba   | Japan         | 1996 | February  | 5   | Abcd1234 | Abcd1234        |
    Then verifies that the screen in loaded with text Double Click on Edit Icon to "EDIT" the Table row