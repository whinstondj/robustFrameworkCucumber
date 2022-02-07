Feature: here we will add the test cases for the homePage

  @Functional
  Scenario: Going to contact Page from Homepage
    Given I am a website visitor
 		And I see the contact link
    When I click on the contact link
    Then the contact us form is loaded
