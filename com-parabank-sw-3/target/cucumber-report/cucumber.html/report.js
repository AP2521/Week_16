$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Fearture",
  "description": "As a User want to check login functionality",
  "id": "login-fearture",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10863291200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should login successfully with valid credentials",
  "description": "",
  "id": "login-fearture;user-should-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter username \"anish362\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter password \"ab133\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should login successfully and see \"Accounts Overview\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on logout button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should logout successfully and see \"Customer Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.userIsOnHomePage()"
});
formatter.result({
  "duration": 715855200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anish362",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterUsername(String)"
});
formatter.result({
  "duration": 376312800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ab133",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 181623700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 614345600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Accounts Overview",
      "offset": 37
    }
  ],
  "location": "LoginStepdefs.iShouldLoginSuccessfullyAndSeeText(String)"
});
formatter.result({
  "duration": 120067700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLogoutButton()"
});
formatter.result({
  "duration": 472628400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer Login",
      "offset": 38
    }
  ],
  "location": "LoginStepdefs.iShouldLogoutSuccessfullyAndSeeText(String)"
});
formatter.result({
  "duration": 86982400,
  "status": "passed"
});
formatter.after({
  "duration": 1005085900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "User should not login and verify error message",
  "description": "",
  "id": "login-fearture;user-should-not-login-and-verify-error-message",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I enter username \"\u003cUsername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should see error message \"\u003cError\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "login-fearture;user-should-not-login-and-verify-error-message;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "Error"
      ],
      "line": 22,
      "id": "login-fearture;user-should-not-login-and-verify-error-message;;1"
    },
    {
      "cells": [
        "abc123",
        "123",
        "The username and password could not be verified."
      ],
      "line": 23,
      "id": "login-fearture;user-should-not-login-and-verify-error-message;;2"
    },
    {
      "cells": [
        "abc124",
        "123",
        "The username and password could not be verified."
      ],
      "line": 24,
      "id": "login-fearture;user-should-not-login-and-verify-error-message;;3"
    },
    {
      "cells": [
        "abc123",
        "124",
        "The username and password could not be verified."
      ],
      "line": 25,
      "id": "login-fearture;user-should-not-login-and-verify-error-message;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5745989700,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User should not login and verify error message",
  "description": "",
  "id": "login-fearture;user-should-not-login-and-verify-error-message;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I enter username \"abc123\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter password \"123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should see error message \"The username and password could not be verified.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.userIsOnHomePage()"
});
formatter.result({
  "duration": 37500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterUsername(String)"
});
formatter.result({
  "duration": 261006300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 156181000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 564282200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The username and password could not be verified.",
      "offset": 28
    }
  ],
  "location": "LoginStepdefs.iShouldSeeErrorMessage(String)"
});
formatter.result({
  "duration": 66941000,
  "status": "passed"
});
formatter.after({
  "duration": 887059400,
  "status": "passed"
});
formatter.before({
  "duration": 5606853600,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User should not login and verify error message",
  "description": "",
  "id": "login-fearture;user-should-not-login-and-verify-error-message;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I enter username \"abc124\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter password \"123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should see error message \"The username and password could not be verified.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.userIsOnHomePage()"
});
formatter.result({
  "duration": 3353000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc124",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterUsername(String)"
});
formatter.result({
  "duration": 304988400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 133358800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 609820800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The username and password could not be verified.",
      "offset": 28
    }
  ],
  "location": "LoginStepdefs.iShouldSeeErrorMessage(String)"
});
formatter.result({
  "duration": 76361700,
  "status": "passed"
});
formatter.after({
  "duration": 822425500,
  "status": "passed"
});
formatter.before({
  "duration": 6062417800,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User should not login and verify error message",
  "description": "",
  "id": "login-fearture;user-should-not-login-and-verify-error-message;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I enter username \"abc123\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter password \"124\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should see error message \"The username and password could not be verified.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.userIsOnHomePage()"
});
formatter.result({
  "duration": 29100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterUsername(String)"
});
formatter.result({
  "duration": 362341700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "124",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 164116100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 609110200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The username and password could not be verified.",
      "offset": 28
    }
  ],
  "location": "LoginStepdefs.iShouldSeeErrorMessage(String)"
});
formatter.result({
  "duration": 76610100,
  "status": "passed"
});
formatter.after({
  "duration": 856413500,
  "status": "passed"
});
formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "Register Fearture",
  "description": "As a User want to check register functionality",
  "id": "register-fearture",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5445135100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should register successfully",
  "description": "",
  "id": "register-fearture;user-should-register-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Registerbutton",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter firstname \"Anish\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter lastname \"Patel\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter streetname in address \"123phx\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter cityname in address \"Phoenix\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter state in address \"AZ\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter zipcode in address \"85035\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter phonenumber \"123456789\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter SSN \"12345678\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter Username",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter Password \"ab133\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter ConfirmPassword \"ab133\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify account created text \"Your account was created successfully. You are now logged in.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepdefs.userIsOnHomepage()"
});
formatter.result({
  "duration": 121800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepdefs.iClickOnRegisterbutton()"
});
formatter.result({
  "duration": 836979600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Anish",
      "offset": 19
    }
  ],
  "location": "RegisterStepdefs.iEnterFirstname(String)"
});
formatter.result({
  "duration": 201435600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patel",
      "offset": 18
    }
  ],
  "location": "RegisterStepdefs.iEnterLastname(String)"
});
formatter.result({
  "duration": 178759600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123phx",
      "offset": 31
    }
  ],
  "location": "RegisterStepdefs.iEnterStreetnameInAddress(String)"
});
formatter.result({
  "duration": 249115200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Phoenix",
      "offset": 29
    }
  ],
  "location": "RegisterStepdefs.iEnterCitynameInAddress(String)"
});
formatter.result({
  "duration": 199399000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AZ",
      "offset": 26
    }
  ],
  "location": "RegisterStepdefs.iEnterStateInAddress(String)"
});
formatter.result({
  "duration": 125192500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "85035",
      "offset": 28
    }
  ],
  "location": "RegisterStepdefs.iEnterZipcodeInAddress(String)"
});
formatter.result({
  "duration": 134448600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 21
    }
  ],
  "location": "RegisterStepdefs.iEnterPhonenumber(String)"
});
formatter.result({
  "duration": 130122800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 13
    }
  ],
  "location": "RegisterStepdefs.iEnterSSN(String)"
});
formatter.result({
  "duration": 187149500,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepdefs.iEnterUsername()"
});
formatter.result({
  "duration": 153436100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ab133",
      "offset": 18
    }
  ],
  "location": "RegisterStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 153255300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ab133",
      "offset": 25
    }
  ],
  "location": "RegisterStepdefs.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 124728300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepdefs.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 575893400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your account was created successfully. You are now logged in.",
      "offset": 31
    }
  ],
  "location": "RegisterStepdefs.iVerifyAccountCreatedText(String)"
});
formatter.result({
  "duration": 101929300,
  "status": "passed"
});
formatter.after({
  "duration": 868456600,
  "status": "passed"
});
});