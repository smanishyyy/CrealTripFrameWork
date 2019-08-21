$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/snow/feature/STRY0020490.feature");
formatter.feature({
  "line": 1,
  "name": "MLF - to - IBM: create a new incident",
  "description": "",
  "id": "mlf---to---ibm:-create-a-new-incident",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#Description:"
    },
    {
      "line": 5,
      "value": "#These 4 fields need to be sent"
    },
    {
      "line": 6,
      "value": "#- Number"
    },
    {
      "line": 7,
      "value": "#- Correlation ID"
    },
    {
      "line": 8,
      "value": "#- Short Description"
    },
    {
      "line": 9,
      "value": "#- Description"
    },
    {
      "line": 11,
      "value": "#Opened By:Ramon Herrera"
    },
    {
      "line": 12,
      "value": "#Release: ServiceNow - IBM REST Integrations"
    },
    {
      "line": 13,
      "value": "#Sprint:IBM REST Incident Integration - Sprint 2"
    },
    {
      "line": 15,
      "value": "#Acceptance criteria:"
    },
    {
      "line": 16,
      "value": "#- Json response from IBM ServiceGrid with the incident number at IBM side"
    },
    {
      "line": 17,
      "value": "#- The above fields populated at IBM ServiceNow, in corresponding fields"
    },
    {
      "line": 18,
      "value": "#- Test tkt created, transferred to MLF and then transferred to IBM (check all updates are flowing across 2 systems)"
    }
  ],
  "line": 20,
  "name": "Validate whther MLF INC created ticket is getting bridged with IBM successfully",
  "description": "",
  "id": "mlf---to---ibm:-create-a-new-incident;validate-whther-mlf-inc-created-ticket-is-getting-bridged-with-ibm-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user launch the ITIL view",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Open new ticket in ServiceNow at MLF",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#And Fill description and short description along with all mandatory field"
    }
  ],
  "line": 25,
  "name": "Select requested for as \"\u003cRequestedFor\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Select the requestedBy as \"\u003cRequestedBy\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Fill description as \"\u003cDesciption\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Fill the short description as \"\u003cShortDescription\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Fill the best contact number as \"\u003cBestContactNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Fill the assignment group as \"\u003cAssignmentGroup\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Store the Incident number in variable",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Click on the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Search The incident from the gloable search box",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Reload the page to get the outbound rest trasaction",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Click on the the related record",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Store the external vendor ticket number and take screenshot in folder \"\u003cScreenshotFolder\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "mlf---to---ibm:-create-a-new-incident;validate-whther-mlf-inc-created-ticket-is-getting-bridged-with-ibm-successfully;",
  "rows": [
    {
      "cells": [
        "Desciption",
        "ShortDescription",
        "RequestedFor",
        "RequestedBy",
        "BestContactNumber",
        "AssignmentGroup",
        "ScreenshotFolder"
      ],
      "line": 40,
      "id": "mlf---to---ibm:-create-a-new-incident;validate-whther-mlf-inc-created-ticket-is-getting-bridged-with-ibm-successfully;;1"
    },
    {
      "cells": [
        "MLF IBM Integration",
        "MLF",
        "poddepa",
        "chaurma",
        "8697884711",
        "IBM_Integ-I-MLF-ACCESS",
        "SNR1_STRY0020490"
      ],
      "line": 41,
      "id": "mlf---to---ibm:-create-a-new-incident;validate-whther-mlf-inc-created-ticket-is-getting-bridged-with-ibm-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 41,
  "name": "Validate whther MLF INC created ticket is getting bridged with IBM successfully",
  "description": "",
  "id": "mlf---to---ibm:-create-a-new-incident;validate-whther-mlf-inc-created-ticket-is-getting-bridged-with-ibm-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user launch the ITIL view",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Open new ticket in ServiceNow at MLF",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#And Fill description and short description along with all mandatory field"
    }
  ],
  "line": 25,
  "name": "Select requested for as \"poddepa\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Select the requestedBy as \"chaurma\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Fill description as \"MLF IBM Integration\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Fill the short description as \"MLF\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Fill the best contact number as \"8697884711\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Fill the assignment group as \"IBM_Integ-I-MLF-ACCESS\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Store the Incident number in variable",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Click on the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Search The incident from the gloable search box",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Reload the page to get the outbound rest trasaction",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Click on the the related record",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Store the external vendor ticket number and take screenshot in folder \"SNR1_STRY0020490\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ReusableMLFIncBrigdeWithEX.user_launch_the_ITIL_view()"
});
formatter.result({
  "duration": 27306254586,
  "status": "passed"
});
formatter.match({
  "location": "ReusableMLFIncBrigdeWithEX.Open_new_ticket_in_ServiceNow_at_MLF()"
});
formatter.result({
  "duration": 8868879560,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "poddepa",
      "offset": 25
    }
  ],
  "location": "ReusableMLFIncBrigdeWithEX.select_requested_for_as(String)"
});
