@HydraUI_Workspace
Feature: Verify Workspace 

  @UI_RegressionTest
  Scenario Outline: Verify workspace creation and filter	
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
    Then Click Proceed button    
    And Login Google page
    Then Close authenticated channel added message
  	When Open side bar menu
    And Click on Dashboard meu
  	When Click create workspace button
   	Then Enter workspace name "Workspace1"
    And Add a channel page to workspace
    And Verify Cancel button available
    And Click workspace creation Save button 
    And Verify View All button available in Workspaces section    
    When Click create workspace button  
    And Click on Filter channel button
    And Click on first check box to filter channel    
    And Verify the Google Analytics not displayed on channel list
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|           
 
  @UI_RegressionTest
  Scenario Outline: Verify Add users to workspace
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
    Then Click Proceed button
    And Login Google page
    Then Close authenticated channel added message
     And Get "<email>" to create new adim user 
    Then Verify "AdminEmail" for HydraAPI to avoid manual delete from database
    Given Navigate to gmail page
    And Login Google page
    And Open the first email
  	And Click on the amazon verification link
  	And Close the opened tabs except the hydra application  
  	Then Close authenticated channel added message
  	And Click on User menu	
  	When Click on Add User
    And Enter email  	
  	And Add user 
    Given Navigate to gmail page    
    And Open the first email
    And Verify the admin user added link
    And Enter the username "<lastName>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Enter otp
    And Click on Sign up button
  	And Close the opened tabs except the hydra application  
  	Then Close authenticated channel added message
  	When Open side bar menu
    And Click on Dashboard meu
  	When Click create workspace button
   	Then Enter workspace name "Workspace1"
    And Add a channel page to workspace 
    And Add User to channel
    And Select the user to workspace
    And Click on Submit button
    And Click workspace creation Save button 
    Then Verify workspace "Workspace1" displayed
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|           
     
     
     @UI_RegressionTest
  Scenario Outline: Verify All workspace
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
    Then Click Proceed button
    And Login Google page
    Then Close authenticated channel added message
     And Get "<email>" to create new adim user 
    Then Verify "AdminEmail" for HydraAPI to avoid manual delete from database
    Given Navigate to gmail page
    And Login Google page
    And Open the first email
  	And Click on the amazon verification link
  	And Close the opened tabs except the hydra application  
  	Then Close authenticated channel added message
  	And Click on User menu	
  	When Click on Add User
    And Enter email  	
  	And Add user 
    Given Navigate to gmail page    
    And Open the first email
    And Verify the admin user added link
    And Enter the username "<lastName>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Enter otp
    And Click on Sign up button
  	And Close the opened tabs except the hydra application  
  	Then Close authenticated channel added message
  	When Open side bar menu
    And Click on Dashboard meu
  	When Click create workspace button
   	Then Enter workspace name "Workspace1"
    And Add a channel page to workspace
    And Click workspace creation Save button 
    Then Verify workspace "Workspace1" displayed
     When Click create workspace button
   	Then Enter workspace name "Workspace3"
    And Add a channel page to workspace
    And Click workspace creation Save button 
    Then Verify workspace "Workspace3" displayed
    And Click on View All workspace button
    Then Verify workspace "Workspace1" displayed on ViewAll screen
    And Verify channel "Google Analytics" displayed
    And Verify the page "Google Ads Account" displayed
    Then Verify workspace "Workspace3" displayed on ViewAll screen
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|           
     
     @UI_RegressionTest @UI_RegressionPriorityItem
  Scenario Outline: Verify added channel account
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
    Then Click Proceed button
    And Login Google page
    Then Close authenticated channel added message
    Then Get "<email>" to create new viewer user 
    Then Verify "ViewerEmail" for HydraAPI to avoid manual delete from database
    Given Navigate to gmail page
    And Login Google page
    And Open the first email
  	And Click on the amazon verification link
  	And Close the opened tabs except the hydra application  
  	Then Close authenticated channel added message
  	When Open side bar menu
    And Click on Dashboard meu
  	When Click create workspace button
   	Then Enter workspace name "Workspace1"
    And Add a channel page to workspace
    And Click workspace creation Save button 
    Then Verify workspace "Workspace1" displayed
    And Click on View All workspace button
    Then Verify workspace "Workspace1" displayed on ViewAll screen
    And Verify the page "Google Ads Account" displayed    
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|           
         
  @UI_RegressionTest @UI_RegressionPriorityItem
  Scenario Outline: Verify edit workspace
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
    Then Click Proceed button
    And Login Google page
    Then Close authenticated channel added message
     And Get "<email>" to create new adim user 
    Then Verify "AdminEmail" for HydraAPI to avoid manual delete from database
    Given Navigate to gmail page
    And Login Google page
    And Open the first email
  	And Click on the amazon verification link
  	And Close the opened tabs except the hydra application  
  	Then Close authenticated channel added message
  	And Click on User menu	
  	When Click on Add User
    And Enter email  	
  	And Add user 
    Given Navigate to gmail page    
    And Open the first email
    And Verify the admin user added link
    And Enter the username "<lastName>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Enter otp
    And Click on Sign up button
  	And Close the opened tabs except the hydra application  
  	Then Close authenticated channel added message
  	When Open side bar menu
    And Click on Dashboard meu
  	When Click create workspace button
   	Then Enter workspace name "Workspace1"
    And Add a channel page to workspace
    And Click workspace creation Save button 
    Then Verify workspace "Workspace1" displayed
    And Click on View All workspace button
    And Click on view workspace button
    And Click on Edit workspace button
    Then Enter workspace name "WorkspaceEdited"  
    And Click workspace creation Save button 
    Then Verify workspace "WorkspaceEdited" displayed  
   
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|           
           
         
    