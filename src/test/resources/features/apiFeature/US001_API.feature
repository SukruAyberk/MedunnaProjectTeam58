@APItests
Feature: US001 get all registrant information using API, swagger documentation an validate them


  Scenario: TC007 There should be all registrants information
    Given User sets the end point for all registrant information
    And User sends a request to the url
    Then User confirm that status code should be 200
    And User confirm all count of registrant data is the same as expected result

  Scenario: TC008 Create registrants using api and validate
    Given User sets the end point for register
    And User sets the expected data
    Then User sends the post request and get the response
    And User saves the respons
    And User verifies API records