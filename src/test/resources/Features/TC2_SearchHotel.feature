@theta
Feature: Verifying the Adactin Hotel site Search hotel feature

  Scenario Outline: verifying the search hotel feature by giving input to all the fields
    Given User is on the Adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify after Login Success Message "Hello saravanakonvict!"
    And User should search the hotel by giving inputs to all the fields as per requirement "<Location>" , "<Hotels>" , "<RoomType>" , "<NumberofRooms>" , "<CheckInDate>" , "<CheckOutDate>" , "<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User should verify the success message "select hotel"

    Examples: 
      | userName        | password | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | saravanakonvict | 9C5STN   | Sydney   | Hotel Creek | Deluxe   | 4 - Four      | 14/12/2022  | 15/12/2022   | 4 - Four      | 0 - None        |

  Scenario Outline: verifying the search hotel feature by giving input to only the mandatory fields
    Given User is on the Adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify after Login Success Message "Hello saravanakonvict!"
    And User should search the hotel by giving inputs to only the mandatory fields as per requirement "<Location>" , "<NumberofRooms>" , "<CheckInDate>" , "<CheckOutDate>" and "<AdultsperRoom>"
    Then User should verify the success message "select hotel"

    Examples: 
      | userName        | password | Location | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom |
      | saravanakonvict | 9C5STN   | Sydney   | 4 - Four      | 14/12/2022  | 15/12/2022   | 4 - Four      |

  Scenario Outline: verifying the search hotel feature by giving input to all the fields with invalid checkout date
    Given User is on the Adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify after Login Success Message "Hello saravanakonvict!"
    And user should give input to check in date as any upcoming date, check out date should be the day before check in date and other fields as per the requirement "<Location>" , "<Hotels>" , "<RoomType>" , "<NumberofRooms>" , "<CheckInDate>" , "<CheckOutDate>" , "<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User should verify the date selection error message "Check-In Date shall be before than Check-Out Date", "Check-Out Date shall be after than Check-In Date" to change the date

    Examples: 
      | userName        | password | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | saravanakonvict | 9C5STN   | Sydney   | Hotel Creek | Deluxe   | 4 - Four      | 24/12/2022  | 20/12/2022   | 4 - Four      | 0 - None        |

  Scenario Outline: verifying the search hotel feature by without giving any input to the fields
    Given User is on the Adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify after Login Success Message "Hello saravanakonvict!"
    And User should search the hotel by without giving any inputs to fields
    Then User should verify the select location error message "Please Select a Location"

    Examples: 
      | userName        | password |
      | saravanakonvict | 9C5STN   |
