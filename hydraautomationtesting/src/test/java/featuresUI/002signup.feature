@HydraUI_SignupSignup
Feature: VerifySignup

  @UI_RegressionTest
  Scenario Outline: VerifySignup
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
 Examples:
      | firstName  |lastName| email  | countryCode|password|retypePassword|cardInformation|nameOnCard|billingAddressCountry|addressLine|city|PIN|State|expiryDate|CVC|
      | Alias |TestLast Name |aliasap2016@gmail.com |+91|Je@123rry123| Je@123rry123|424242424242424242|Aliastest|United States|ad|ci|35004|Alabama|0235|123|