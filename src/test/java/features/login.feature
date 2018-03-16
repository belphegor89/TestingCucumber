Feature: Login
    
Scenario: login with username and password
     Given user is on Violity home page
     When user clicks on login link and enters credentials
     Then validate user icon is displayed