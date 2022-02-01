Feature: Here we create the test cases for the contact us

  @functional
  Scenario Outline: Title of your scenario outline
    Given I am in the contact page
    When I see the form and fill the information for <username> and <useremail> with <userenquiry>
    And I send the user information
    Then I return to contact us page

    Examples: 
      | username  | useremail | userenquiry  |
      | Winston Castillo | once@mail.com | should be something more than 10 chars |
      | Alexander Hans | twice@mail.com | should be something more than 10 chars    |
