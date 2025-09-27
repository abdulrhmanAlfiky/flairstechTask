Feature:OrangeHRM admin tab functionality

  Scenario Outline: check that admin user can add a user through admin tab
    Given admin user redirects to Ornage HRM and login with user credentials "<userName>" and "<password>"
    When admin user click on admin tab
    And admin user gets numbers of users recorded
    And admin user click on add button in admin page
    And admin user fill required data to add new user
#    And admin user click on save button
#    Then number of recorded users is increased by numbers of added users

    Examples:
    | userName | password |
    | user     | password |
