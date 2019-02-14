$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resource\\features\\1.feature");
formatter.feature({
  "name": "– As an Events CRM Manager I should be able to select activity types option and view details",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Logs in as manager",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the manager click on BriteErpDemo",
  "keyword": "Given "
});
formatter.step({
  "name": "the manager enters valid\u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "the manager click login button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "\u003cemail\u003e",
        "\u003cpassword\u003e"
      ]
    },
    {
      "cells": [
        "EventsCRM_Manager@info.com",
        "Ugh45wQ12"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "manager on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the manager goes to http://52.39.162.23/",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Logs in as manager",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the manager click on BriteErpDemo",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the manager enters valid\u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the manager click login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "manager on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the manager goes to http://52.39.162.23/",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Event crm manager can see options of the activity type",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the Manager click to the CRM from the tab",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the manager goes to the activity type page",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the manager see the following information",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});