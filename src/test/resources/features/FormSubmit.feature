Feature: Shop online
  As a user I want to login
  and buy some produckt here

  Scenario: Log in website
    Given user navigates to the app url
    When user fills field email with value "superuser7@gmail.com" and password "12345"

    Then  user navigates to the woman page
    Then  user add first product in backet
    Then  user add second product in backet
    Then  user add third product in backet
    Then  user add fourth product in backet
#    Examples:
#      | firstname | lastName  |01.02.2000|test@gmail.com|12345|
#      | Nick      | Jackson   |02.03.2001|test2@gmail.com|qwery1234|
#      | Sergii    | Opanasiuk |03.04.2002|test3@gmail.com|qwery5678|
#      | Benson    | Kamary    |04.05.2003|test4@gmail.com|12345qwert|



