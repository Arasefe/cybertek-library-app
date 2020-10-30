Feature: Show records functionality
  @pageNavigation
  Scenario: Verify default values in Users page
    Given I am on the login page
    When I login as a librarian
    When I click on "Users" link
    Then show records default value should be 10
    Then show records should have following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |
