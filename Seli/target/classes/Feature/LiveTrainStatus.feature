Feature: Live trian status
  Scenario: Check the live status of the train
  // Given I launch the url
    And I click on Train Information dropdown on the header
    And I select Live Train Status
    And I verify you will get Search by Train section
    And I print the Text field heading
    And I enter "22806" in the text field
    And I verify the below train detail is displayed in suggestion
      |  22806 - ANAND VIHAR T - BHUBANESWAR Weekly SF Exp  |
    And I Click on Check Status
    And I Verify the below columns were displayed
      | Arrival   |
      | Station   |
      | Departure |
