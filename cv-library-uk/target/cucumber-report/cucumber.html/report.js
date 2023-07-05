$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("jonsearch.feature");
formatter.feature({
  "line": 1,
  "name": "Job Search Fearture",
  "description": "As a User want to check Job Search functionality",
  "id": "job-search-fearture",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10009037700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should Search Job successfully",
  "description": "",
  "id": "job-search-fearture;user-should-search-job-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Job search page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter jobTitle \"Tester\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter location \"Harrow\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select distance \"5 miles\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on search more option",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter minimum salary \"30000\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter maximum salary \"500000\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select salary type \"Per annum\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select job type \"Permanent\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on find job",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should search job successfully and see \"Permanent Tester jobs in Harrow\"",
  "keyword": "Then "
});
formatter.match({
  "location": "JobSearchStepdefs.userIsOnJobSearchPage()"
});
formatter.result({
  "duration": 127395600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tester",
      "offset": 18
    }
  ],
  "location": "JobSearchStepdefs.iEnterJobTitle(String)"
});
formatter.result({
  "duration": 232265400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harrow",
      "offset": 18
    }
  ],
  "location": "JobSearchStepdefs.iEnterLocation(String)"
});
formatter.result({
  "duration": 146419600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5 miles",
      "offset": 19
    }
  ],
  "location": "JobSearchStepdefs.iSelectDistance(String)"
});
formatter.result({
  "duration": 171621200,
  "status": "passed"
});
formatter.match({
  "location": "JobSearchStepdefs.iClickOnSearchMoreOption()"
});
formatter.result({
  "duration": 135384100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30000",
      "offset": 24
    }
  ],
  "location": "JobSearchStepdefs.iEnterMinimumSalary(String)"
});
formatter.result({
  "duration": 295848800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500000",
      "offset": 24
    }
  ],
  "location": "JobSearchStepdefs.iEnterMaximumSalary(String)"
});
formatter.result({
  "duration": 91235700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Per annum",
      "offset": 22
    }
  ],
  "location": "JobSearchStepdefs.iSelectSalaryType(String)"
});
formatter.result({
  "duration": 129077500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Permanent",
      "offset": 19
    }
  ],
  "location": "JobSearchStepdefs.iSelectJobType(String)"
});
formatter.result({
  "duration": 117588100,
  "status": "passed"
});
formatter.match({
  "location": "JobSearchStepdefs.iClickOnFindJob()"
});
formatter.result({
  "duration": 110816800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Permanent Tester jobs in Harrow",
      "offset": 42
    }
  ],
  "location": "JobSearchStepdefs.iShouldSearchJobSuccessfullyAndSee(String)"
});
formatter.result({
  "duration": 18600412100,
  "status": "passed"
});
formatter.after({
  "duration": 723476200,
  "status": "passed"
});
});