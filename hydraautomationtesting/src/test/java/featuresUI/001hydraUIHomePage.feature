@HydraUI_Start
Feature: Start HydraUI

  @UI_RegressionTest
  Scenario: Start HydraUI and verify Sign up button available
    Given Start HydraUI
    Then Verify "Sign Up" button should be displayed  
