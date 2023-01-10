@alpha
Feature: Veriying Adactin Hotel Login Details

  Scenario Outline: Verifying the Adactin Hotel Login Page with Valid Credentials
    Given User is on the Adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify after Login Success Message "Hello saravanakonvict!"

    Examples: 
      | userName        | password |
      | saravanakonvict | 9C5STN   |

  Scenario Outline: Verifying the Adactin Hotel Login Page with Valid Credentials using Enter Key
    Given User is on the Adactin Page
    When User should perform login "<userName>","<password>" with Enter Key
    Then User should verify after Login Success Message "Hello saravanakonvict!"

    Examples: 
      | userName        | password |
      | saravanakonvict | 9C5STN   |

  Scenario Outline: Verifying the Adactin Hotel Login Page with Invalid Credentials using Enter Key
    Given User is on the Adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify the Invalid credentials error meesage containing "Invalid Login details or Your Password might have expired. Click here to reset your password"

    Examples: 
      | userName        | password  |
      | saravanakonvict | 9C5STNSDA |
