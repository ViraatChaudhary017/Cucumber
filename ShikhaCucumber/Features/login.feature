Feature: feature to test login functionality

  @tag1
  Scenario: Check login is successful with valid credentials
    Given user is launching crome browser
    When user navigates URL "https://www.gmail.com"
		When Provide email "test@mail.com"
  

 