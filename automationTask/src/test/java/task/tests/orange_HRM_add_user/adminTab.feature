Feature:OrangeHRM admin tab functionality

  Scenario Outline: check that admin user can add a user through admin tab page
    Given admin user redirects to Ornage HRM and login with user credentials "<userName>" and "<password>"
    When admin user click on admin tab
    And admin user gets numbers of users recorded
    And admin user click on add button in admin page
    And admin user fill required data to add new user "<role>" and "<status>" and "<newPassword>" and "<name>"
    And admin user click on save button
    Then number of recorded users is increased by numbers of added users

    Examples:
    | userName | password |role |status  |newPassword   | name |
    | user     | password |Admin|Enabled | newPassword  | name |

    Scenario Outline: check that admin user can delete a user through admin tab page
      Given admin user redirects to Ornage HRM and login with user credentials "<userName>" and "<password>"
      When admin user click on admin tab
      And admin user gets numbers of users recorded
      And search for user with name "<user>"
      And click on search button
      And click on delete button for selected user
      And click on Yes delete button
      Then number of recorded users is decreased by numbers of deleted users

      Examples:
        | userName | password |user |
        | user     | password |name |
