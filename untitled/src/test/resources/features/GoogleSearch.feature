@Google_search
Feature: Google Search
  As a user I want to test google search function

  Background: pre-requisites
    Given I open google search page

  Scenario: Basic search
    When I lookup the word "Selenium"
    Then search result display the word "Selenium"

  Scenario: Cucumber
    When I lookup the word "Cucumber"
    Then search result display the word "Cucumber"

  Scenario Outline: <lookup_word>
    When I lookup the word "<lookup_word>"
    Then search result display the word "<lookup_word>"
    Examples:
    |lookup_word|expected_result|
    |API REST|API REST|
    |Java|java|
