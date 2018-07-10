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
    Then  user navigate to shoping card
    Then user Assert Totall price
    Then user click Checkout two time and Agree
    Then user click Checkout use pay by Check and navigate to my Order
    Then user Assert Your order on my Store is complete
    Then user navigate to Back to order
    And user Assert order exist



