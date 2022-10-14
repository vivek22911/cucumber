@Feature1
Feature:To validate the Login Functionality of Facebook application


@smoke
Scenario:To validate login with valid username and valid password

And To launch the Facebook Url
And To pass the Valid Email to the Email text Field
And To pass  the Valid password to the Password text field
And To click the Login Button

@Regression
Scenario Outline: To pass the positive and negative testcases to validate the login function

And   Launch the Facebook Url
And   pass the positive and negative "<emailId>" to the Email text Field
And   pass the positive and negative "<passwordId>"to the Password text field
And   click the Login Button


Examples:

  |emailId|passwordId|
  |selen12|rty@456   |
  |one@er |java789   |
  |python4|photon45  |







