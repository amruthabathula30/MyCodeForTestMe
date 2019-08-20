Feature: My validations on testme for Demo in HDC

  Scenario Outline: login validation for multiple users in testme app
    Given test me app is launched by the user
    When User clicks on SignIn link in landing page
    Then user provides the valid username "<uname>"
    And user provides the valid password "<pswrd>"
    Then user clicks for the submission of the data
    And verfifies the login status for the account

    Examples: 
      | uname     | pswrd   |
      | thanmay22 | friends |
      | thanmay99 | friends |
