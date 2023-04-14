@HydraUI_LinkedIn
Feature: Verify Facebook Channels

       @UI_ChannelFeatureExecution
  Scenario Outline: Verify channel authentication - Facebook Ads
    Given Start HydraUI
    Then click "Sign Up" button 
    Then Enter username "<lastName>" and "<email>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Enter otp 
    Then Click signUp button on Hydra login dialog
  	When  Click on Payment Plan
    Then Enter "<email>" and "4242424242424242" and "0924" and "999" and "Test User" and "United States" and "Address Line Name" and "Washington" and "34125" and "New York"
	  And click "Continue to Login" button  
    #And Click Login button on Hydra homepage
    And Enter email and "<password>" of the created user
    And Click on the remember password
    And Check the captca
    And Click Login button on Hydra login dialog
    And Enter otp    
    And Click Login button on Hydra login dialog
    Then Click profile icon on dashboard and select My Profile page
     When Authenticate "Facebook Ads" channel
     And Click New Authentication button for first time auth
    Then Click Proceed button
     And Login Facebook
    Then Close authenticated channel added message
    Then Navigate to dashboard
    And Verify channel "Facebook Ads" displayed
    And Verify View All button available in Channels section    
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123| 
     
     
     @UI_ChannelFeatureExecution
  Scenario Outline: Verify channel authentication - Facebook Pages
   Given Start HydraUI
    Then click "Sign Up" button 
    Then Enter username "<lastName>" and "<email>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Enter otp 
    Then Click signUp button on Hydra login dialog
  	When  Click on Payment Plan
    Then Enter "<email>" and "4242424242424242" and "0924" and "999" and "Test User" and "United States" and "Address Line Name" and "Washington" and "34125" and "New York"
	  And click "Continue to Login" button  
    #And Click Login button on Hydra homepage
    And Enter email and "<password>" of the created user
    And Click on the remember password
    And Check the captca
    And Click Login button on Hydra login dialog
    And Enter otp    
    And Click Login button on Hydra login dialog
    Then Click profile icon on dashboard and select My Profile page
     When Authenticate "Facebook Pages" channel
     And Click New Authentication button for first time auth
    Then Click Proceed button
    And Login Facebook
    Then Close authenticated channel added message
    Then Navigate to dashboard
    And Verify channel "Facebook Pages" displayed
    And Verify View All button available in Channels section 
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123| 