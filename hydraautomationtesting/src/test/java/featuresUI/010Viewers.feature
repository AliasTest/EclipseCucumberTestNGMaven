@HydraUI_Workspace
Feature: Verify Viewers 

  @UI_RegressionTest @UI_RegressionPriorityItem
  Scenario Outline: Verify viewer creation 	
    
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
    And Add User to channel
    And Select the Viewers tab on Add Users page
    And Enter viewer email 
    And Click on Add to workspace button    
    And Click workspace creation Save button 
    Then Verify workspace "Workspace1" displayed
    Given Navigate to gmail page    
    And Open the first email
    And Verify the admin user added link
    And Enter the username "<lastName>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Enter otp
    And Click on Sign up button
    And Enter viewer email and "<password>" of the created user
    And Click on the remember password
    And Check the captca
    And Click Login button on Hydra login dialog
    And Enter otp    
    And Click Login button on Hydra login dialog
    Then Verify workspace "Workspace1" displayed for viewer
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|                