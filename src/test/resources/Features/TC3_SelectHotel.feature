@meta
Feature: Verifying the Select Hotel feature in Adactin Hotel site

  Scenario Outline: verifying the Select Hotel feature by giving input to all the fields
    Given User is on the Adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify after Login Success Message "Hello saravanakonvict!"
    And User should search the hotel by giving inputs to all the fields as per requirement "<Location>" , "<Hotels>" , "<RoomType>" , "<NumberofRooms>" , "<CheckInDate>" , "<CheckOutDate>" , "<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User should verify the success message "select hotel"
    And User should select a hotel from the available list and continue
    Then User must verify the success message "Book A Hotel"

    Examples: 
      | userName        | password | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | saravanakonvict | 9C5STN   | Sydney   | Hotel Creek | Deluxe   | 4 - Four      | 14/12/2022  | 15/12/2022   | 4 - Four      | 0 - None        |

  Scenario Outline: verifying the Select Hotel feature by without selecting a hotel
    Given User is on the Adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify after Login Success Message "Hello saravanakonvict!"
    And User should search the hotel by giving inputs to all the fields as per requirement "<Location>" , "<Hotels>" , "<RoomType>" , "<NumberofRooms>" , "<CheckInDate>" , "<CheckOutDate>" , "<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User should verify the success message "select hotel"
    And User should continue without selecting a hotel from the available list
    Then User should verify the error message "Please Select a Hotel"

    Examples: 
      | userName        | password | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | saravanakonvict | 9C5STN   | Sydney   | Hotel Creek | Deluxe   | 4 - Four      | 14/12/2022  | 15/12/2022   | 4 - Four      | 0 - None        |
