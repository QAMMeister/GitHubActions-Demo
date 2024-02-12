Feature: Verify "Hello CGI!" on the page

@TECHRADAR-396
  Scenario: Check if "Hello CGI!" is visible on page "localhost:49160/"
    Given I open the URL "http://10.0.2.15:49160/"
    Then I should see the text "Hello CGI!"
