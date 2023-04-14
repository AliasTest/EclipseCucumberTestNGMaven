@HydraUI_Channels
Feature: Verify Add User Feature
            @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify Add Users for Google Analtyics
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
    When Authenticate "Google Analytics" channel
    And Click New Authentication button for first time auth
    And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard   
    And Verify channel "Google Analytics" displayed
    Then Click View All button
    Then Select "Google Analytics" view channel
    Then Select Google Analtyics Channel
    And Enter "<email>", select role as "Editor" and click Add User for Google Analytics
    Then Verify new added user with "<email>"
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |ashwinhautomationtesting@gmail.com |+91|Automation@1| Automation@1| 
     
        @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify Add Users for Google Merchant Center
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
    When Authenticate "Google Merchant Center" channel
     And Click New Authentication button for first time auth
    And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    
     And Verify channel "Google Merchant Center" displayed
    Then Click View All button
    Then Select "Google Merchant Center" view channel
   Then Select Google Merchant Center Channel
    And Enter "<email>", select role as "Reporting manager" and click Add User
    Then Verify new added user with "<email>"
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |ashwinhautomationtesting@gmail.com |+91|Automation@1| Automation@1|
     
        @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify Add Users for Google My Business
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
    When Authenticate "Google My Business" channel
    And Click New Authentication button for first time auth
    And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    And Verify channel "Google My Business" displayed
    Then Click View All button
    Then Select "Google My Business" view channel
    Then Select Google My Business Channel
    And Enter "<email>", select role as "Manager" and click Add User
    Then Verify new added user with "<email>"
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |ashwinhautomationtesting@gmail.com |+91|Automation@1| Automation@1|  
     
        @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify Add Users for Google Tag Manager
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
    When Authenticate "Google Tag Manager" channel
    And Click New Authentication button for first time auth
    And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
   
    And Verify channel "Google Tag Manager" displayed
    Then Click View All button
    Then Select "Google Tag Manager" view channel
    Then Select Google Tag Manager Channel
    And Enter "<email>", select role as "User" and click Add User for Tag Manager
    Then Verify new added user with "<email>"
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |ashwinhautomationtesting@gmail.com |+91|Automation@1| Automation@1| 