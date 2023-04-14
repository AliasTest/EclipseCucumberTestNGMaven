@HydraUI_LicenceUser
Feature: Verify Licence User Login

  @UI_RegressionTest
  Scenario Outline: Verify Licence  User Login
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
    And Verify first name and "<lastName>" displayed on the hello welcome back message
     
 Examples:
     |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliasap2016@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|             
     
 @UI_RegressionTest
  Scenario Outline: ForgotPassword
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
    And Click on the forgot password   
    And Enter email of the created user   
    And Click Reset button
    And Enter otp
    And Click Reset button
    And Enter the "<NewPassword>" and "<RetypeNewPassword>"
    And Click Reset button
    And Enter email and "<NewPassword>" of the created user
    And Click on the remember password
    And Check the captca
    And Click Login button on Hydra login dialog
    And Enter otp
    And Click Login button on Hydra login dialog
    And Verify first name and "<lastName>" displayed on the hello welcome back message
     
 Examples:
     |lastName| email  | countryCode|password|retypePassword|NewPassword|RetypeNewPassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
     |TestLast Name |aliasap2016@gmail.com |+91|Je@123rry123| Je@123rry123|Kai@3456ui|Kai@3456ui|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|          