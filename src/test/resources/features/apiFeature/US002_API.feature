#  username should be validated using api
#  email should be validated with API and DB
@ApiRegistrant
Feature: api validation
  Scenario: verify username and email by api
    Given user sends get request to "https://medunna.com/api/user?010-96-7328"
    And user sends the GET request and gets the response
    Then verify expected data equals to actual data