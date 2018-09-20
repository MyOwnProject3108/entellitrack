Feature: entellitrack functionality

  @test1
  Scenario:Verify form submission
    Given I am on the "https://ca-acms-dev.entellitrak.com/etk-ca-acms-dev" page
    When I SignIn with username "avali" and password "Testing!234"
    Then I should be on the "home" page
    When I navigate to the New Appeal page
    And I click on Search Claimant button
    And I select any random Claimant
    And I select Type of Hearing Request with the option "Verbal"
    And I click Review Task Required as "Yes"
    And I select Program as "CalFresh"
    And I select Sub-Program as "CalFresh Eligibility"
    And I select Responsible Agency as "Covered California"
    And I enter Issue Description as "Test"
    And I select Preferred Language "ENGLISH"
    And I select Preferred Communication Method as "Email Address"
    And I select Hearing Modality as "Phone"
    And I click Expedited Hearing Requested as "Yes"
    And I enter Reason for Expedite Request as "test"
    And I click on Save button
    Then I should be on the "tracking" page



