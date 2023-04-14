  @HydraForgotPassword
Feature: Verify forgot password

  @HydraAPI_Smoke
  Scenario Outline: Verify forgot password
    Given Create a user with "<email>" and "<password>" and "<firstName>" and "<lastName>" and "<countryCode>" and "<type>" and "<captchaToken>"       
    Then Verfify the response code should be 200
    When Send forgot password link    
    Then Verify the data map response body should include the following in any order
    |message |OTP has been send to desired phone numbers|    
       
   Examples:
      | email  | password | firstName  |lastName|countryCode|mobile|type|captchaToken|
      | aliasap2016@gmail.com |Je@123rry123 | Alias |Last Name |+91|9447901117|user|sdueggrhuihfvbefivueirvbhifeubh| 