@web @darkSky
Feature: darkSky feature

# Background:
    # Given I am on dark sky page

#1
  @darkSky-1
  Scenario: Verify Current Temperature should not be greater or less than the Temperature from Daily Timeline
    Given I am on DarkSky Home Page
    Then I verify current temp is not greater or less then temps from daily timeline
#2
  @darkSky-2
  Scenario: Verify timeline is displayed in correct format
    When I am on DarkSky home page
    Then I verify timeline is displayed with two hours incremented
#3
  @darkSky-3
  Scenario: Verify individual day temp timeline
    Given I am on DarkSky Home Page
    When I expand todays timeline
    Then I verify lowest and highest temp is displayed correctly
#4
  @darkSky-4
  Scenario: Verify invalid signUp error message
    Given I am on the darkSky Register page
    When I click on Register button
    Then I verify I am on Register page by asserting Register header