Feature: Login
  As a user, I should be able to add User

  Background: Common steps


  @AddUser
  Scenario: Login as a librarian

    Given I am on the login page
    When I login as a librarian
    And I click on "Users" link
    And I click "Add User" icon
    And I fill all the necessary fields
      | Full Name  | Aras YILDIRIM          |
      | Password   | Banu_Torun82           |
      | Email      | efehan_pusat@yahoo.com |
      | User Group | Librarian              |
      | Status     | ACTIVE                 |
      | Start Date | 2020-10-29             |
      | End Date   | 2020-11-29             |
      | Address    | 262 Greensboro ct IL   |

    And I save changes
    #And I close the table
    Then I should be able to verify that user is added
    Then I should be able to close the table

