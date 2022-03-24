$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Hooksfetaures/HooksDemo.feature");
formatter.feature({
  "name": "Feature to test  login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check login Successful with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User  on a login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepForHooks.HooksDemoSteps.user_on_a_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepForHooks.HooksDemoSteps.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "clicks on a login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepForHooks.HooksDemoSteps.clicks_on_a_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepForHooks.HooksDemoSteps.user_is_navigated_to_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});