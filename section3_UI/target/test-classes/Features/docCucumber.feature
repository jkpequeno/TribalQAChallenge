#encoding: UTF-8

Feature: Filter job openings
  Scenario: Displaying Senior QA Engineer jobs
    Given I am in the initial screen of <site>
    And check that is the correct <site>
    When I filter by <department>
    And filter by <office>
    Then it should be displayed the <job>
    
  Examples:
  |                  site                     | department  | office |       job       |
  |"https://boards.greenhouse.io/tribalcredit"|"Engineering"|"Mexico"|"Sr. QA Engineer"|