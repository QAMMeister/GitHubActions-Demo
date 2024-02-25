Feature: First API Test
  I want to use this template for my feature file

  Scenario: Test a sample Get API
    Given url 'http://localhost:49160/locations'
    When method GET
    Then status 200
