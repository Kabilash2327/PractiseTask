@GET
Feature: API GET method

@positive
  Scenario: User should valid the Get method and verify the success code
    Given User should pass the valid url in respective get method
    When User should get the response time
    And User should get the body in json format
    Then User should get the response code and verify
@negative_1
  Scenario: User should valid the Get method and verify the error code
    Given User should pass the valid url in respective get method
    When User should get the response time
    And User should get the body in json format
    Then User should get the response code and verify the error msg
@negative_2
  Scenario: User should valid the Get method when url is not valid
    Given User should pass the invalid url in respective get method
    When User should get the response time
    And User should get the body in json format
    Then User should get the response code and verify
