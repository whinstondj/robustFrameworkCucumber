Feature: Here we create the test cases for the contact us

  @functional
  Scenario Outline: Title of your scenario outline
    Given I am in the contact page
    When I see the form and fill the information for <username> and <useremail> with <userenquiry>
    Then I send the user information
    And I return to contact us page

    Examples: 
      | username  | useremail | userenquiry  |
      | Maria Gonzalez |	mariagonzalez@hotmail.com |	One: Here we can have another kind of testing and whatever I want to write |
      | Peter Simpson	| psimpson@gmail.com |	Two: Here we can have another kind of testing and whatever I want to write |
      | Jason Palmery |	palmerito@yahoo.com |	Three: Here we can have another kind of testing and whatever I want to write |
      | Ross Bott	| therossbott@hotmail.com |	Four: Here we can have another kind of testing and whatever I want to write |
      | Crystal Mansfield |	crystalm@icloud.com	| Five: Here we can have another kind of testing and whatever I want to write |
