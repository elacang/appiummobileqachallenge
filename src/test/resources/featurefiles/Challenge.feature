
Feature: QA Mobile Test Challenge

  @test
  Scenario: Navigate to Kraken website and open Prices page from a mobile phone browser
    Given I launch the default mobile browser
    When I navigate to http://www.kraken.com website
    And I navigate to Prices page from the menu
    Then I should see https://trade.kraken.com/markets URL in the address bar

#    Scenario: Navigate to Google and search for "Eirol John Lacang" (Input) using a mobile phone browser
#      Given I navigate to http://www.google.com
#      When I do a search for "Eirol John Lacang"
#      Then I should be able to see the results
#
#      Scenario: Get country for Ernst Handel company in the table
#        Given I launch the default mobile browser
#        When I navigate to https://www.w3schools.com/html/html_tables.asp
#        Then I should see "Austria" as country for "Ernst Handel" company
