Feature: Log in web site

  Background:
    Given User is on DemoBlaze home page

  Scenario Outline: User Log In Successful
      When User clicks Log in button
      Then System Opens Log in modal
      When User sends username to Log in modal "<username>"
      And  User sends password to Log in modal "<password>"
      And  User clicks LogIn button in modal
      Then System displays username "<username>"
    Examples:
      | username   | password   |
      | test123_45678 | test123_45678 |
