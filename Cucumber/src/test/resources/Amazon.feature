@Feature2
Feature: To validate the Login Functionality of Amazon application

@sanity
  Scenario: To validate login by passing values
    And To launch the Amazon Url
    And To click the signin button
    And To pass the Value in Email or Mobile text Field
       #One Dimensional Map
      | email1 | sdf@4                     |
      | email2 | antony.vivek980@gmail.com |
      | email3 | ty@78                     |
    And To click the continue button
    And To pass  password value in the Password text field
       #Two Dimensional Map
      | password1 | password2 |
      | java      | maven     |
      | python    | manual    |
      | selenium  | cucumber  |
    And To click the Signin Button
