Feature: Login
  As a user, I should be able to deactivate user

  Background: Common steps


  @EditUser
  Scenario: Login as a librarian and deactivate the user

    Given I am on the login page
    When I login as a librarian
    Then dashboard should be displayed
    And I click on Edit User link


