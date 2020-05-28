Feature: Simple feature test

  Scenario: Go to YouTube home page
    Given I go to "https://www.youtube.com"
    Then I should see "YouTube" as title