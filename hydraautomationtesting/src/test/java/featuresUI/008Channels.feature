@HydraUI_Channels
Feature: Verify Channels 

 @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify Channels list on side bar 	
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
    And Verify the listed channles list on side bar
    
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|
     
   @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify channel authentication - Google Analytics
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
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |ashwinhautomation@gmail.com |+91|Automation@1| Automation@1|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123| 
 
   @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify channel authentication - Google Tag Manager
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
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123| 
   
    
     @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify channel authentication - Google Ads
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
    When Authenticate "Google Ads" channel
    And Click New Authentication button for first time auth
    And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    And Verify channel "Google Ads" displayed  
     
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |ashwinhautomation@gmail.com |+91|Automation@1| Automation@1|
  
      @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify channel authentication - Google Merchant Center
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
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|
    
   @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify channel authentication - Google My Business
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
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|
    
     @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify channel authentication - Google Search Console
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
    When Authenticate "Google Search Console" channel
    And Click New Authentication button for first time auth
    And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
   
    And Verify channel "Google Search Console" displayed       
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|
    
    
  @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify channel authentication - LinkedIn Pages
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
    When Authenticate "LinkedIn Pages" channel
    And Click New Authentication button for first time auth
    Then Click Proceed button
    And Login LinkedIn   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    And Verify channel "LinkedIn Pages" displayed    
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|           
     
    
    
  @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify channel authentication - LinkedIn Ads
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
    When Authenticate "LinkedIn Ads" channel
    And Click New Authentication button for first time auth
    Then Click Proceed button
    And Login LinkedIn   
    Then Close authenticated channel added message
    Then Navigate to dashboard
   
    And Verify channel "LinkedIn Ads" displayed       
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|           
     
   
      
    @UI_RegressionTest @UI_RegressionPriorityItem
  Scenario Outline: Verify channel - Filter
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
    Then Enter "<email>" and "<cardInformation>" and "<expiryDate>" and "<CVC>" and "<nameOnCard>" and "<billingAddressCountry>" and "<addressLine>" and "<city>" and "<PIN>" and "<State>"
    And click "Continue to Login" button
    #And Click Login button on Hydra homepage
    And Enter email and "<password>" of the created user
    And Click on the remember password
    And Check the captca
    And Click Login button on Hydra login dialog
    And Enter otp
    And Click Login button on Hydra login dialog
    When Click profile icon on dashboard and select My Profile page
    When Authenticate "Google Analytics" channel
    And Click New Authentication button for first time auth
    And Login Google page  
    Then Close authenticated channel added message
   	When Authenticate "Google Tag Manager" channel
   	And Click New Authentication button for first time auth
    And Login Google page
    Then Close authenticated channel added message
    When Open side bar menu
    And Click on Dashboard meu    
    And Verify View All button available in Channels section    
    And Click on View All button available in Channels section
    And Click on Filter channel button
    And Click on first check box to filter channel    
    And Verify the Google Analytics not displayed on channel list
    And Click on Edit channel button  
    
    #comment    
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|                 
        
         #
#@UI_SmokeTest @UI_RegressionPriorityItem
  #Scenario Outline: Edit permissions of a user - Facebook Pages
     #Given Start HydraUI
    #Then click "Sign Up" button 
    #Then Enter username "<lastName>" and "<email>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    #And Check the captca     
    #And Scroll page down
    #And Click on Sign up button
    #And Enter otp   
    #And Click on Sign up button 
    #And Scroll page down
    #And Click on Make Payment button
    #And Click Login button on Hydra homepage
    #And Enter email and "<password>" of the created user
    #And Click on the remember password
    #And Check the captca
    #And Click Login button on Hydra login dialog
    #And Enter otp    
    #And Click Login button on Hydra login dialog   
    #When Click profile icon on dashboard and select My Profile page
   #	When Authenticate "Facebook Pages" channel
    #And Login Google
    #Then Close authenticated channel added message
    #When Open side bar menu
    #And Click on Dashboard meu
    #And Click on View All button available in Channels section
    #And Click on View Channel link
    #And Click on "My new Hydra Business"
    #And Click on Edit permissions
    #And Change the user role to "Manager"
    #And Click on save permissions
    #And Click on button to go back to previous page
    #And Click on button to go back to previous page
    #And Click on View All button available in Channels section
    #And Click on View Channel link
    #And Click on "My new Hydra Business"
    #And Verify the permission role is "Manager"
    #And Click on Edit permissions
    #And Change the user role to "Owner"
    #And Click on save permissions 
 #Examples:
     #|lastName| email  | countryCode|password|retypePassword|
     #|TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|     
   #
   #@UI_SmokeTest @UI_RegressionPriorityItem
  #Scenario Outline: Edit permissions of a user - Facebook Ads
     #Given Start HydraUI
    #Then click "Sign Up" button 
    #Then Enter username "<lastName>" and "<email>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    #And Check the captca     
    #And Scroll page down
    #And Click on Sign up button
    #And Enter otp   
    #And Click on Sign up button 
    #And Scroll page down
    #And Click on Make Payment button
    #And Click Login button on Hydra homepage
    #And Enter email and "<password>" of the created user
    #And Click on the remember password
    #And Check the captca
    #And Click Login button on Hydra login dialog
    #And Enter otp    
    #And Click Login button on Hydra login dialog   
    #When Click profile icon on dashboard and select My Profile page
   #	When Authenticate "Facebook Ads" channel
    #And Login Google
    #Then Close authenticated channel added message
    #When Open side bar menu
    #And Click on Dashboard meu
    #And Click on View All button available in Channels section
    #And Click on View Channel link
    #And Click on "My new Hydra Business"
    #And Click on Edit permissions
    #And Change the user role to "Manager"
    #And Click on save permissions
    #And Click on button to go back to previous page
    #And Click on button to go back to previous page
    #And Click on View All button available in Channels section
    #And Click on View Channel link
    #And Click on "My new Hydra Business"
    #And Verify the permission role is "Manager"
    #And Click on Edit permissions
    #And Change the user role to "Owner"
    #And Click on save permissions 
 #Examples:
     #|lastName| email  | countryCode|password|retypePassword|
     #|TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|
     
     
 @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify All authenticated channels in the channel list
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
     
   # Then Click profile icon on dashboard and select My Profile page
   # When Authenticate "Twitter Ads" channel
    #And Login Twitter   
   # Then Close authenticated channel added message
    #Then Verify "Twitter Ads" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google Analytics" channel
     And Click New Authentication button for first time auth
    And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Analytics" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
   	When Authenticate "Google Tag Manager" channel
    And Click New Authentication button for first time auth
  #  And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Tag Manager" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "LinkedIn Pages" channel
     And Click New Authentication button for first time auth
    Then Click Proceed button
    And Login LinkedIn
    Then Close authenticated channel added message
      Then Navigate to dashboard
    Then Verify "LinkedIn Pages" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "LinkedIn Ads" channel
     And Click New Authentication button for first time auth
    Then Click Proceed button
    #And Login LinkedIn
    Then Close authenticated channel added message
      Then Navigate to dashboard
    Then Verify "LinkedIn Ads" is authenticated and present in workspace
   # Then Click profile icon on dashboard and select My Profile page
   # When Authenticate "Facebook Ads" channel
   # And Login Facebook
   # Then Close authenticated channel added message
   # Then Verify "Facebook Ads" is authenticated and present in workspace
   # Then Click profile icon on dashboard and select My Profile page
   # When Authenticate "Facebook Pages" channel
   # And Login Facebook
   # Then Close authenticated channel added message
   # Then Verify "Facebook Pages" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google Ads" channel
    And Click New Authentication button for first time auth
   # And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Ads" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google Merchant Center" channel
  And Click New Authentication button for first time auth
   # And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Merchant Center" is authenticated and present in workspace
     Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google My Business" channel
  And Click New Authentication button for first time auth
   # And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google My Business" is authenticated and present in workspace
     Then Click profile icon on dashboard and select My Profile page
     When Authenticate "Google Search Console" channel
   And Click New Authentication button for first time auth
 #   And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Search Console" is authenticated and present in workspace
   
       
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |Automation |ashwinhautomationtesting@gmail.com |+91|Automation@1| Automation@1|  

     
        @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify All authenticated channels in the channel list have the correct count
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
    Then Verify "Google Analytics" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
   	When Authenticate "Google Tag Manager" channel
    And Click New Authentication button for first time auth
  #  And Login Google   
   Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Tag Manager" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
   When Authenticate "LinkedIn Pages" channel
     And Click New Authentication button for first time auth
    Then Click Proceed button
    And Login LinkedIn
    Then Close authenticated channel added message
      Then Navigate to dashboard
    Then Verify "LinkedIn Pages" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "LinkedIn Ads" channel
     And Click New Authentication button for first time auth
    Then Click Proceed button
    #And Login LinkedIn
    Then Close authenticated channel added message
      Then Navigate to dashboard
    Then Verify "LinkedIn Ads" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
      When Authenticate "Facebook Ads" channel
     And Click New Authentication button for first time auth
    Then Click Proceed button
     And Login Facebook
    Then Close authenticated channel added message
    Then Navigate to dashboard
   Then Verify "Facebook Ads" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Facebook Pages" channel
  And Click New Authentication button for first time auth
    Then Click Proceed button
  #   And Login Facebook
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Facebook Pages" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google Ads" channel
  #  And Login Google
    Then Close authenticated channel added message 
    And Click New Authentication button for first time auth
  #  And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Ads" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google Merchant Center" channel
   And Click New Authentication button for first time auth
 #   And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Merchant Center" is authenticated and present in workspace
     Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google My Business" channel
   And Click New Authentication button for first time auth
 #   And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google My Business" is authenticated and present in workspace
     Then Click profile icon on dashboard and select My Profile page
     When Authenticate "Google Search Console" channel
 And Click New Authentication button for first time auth
   # And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Search Console" is authenticated and present in workspace
    Then Click View All button
    Then Check for channel count
    
           
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |Automation |ashwinhautomationtesting@gmail.com |+91|Automation@1| Automation@1| 
     
     
 @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify All Pages and Permissions count
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
    Then Verify "Google Analytics" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
   	When Authenticate "Google Tag Manager" channel
    And Click New Authentication button for first time auth
  #  And Login Google   
   Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Tag Manager" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
   When Authenticate "LinkedIn Pages" channel
     And Click New Authentication button for first time auth
    Then Click Proceed button
    And Login LinkedIn
    Then Close authenticated channel added message
      Then Navigate to dashboard
    Then Verify "LinkedIn Pages" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "LinkedIn Ads" channel
     And Click New Authentication button for first time auth
    Then Click Proceed button
    #And Login LinkedIn
    Then Close authenticated channel added message
      Then Navigate to dashboard
    Then Verify "LinkedIn Ads" is authenticated and present in workspace
   # Then Click profile icon on dashboard and select My Profile page
   #   When Authenticate "Facebook Ads" channel
   ##  And Click New Authentication button for first time auth
    #Then Click Proceed button
    # And Login Facebook
    #Then Close authenticated channel added message
    #Then Navigate to dashboard
    #And Verify channel "Facebook Ads" displayed
    #Then Click profile icon on dashboard and select My Profile page
    # Then Verify "Facebook Pages" is authenticated and present in workspace
  #And Click New Authentication button for first time auth
  #  Then Click Proceed button
   #  And Login Facebook
   # Then Close authenticated channel added message
    #Then Navigate to dashboard
   # Then Verify "Facebook Pages" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google Ads" channel
  #  And Login Google
    Then Close authenticated channel added message 
    And Click New Authentication button for first time auth
  #  And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Ads" is authenticated and present in workspace
    Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google Merchant Center" channel
   And Click New Authentication button for first time auth
 #   And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Merchant Center" is authenticated and present in workspace
     Then Click profile icon on dashboard and select My Profile page
    When Authenticate "Google My Business" channel
   And Click New Authentication button for first time auth
 #   And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google My Business" is authenticated and present in workspace
     Then Click profile icon on dashboard and select My Profile page
     When Authenticate "Google Search Console" channel
 And Click New Authentication button for first time auth
   # And Login Google   
    Then Close authenticated channel added message
    Then Navigate to dashboard
    Then Verify "Google Search Console" is authenticated and present in workspace
   # Then Verify Pages and Permissions count for Facebook Pages
   # Then Verify Pages and Permissions count for Facebook Ads
    Then Verify Pages and Permissions count for Google Analytics
    Then Verify Pages and Permissions count for Google Search Consoles
    Then Verify Pages and Permissions count for Google My Business
    Then Verify Pages and Permissions count for Google Merchant Center
    Then Verify Pages and Permissions count for Google Ads
    Then Verify Pages and Permissions count for Google Tag Manager
    Then Verify Pages and Permissions count for Linkedin Ads
    Then Verify Pages and Permissions count for Linkedin Pages
  #  Then Verify Pages and Permissions count for Twitter Ads
        
           
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |Automation |ashwinhautomationtesting@gmail.com |+91|Automation@1| Automation@1|      
  
     