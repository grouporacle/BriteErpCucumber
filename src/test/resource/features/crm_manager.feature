@login
Feature: – As an Events CRM Manager I should be able to select activity
           types option and view details.
#  @wip
  Scenario: Login page
    Given the manager on the login page
    When  the manager click on the BriteErpDemo button
    When  the manager log in using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    And   the Manager click log in button
#    Then the title should be Odoo


#  @wip
    Scenario: 1.Events CRM Manager can see options of activity types
    And  the Manager click to the CRM from the tab
    When the manager click to the Activity Type
#    Then the manager see the following information

#  Scenario: Events CRM Manager can search activity Type by entering keyword to the search box and hit Enter
#    When the Manager send key words to search box and hit enter
#    Then activity type should be displayed
#
#  Scenario: Events CRM Manager should be able to update names
#    When activity type should be displayed
#    Then Manager should be able to update sammary
#
#  Scenario: Events CRM Manager should be able to create activity types
#    When activity type should be displayed
#    Then Manager should be able to create activity type
#
#
#  Scenario: Events CRM Manager can print all names of the activity types
#    When activity type should be displayed
#    Then the manager see the following information
#
