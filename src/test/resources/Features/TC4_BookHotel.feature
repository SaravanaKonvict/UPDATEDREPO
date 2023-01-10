@zeta
Feature: Verifying the Adactin Hotel site Booking Confirmation feature

  Scenario Outline: verifying the Booking confirmation feature by giving input to all the fields
    Given User is on the Adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify after Login Success Message "Hello saravanakonvict!"
    And User should search the hotel by giving inputs to all the fields as per requirement "<Location>" , "<Hotels>" , "<RoomType>" , "<NumberofRooms>" , "<CheckInDate>" , "<CheckOutDate>" , "<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User should verify the success message "select hotel"
    And User should select a hotel from the available list and continue
    Then User should verify the success message "Book A Hotel"
    And User should book the hotel by giving inputs to all the mandatory fields "<FirstName>" , "<LastName>" and "<BillingAddress>"
      | CreditCardNo     | CreditCardType   | ExpiryMonth | ExpiryYear | CVVNumber |
      | 6063515267119898 | American Express | December    |       2022 |       711 |
      | 8063515267119898 | Visa             | December    |       2026 |       821 |
      | 7063515267119898 | Master Card      | December    |       2024 |       670 |
      | 6663515267119898 | Other            | December    |       2025 |       633 |
    Then User should verify the success message "Booking Confirmation" and save the Order No.

    Examples: 
      | userName        | password | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom | FirstName | LastName | BillingAddress |
      | saravanakonvict | 9C5STN   | Sydney   | Hotel Creek | Deluxe   | 4 - Four      | 14/12/2022  | 15/12/2022   | 4 - Four      | 0 - None        | Saravana  | Kumar    | Chennai        |

  Scenario Outline: verifying the Booking Confirmation feature without giving any inputs
    Given User is on the Adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify after Login Success Message "Hello saravanakonvict!"
    And User should search the hotel by giving inputs to all the fields as per requirement "<Location>" , "<Hotels>" , "<RoomType>" , "<NumberofRooms>" , "<CheckInDate>" , "<CheckOutDate>" , "<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User should verify the success message "select hotel"
    And User should select a hotel from the available list and continue
    Then User should verify the success message "Book A Hotel"
    And User should click book now
    Then User should verify the following error messages "Please Enter your First Name" , "Please Enter you Last Name" , "Please Enter your Address" , "Please Enter your 16 Digit Credit Card Number" , "Please Select your Credit Card Type" , "Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName        | password | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | saravanakonvict | 9C5STN   | Sydney   | Hotel Creek | Deluxe   | 4 - Four      | 14/12/2022  | 15/12/2022   | 4 - Four      | 0 - None        |
