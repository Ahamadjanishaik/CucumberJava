

@SecondOpinion
Feature: Second Opinion
  

  @Smoke
  Scenario: To validate the Second opinion feature
    Given Open the browser, enter sparsh hospital url
    And click on hospitals dropdown and select Yeswanthpur hospital    
    When User clicks second opinion link
    And User enters firstname lastname phnum email
    And Upload the reports and enter message
    Then Click on send button
    

  #@tag2
  # Scenario: To validate the Second opinion feature
    #Given Open the browser, enter sparsh hospital url
   # And click on hospitals dropdown and select Yeswanthpur hospital    
   # When User clicks second opinion link
    #And User enters "<firstname>" "<lastname>" "<phnum>" "<email>"
    #And Upload the reports and enter message
    #Then Click on send button
    #And Validate cofirmation msg

    #Examples: 
     # | firstname  | lastname | phnum  		 |email								     |
      #| James			 |     Bond | 8886989444 |jamesbond007@gmail.com   |
      #| John			 |   Wisley | 8886989441 |johnwisley123@gmail.com  |
      #| Henry			 |  johnson | 8886989443 |henryjohnson123@gmail.com|
      