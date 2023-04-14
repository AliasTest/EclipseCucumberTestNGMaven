@HydraUI_AdminUser
Feature: Verify Admin user creation

  @UI_RegressionTest @UI_RegressionPriorityItem
  Scenario Outline: Verify Admin user creation      
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
    And Get "<email>" to create new adim user 
    And Click on User menu
    When Click on Add User
    And Enter email
    And Cancel the opened New User adding dialog
    Then Verify "AdminEmail" for HydraAPI to avoid manual delete from database
    Given Navigate to gmail page
    And Login Google page
    And Open the first email
  	And Click on the amazon verification link
  	And Close the opened tabs except the hydra application  
  	And Click on User menu	
  	When Click on Add User
    And Enter email  	
  	And Add user     
    And Verify the "1" user added details displayed on user management screen
   	Then Verfiy the user management table title  
    And Verify the Suspend all user button enabled  
    Given Navigate to gmail page    
    And Open the first email
    And Verify the admin user added link
    And Enter the username "<lastName>" and "<countryCode>" phone number and "<password>" and "<retypePassword>"
    And Check the captca     
    And Scroll page down
    And Click on Sign up button
    And Enter otp
    And Click on Sign up button
    And Enter AdminEmail and "<password>" of the created user
    And Click on the remember password
    And Check the captca
    And Click Login button on Hydra login dialog
    And Enter otp    
    And Click Login button on Hydra login dialog   
    And Click on User menu
    Then Verify the user added verifcation status "Verified"    
    #And Verify SuspedAll user button disabled  
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|           
     
  @UI_RegressionTest @UI_RegressionPriorityItem
  Scenario Outline: Add mutiple Admin users  
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
    And Get "<email>" to create new adim user    
  	And Click on User menu	
  	When Click on Add User
    And Enter email  	
  	And Add user     
    And Verify the "1" user added details displayed on user management screen
    And Get "<email>" to create new adim user    
  	And Click on User menu	
  	When Click on Add User
    And Enter email  	
  	And Add user     
    And Verify the "2" user added details displayed on user management screen             
        
    #And Verify SuspedAll user button disabled  
    
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliashydratestautomation@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|           
     
   #@UI_RegressionTest @UI_RegressionPriorityItem
  #Scenario Outline: Different Admin user roles (View and Admin user in google Analytics)
    #Given Start HydraUI
    #And Click Login button on Hydra homepage
    #When Login with existing "<Admin user email>" and "<password>" 
    #And Click on the remember password
    #And Check the captca
    #And Click Login button on Hydra login dialog
    #And Enter otp    
    #And Click Login button on Hydra login dialog
    #And Click on View All button available in Channels section
    #And Click on View Channel link
    #Then verify more than one user details displayed
    #And Verify the user "aliashydratestautomation@gmail.com" available in the account    
    #
 #Examples:
     #|Admin user email| password|
     #|aliashydratestautoamtion2@gmail.com|Alias@123|
     #|aliashydratestautomation3@gmail.com|Alias@123|
     
     
     
     