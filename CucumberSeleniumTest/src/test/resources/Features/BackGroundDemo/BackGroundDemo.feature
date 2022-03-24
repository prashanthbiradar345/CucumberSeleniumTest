Feature: Check Home Page Functionality

Background: user is logged in
			Given user is on login page
			When user enters username and password
			And clicks on login button
			Then user is navigated to the HomePage 

Scenario: Check Logout link
			When user clicks on welcome link
			Then Logout link is displayed
			
Scenario: verify quick launch toolbar is present
			When user clicks on dashboard link
			Then quickbar toolbar is displayed
			