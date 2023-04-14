@HydraUI_Channels
Feature: Verify Edit Users 
  
     @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify Edit Users Redirect for Facebook Pages
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
    Then Click View All button
    Then Select "Facebook Pages" view channel
    #Then Click "Hihydrapoc" channel name
    Then Click Edit User button
    And Verify that user is redirected to "business.facebook.com"
    
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |ashwinhautomationtesting@gmail.com |+91|Automation@1| Automation@1|
     
      @UI_RegressionPriorityItem1
  Scenario Outline: Verify Edit Users Redirect for Facebook Ads
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
   
    And Verify channel "Facebook Pages" displayed
    Then Click View All button
    Then Select "Facebook Ads" view channel
    #Then Click "Hihydrapoc" channel name
    Then Click Edit User button
    And Verify that user is redirected to "business.facebook.com"
    
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |ashwinhautomationtesting@gmail.com |+91|Automation@1| Automation@1|
     
    @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify Edit Users Redirect for LinkedIn Pages
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
    Then Click View All button
    Then Select "LinkedIn Pages" view channel
    #Then Click "Hihydrapoc" channel name
    Then Click Edit User button
      And Verify that user is redirected to "linkedin.com"
    
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |ashwinhautomationtesting@gmail.com |+91|Automation@1| Automation@1|
     
     @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify Edit Users Redirect for LinkedIn Ads
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
    Then Click View All button
    Then Select "LinkedIn Ads" view channel
    #Then Click "Hihydrapoc" channel name
    Then Click Edit User button
    And Verify that user is redirected to "linkedin.com"
    
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |ashwinhautomationtesting@gmail.com |+91|Automation@1| Automation@1|
     
     @UI_RegressionPriorityItem_Channels
  Scenario Outline: Verify Edit Users Redirect for Google Search Console
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
    Then Click View All button
    Then Select "Google Search Console" view channel
    #Then Click "Hihydrapoc" channel name
    Then Click Redirect to account button
    And Verify that user is redirected to "search.google.com/"
    
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|
     |TestLast Name |ashwinhautomationtesting@gmail.com |+91|Automation@1| Automation@1|
     
     
        @UI_SmokeTest @UI_RegressionPriorityItem_Channels
  Scenario Outline: Edit permissions of a user - Google Analytics
    Given Start HydraUI
    Given Start HydraUI
    Then click "Sign Up" button 
    Then Enter username "TestUser" and "<Admin user email>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Enter otp 
    Then Click signUp button on Hydra login dialog
  	When  Click on Payment Plan
    Then Enter "<Admin user email>" and "4242424242424242" and "0924" and "999" and "Test User" and "United States" and "Address Line Name" and "Washington" and "34125" and "New York"
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
    And Click on View All button available in Channels section
    And Click on View Channel link
    And Click on "ashwinhautomationtesting@gmail.com"
    And Click on Edit permissions
    And Change the user role to "Editor"
    And Click on save permissions
    And Click on button to go back to previous page
    And Click on button to go back to previous page
    And Click on View All button available in Channels section
    And Click on View Channel link
    And Click on "ashwinhautomationtesting@gmail.com"
    And Click on Edit permissions
    And Verify the permission role is "Editor"
    And Change the user role to "Viewer"
    And Click on save permissions    
    
 Examples:
     |Admin user email| password|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |aliashydratestautoamtion2@gmail.com|Alias@123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|                     
     
      @UI_SmokeTest @UI_RegressionPriorityItem_Channels
  Scenario Outline: Edit permissions of a user - Google Tag Manager
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
    When Open side bar menu
    And Click on Dashboard meu
    And Click on View All button available in Channels section
    And Click on View Channel link
    And Click on "ashwinhautomation@gmail.com"
    And Click on Edit permissions
    And Change the user role to "Administrator"
    And Click on save permissions
    And Click on button to go back to previous page
    And Click on button to go back to previous page
    And Click on View All button available in Channels section
    And Click on View Channel link
    And Click on "ashwinhautomation@gmail.com"
    And Verify the permission role is "Administrator"
    And Click on Edit permissions    
    And Change the user role to "User"
    And Click on save permissions 
 Examples:
     |lastName|email| countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast|aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|                 
     
   @UI_SmokeTest @UI_RegressionPriorityItem_Channels
  Scenario Outline: Edit permissions of a user - Google Merchant Center
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
    When Open side bar menu
    And Click on Dashboard meu
    And Click on View All button available in Channels section
    And Click on View Channel link
    And Click on "ashwinhautomationtesting@gmail.com"
    And Click on Edit permissions
    And Change the user role to "Admin"
    And Click on save permissions
    And Click on button to go back to previous page
    And Click on button to go back to previous page
    And Click on View All button available in Channels section
    And Click on View Channel link
    And Click on "ashwinhautomationtesting@gmail.com"
    And Verify the permission role is "Admin , Reporting manager"
    And Click on Edit permissions
    And Change the user role to "Reporting manager"
    And Click on save permissions 
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|                 
     
     
          @UI_SmokeTest123 @UI_RegressionPriorityItem_Channels
  Scenario Outline: Edit permissions of a user - Google My Business
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
    When Open side bar menu
    And Click on Dashboard meu
    And Click on View All button available in Channels section
    And Click on View Channel link
    And Click on "Ashwin Automation"
    And Click on Edit permissions
    And Change the user role to "Manager"
    And Click on save permissions
    And Click on button to go back to previous page
    And Click on button to go back to previous page
    And Click on View All button available in Channels section
    And Click on View Channel link
    And Click on "Ashwin Automation"
    And Verify the permission role is "Manager"
    And Click on Edit permissions
    And Change the user role to "Owner"
    And Click on save permissions 
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|                 
     
     @UI_RegressionTest @UI_RegressionPriorityItem
  Scenario Outline: Edit permissions of a user - Facebook Pages
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
   	When Authenticate "Facebook Pages" channel   	
   	And Click New Authentication button for first time auth
    Then Click Proceed button
    And Login Facebook
    Then Close authenticated channel added message  
    When Open side bar menu
    And Click on Dashboard meu
    And Click on View All button available in Channels section
    And Click on View Channel link
    And Click on "Hihydrapoc"
    And Click on Edit permissions for "Alias Auto" user
    And Remove the role "Message"
    And Click on save permissions
    And Click on button to go back to previous page
    And Click on button to go back to previous page
    And Click on View All button available in Channels section
    And Click on View Channel link
    And Click on "Hihydrapoc"
    And Click on Edit permissions
    And Verify the permission role "Message" is not displayed   
    And Change the user role to "Message"
    And Click on save permissions 
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|  
     