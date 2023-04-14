@HydraUI_LinkedIn
Feature: Verify LinkedIn Channels

 @UI_RegressionTest @UI_VerifyAllChannelsTestFinal
  Scenario Outline: Verify channel authentication - LinkedIn Pages
    Given Start HydraUI
    Then click "Sign Up" button 
    Then Enter username "<lastName>" and "<email>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Scroll page down
    And Click on Make Payment button
    And Click Login button on Hydra homepage
    And Enter email and "<password>" of the created user
    And Click on the remember password
    And Check the captca
    And Click Login button on Hydra login dialog
    And Enter otp    
    And Click Login button on Hydra login dialog
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "LinkedIn Pages" channel
    And Login LinkedIn
    Then Close authenticated channel added message
    And Verify channel "LinkedIn Pages" displayed
    And Verify View All button available in Channels section    
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123| 
     
 @UI_RegressionTest @UI_VerifyAllChannelsTestFinal
  Scenario Outline: Verify channel authentication - LinkedIn Ads
    Given Start HydraUI
    Then click "Sign Up" button 
    Then Enter username "<lastName>" and "<email>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Scroll page down
    And Click on Make Payment button
    And Click Login button on Hydra homepage
    And Enter email and "<password>" of the created user
    And Click on the remember password
    And Check the captca
    And Click Login button on Hydra login dialog
    And Enter otp    
    And Click Login button on Hydra login dialog
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "LinkedIn Ads" channel
    And Login LinkedIn
    Then Close authenticated channel added message
    And Verify channel "LinkedIn Ads" displayed
    And Verify View All button available in Channels section    
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123| 
     