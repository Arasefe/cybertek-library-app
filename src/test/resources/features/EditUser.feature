Feature: Login
  As a user, I should be able edit user information

  Background: Common steps


  @EditUser
  Scenario: Login as a librarian and deactivate the user

    Given I am on the login page
    When I login as a librarian
    Then dashboard should be displayed
    When I click on "Users" link
    And I click on Edit User link and edit the info
      | Full Name  | Tulpar YILDIRIM        |
      | Password   | Aras_Tulpar            |
      | Email      | efehan_pusat@gmail.com |
      | User Group | Librarian              |
      | Status     | ACTIVE                 |
      | Start Date | 2020-10-29             |
      | End Date   | 2020-11-29             |
      | Address    | 262 Greensboro ct IL   |

    And I save changes
    #And I close the table
    Then I should be able to verify that user information is edited
      | Full Name  | Tulpar YILDIRIM        |
    Then I should be able to close the table
