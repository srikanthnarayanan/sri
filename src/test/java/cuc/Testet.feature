Feature: Life of Tester
  
  Inorder to get good salary, as a IT guy i want to work hard and better.
  
  Scenario Outline: I am a tester
    Given I am a <Tester_Type> tester
    When I go to work
    Then I <Work_Output> it
    And My boss <Boss_Action> me
    But The developer <Developer_Reaction> me

  
    Examples: 
      | Tester_Type  | Work_Output | Boss_Action  | Developer_Reaction |
      |     good 		 |  complete   |  success 		|      hates				 |
      | 		bad			 |		mess		 |	 fires			|      likes         |
      |			avg 		 |  satisfies	 | congratulates|     respects       |
