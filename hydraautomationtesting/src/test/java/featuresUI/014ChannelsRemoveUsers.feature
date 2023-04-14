@HydraUI_RemoveUsers
Feature: Verify Remove User Feature

    @UI_VerifyRemoveUser @UI_RegressionTest
  Scenario Outline: Verify Remove Users for Google Analtyics
  	Given Start HydraUI
    Then click "Sign Up" button 
    Then Enter username "<lastName>" and "<email>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Enter otp   
    And Click on Sign up button 
    And Scroll page down
    Then click team Buy Plan button 
    Then Enter "<email>" and "4242424242424242" and "0924" and "999" and "Test User" and "United States" and "Address Line Name" and "Washington" and "34125" and "New York"
    And click "Continue to Login" button
    And Enter email and "<password>" of the created user
    And Click on the remember password
    And Check the captca
    And Click Login button on Hydra login dialog
    And Enter otp    
    And Click Login button on Hydra login dialog 
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google Analytics" channel
    And Click New Authentication button for first time auth
    Then Click Proceed button
    And Login Google page  
    Then Close authenticated channel added message
    Then Navigate to dashboard   
    And Verify channel "Google Analytics" displayed
    Then Click View All button
    Then Select "Google Analytics" view channel
    Then Click on "NewTestAutomationAccount"
    And Enter "<emailUser>", select role as "Viewer" and click Add User    
    Then Click on search Button for user with "<emailUser>"
    Then Verify new added user with "<emailUser>"
    Then Click on Edit Button for user with "<emailUser>"
    And Click on Remove User button
    Then Click Proceed button to remove channel user
    Then Click on "NewTestAutomationAccount"
    Then Click on search Button for user with "<emailUser>"
    Then Verify absence of "<emailUser>" detials
    
    
 Examples:
    |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|emailUser|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|hydratestautomation1@gmail.com|           
     
       @UI_VerifyRemoveUser @UI_RegressionTest @UI_VerifyAllChannelsTestFinal
  Scenario Outline: Verify Remove Users for Google Merchant Center
   	Given Start HydraUI
    Then click "Sign Up" button 
    Then Enter username "<lastName>" and "<email>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Enter otp   
    And Click on Sign up button 
    And Scroll page down
    Then click team Buy Plan button 
    Then Enter "<email>" and "4242424242424242" and "0924" and "999" and "Test User" and "United States" and "Address Line Name" and "Washington" and "34125" and "New York"
    And click "Continue to Login" button
    And Enter email and "<password>" of the created user
    And Click on the remember password
    And Check the captca
    And Click Login button on Hydra login dialog
    And Enter otp    
    And Click Login button on Hydra login dialog 
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google Merchant Center" channel
    And Click New Authentication button for first time auth
    Then Click Proceed button
    And Login Google page  
    Then Close authenticated channel added message
   	#When Open side bar menu
    Then Navigate to dashboard   
    And Verify channel "Google Merchant Center" displayed
    Then Click View All button
    Then Select "Google Merchant Center" view channel
    Then Click on "abcd"
    And Enter "<emailUser>", select role as "Admin" and click Add User    
    Then Click on search Button for user with "<emailUser>"
    Then Verify new added user with "<emailUser>"
    Then Click on Edit Button for user with "<emailUser>"
    And Click on Remove User button
    Then Click Proceed button to remove channel user
    Then Click on "abcd"
    Then Click on search Button for user with "<emailUser>"
    Then Verify absence of "<emailUser>" detials
    
 Examples:
         |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|emailUser|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|hydratestautomation1@gmail.com|  
     
      @UI_VerifyRemoveUser @UI_RegressionTest @UI_VerifyAllChannelsTestFinal
  Scenario Outline: Verify Remove Users for Google My Business
  
Given Start HydraUI
    Then click "Sign Up" button 
    Then Enter username "<lastName>" and "<email>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Enter otp   
    And Click on Sign up button 
    And Scroll page down
    Then click team Buy Plan button 
    Then Enter "<email>" and "4242424242424242" and "0924" and "999" and "Test User" and "United States" and "Address Line Name" and "Washington" and "34125" and "New York"
    And click "Continue to Login" button
    And Enter email and "<password>" of the created user
    And Click on the remember password
    And Check the captca
    And Click Login button on Hydra login dialog
    And Enter otp    
    And Click Login button on Hydra login dialog 
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google My Business" channel
    And Click New Authentication button for first time auth
    Then Click Proceed button
    And Login Google page  
    Then Close authenticated channel added message
   	#When Open side bar menu
    Then Navigate to dashboard   
    And Verify channel "Google My Business" displayed
    Then Click View All button
    Then Select "Google My Business" view channel
    Then Click on "Hydra"
    And Enter "<emailUser>", select role as "Owner" and click Add User    
    Then Click on search Button for user with "<emailUser>"
    Then Verify new added user with "<emailUser>"
    Then Click on Edit Button for user with "<emailUser>"
    And Click on Remove User button
    Then Click Proceed button to remove channel user
    Then Click on "Hydra"
    Then Click on search Button for user with "<emailUser>"
    Then Verify absence of "<emailUser>" detials  
    
    
 Examples:
      |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|emailUser|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|hydratestautomation1@gmail.com|  
     
     @UI_VerifyRemoveUser @UI_RegressionTest @UI_VerifyAllChannelsTestFinal
  Scenario Outline: Verify Remove Users for Google Tag Manager
  
  	Given Start HydraUI
    Then click "Sign Up" button 
    Then Enter username "<lastName>" and "<email>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Enter otp   
    And Click on Sign up button 
    And Scroll page down
    Then click team Buy Plan button 
    Then Enter "<email>" and "4242424242424242" and "0924" and "999" and "Test User" and "United States" and "Address Line Name" and "Washington" and "34125" and "New York"
    And click "Continue to Login" button
    And Enter email and "<password>" of the created user
    And Click on the remember password
    And Check the captca
    And Click Login button on Hydra login dialog
    And Enter otp    
    And Click Login button on Hydra login dialog 
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google Tag Manager" channel
    And Click New Authentication button for first time auth
    Then Click Proceed button
    And Login Google page  
    Then Close authenticated channel added message
   	#When Open side bar menu
    Then Navigate to dashboard   
    And Verify channel "Google Tag Manager" displayed
    Then Click View All button
    Then Select "Google Tag Manager" view channel
    Then Click on "www.test.com (page1)"
    And Enter "<emailUser>", select role as "User" and click Add User    
    Then Click on search Button for user with "<emailUser>"
    Then Verify new added user with "<emailUser>"
    Then Click on Edit Button for user with "<emailUser>"
    And Click on Remove User button
    Then Click Proceed button to remove channel user
    Then Click on "www.test.com (page1)"
    Then Click on search Button for user with "<emailUser>"
    Then Verify absence of "<emailUser>" detials  
 
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|emailUser|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|hydratestautomation1@gmail.com|  