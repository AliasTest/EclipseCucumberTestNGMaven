  @HydraUserCreation
Feature: Create a user for Hydra

  @HydraAPI_Smoke
  Scenario Outline: Create a valid user for Hydra
    Given Create a user with "<email>" and "<password>" and "<firstName>" and "<lastName>" and "<countryCode>" and "<type>" and "<captchaToken>"       
    Then Verfify the response code should be 200   
    And Verify the data map response body should include the following in any order
    |firstName |Alias|
    |lastName|Last Name|  
   Examples:
      | email  | password | firstName  |lastName|countryCode|type|captchaToken|
      | aliasap2016@gmail.com |Je@123rry123 | Alias |Last Name |+91|user|sduegghuihfvbefivueirvbhifeubh|            
      
      