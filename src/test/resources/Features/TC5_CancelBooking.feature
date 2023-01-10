@eta
Feature: Verifying the Adactin Hotel site Cancel Booking feature

  Scenario Outline: verifying the Booked order Cancel feature
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
    And User should cancel the Generated order Id.
    Then User need to verify the success message "The booking has been cancelled."

    Examples: 
      | userName        | password | Location | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom | FirstName | LastName | BillingAddress |
      | saravanakonvict | 9C5STN   | Sydney   | Hotel Creek | Deluxe   | 4 - Four      | 14/12/2022  | 15/12/2022   | 4 - Four      | 0 - None        | Saravana  | Kumar    | Chennai        |

  Scenario Outline: verifying the Existing order Cancel feature
    Given User is on the Adactin Page
    When User should perform login "<userName>","<password>"
    Then User should verify after Login Success Message "Hello saravanakonvict!"
    And User should cancel the required Existing order Id "<OrderId>"
    Then User Should verify the success cancellation message "The booking has been cancelled."

    Examples: 
      | userName        | password | OrderId    |
      | saravanakonvict | 9C5STN   | T8FZVS1871 |
