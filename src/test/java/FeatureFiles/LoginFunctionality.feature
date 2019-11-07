Feature: User is going to login Website
  Background: User is going to do something
    Given nnn
    When ggg
    Then hhh

  @SmokeTest
  Scenario: User is going to login successfully
    Given User will navigate to the website
    When User login into application with "Tim" and "1234"
    Then DashBoard will appear with "True"
    And user will see something

     @Regression
  Scenario: User is going to login
    Given User will navigate to the website
    When User login into application with "Anna" and "126634"
    Then DashBoard will appear with "False"
    And user will see something
  @SmokeTest
  Scenario: User is going to Sign in
    Given User will navigate to the website
    When User sign into application with following information
    |name|lastname|Address|DOB|USA|Email|Phone|
    Then DashBoard will appear with "False"
    And user will see something
  @SmokeTest
    Scenario Outline: User is going to Login
      Given User will navigate to the website
      When User login into  with "<username>" and "<password>"
      Then DashBoard will appear with
      Examples:
      |username|password|
      |user1|password1|
      |user2|password2|
      |user3|password3|
      |user4|password4|
      |user4|password5|

