Feature: Test Login Functiona;ity

	Scenario Outline:  Check if login is successfull with valid Credentials
	 Given Browser is opened
	 And user is on login page
	 When user enters <username> and <password>
	 Then user clicks on login
	 Then user is navigated to the home page
	 
	 Examples:
			|username | password|
			| Raghav  | 12345 	|
			| ele			| 12345		|
	 