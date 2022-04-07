
@test
Feature: Navigation

  @test3
  Scenario: User navigates to the site
    Given user navigates to the website
    When user arrived successfully to the site
    Then user will see a cucumber



    #mvn clean verify -Denvironment=test -Dcucumber.filter.tags="@test"
