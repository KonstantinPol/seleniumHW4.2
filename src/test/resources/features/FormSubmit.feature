Feature: Form automation
  As a user I want to fill my form
  also I submit it

  Scenario Outline: Form filling and submition
    Given user navigates to the app url
    When user fills first name with value "<firstname>"
    When user fills last name with value "<lastName>"
    When user fills gender
    When user fills date of birth with value "<01.02.2000>"
    When user fills address
    When user fills email with value "<test@gmail.com>"
    When user fills password with value "<12345>"
    When user fills company
    When user fills Role
    When user fills Job
    When user fills CheckboxOne
    When user fills CheckboxTwo
    When user fills Comments
    When user submit form
    When user check form is submitted
    When user reload page

    Examples:
      | firstname | lastName  |01.02.2000|test@gmail.com|12345|
      | Nick      | Jackson   |02.03.2001|test2@gmail.com|qwery1234|
      | Sergii    | Opanasiuk |03.04.2002|test3@gmail.com|qwery5678|
      | Benson    | Kamary    |04.05.2003|test4@gmail.com|12345qwert|



