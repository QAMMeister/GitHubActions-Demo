Feature: Verify "Hello CGI!" on the page

  Scenario: Check if "Hello CGI!" is visible on page "localhost:49160/"
    Given I open the URL "http://localhost:49160/"
    Then I should see the text "Hello CGI!"
