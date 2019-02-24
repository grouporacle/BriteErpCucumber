@wip
Feature: – As an Events CRM Manager I should be able to select activity types option and view details

  Background:
    Given manager on the login page

#     lanoguge : pt

  Scenario: Logs in as manager
    When the manager goes to http://52.39.162.23/
    Given the manager click on BriteErpDemo
    When the manager enters valid "EventsCRM_Manager@info.com" and  "Ugh45wQ12"
    And the manager click login button

  Scenario: Event crm manager can see options of the activity type
    When the Manager click to the CRM from the tab
    Then the manager goes to the activity type page

	Scenario:Event crm manager can search  activity taype
        When the manager goes to the activity type page
		Then the manager send activity name to the search box and hit enter
#		Then activity type should be displaed

	Scenario: Event crm manager should be abel to update summary
		When the manager goes to the activity type page
		Then manager abel to update summary

	Scenario: Event crmmanager should be able to create activity type
		When the manager goes to the activity type page
		Then manager should be abel to to create activity type

	Scenario: Event crm manager can print all names of the activity type
		When the manager goes to the activity type page
		Then the manager should be able to print all the names of activity type

	Scenario: Event crm manager can print headers of the activity type
        When the manager goes to the activity type page
		Then the manager get headers of all activity type

	Scenario: Events CRM Manager can print all Rows of the activity types
       When the manager goes to the activity type page
		Then the manager can get all rows of activity type

		