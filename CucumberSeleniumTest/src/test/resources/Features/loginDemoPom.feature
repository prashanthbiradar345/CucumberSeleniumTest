Feature: Test Login Functiona;ity

	Scenario Outline:  Check if login is successfull with valid Credentials
	 Given Browser is opened state
	 And user is on login page Pom
	 When user enter the <username1> and <password1>
	 Then user clicks on login button
	 Then user is navigated to  home page
	 
	 Examples:
			|username1 | password1|
			| Raghav  | 12345 	|
			| ele			| 12345		|
	 