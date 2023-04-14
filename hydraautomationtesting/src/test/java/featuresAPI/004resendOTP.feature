  @HydraResentOTP
Feature: Verify resend OTP

  @HydraAPI_Smoke
  Scenario Outline: Verify resend OTP for the login user
    Given Create a user with "<email>" and "<password>" and "<firstName>" and "<lastName>" and "<countryCode>" and "<type>" and "<captchaToken>"
    Then Verfify the response code should be 200   
    And Login with the created user "<email>" and "<password>" and "<captchaToken>" 
    And Send OTP
    Then Verify the data user map response body should include the following in any order
    |firstName |Alias|
    |lastName|Last Name|    
    When Resend OTP
    Then Verify the data map response body should include the following in any order
    |firstName |Alias|
    |lastName|Last Name|  
    And Verify OTP received
       
   Examples:
      | email  | password | firstName  |lastName|countryCode|mobile|type|captchaToken|
      | aliasap2016@gmail.com |Je@123rry123 | Alias |Last Name |+91|9447901117|user|sdueggrhuihfvbefivueirvbhifeubh| 