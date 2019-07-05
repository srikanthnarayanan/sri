Feature: Login to TestMe App with the registered username and password


  Scenario Outline: Login using username and password
    Given I enter the Web application
    And I press signin option
    And I Enter "<username>"
    And I Enter "<password>"
    And I press Login
    Then I press signout option 

    Examples: 
      |username   |password       |
      |lalitha    | password123   |



