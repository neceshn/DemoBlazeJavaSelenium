Feature: Sign up on web site

  Background:
  Given User is on DemoBlaze home page

    Scenario Outline: Sign up new user

      When User clicks Sign up button
      Then System displays Sign up modal
      When User sends username as"<username>"
      And  User sends password as "<password>"
      And  User clicks Sign up button for register
      Then System displays successful message "Sign up successful."
      Examples:
        | username    | password   |
        | test123_456789_ | test123_456789_ |
