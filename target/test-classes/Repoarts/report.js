$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "Verfying the adactin hotel booking functionalities",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying the adactin hotel booking login details with Members details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin hotel booking page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter the \"\u003cusername\u003e\",\"\u003cpassword\u003e\",\"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003croomtype\u003e\",\"\u003cnor\u003e\",\"\u003ccheckind\u003e\",\"\u003ccheckoutd\u003e\",\"\u003capr\u003e\",\"\u003ccpr\u003e\",\"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003cbillingaddress\u003e\",\"\u003ccardno\u003e\",\"\u003ccardtype\u003e\",\"\u003cexdatemonth\u003e\",\"\u003cexdateyear\u003e\" and \"\u003ccvv\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "print the order number",
  "keyword": "And "
});
formatter.step({
  "name": "user should click the log out button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotels",
        "roomtype",
        "nor",
        "checkind",
        "checkoutd",
        "apr",
        "cpr",
        "firstname",
        "lastname",
        "billingaddress",
        "cardno",
        "cardtype",
        "exdatemonth",
        "exdateyear",
        "cvv"
      ]
    },
    {
      "cells": [
        "syedabdul",
        "342H8J",
        "Sydney",
        "Hotel Creek",
        "Double",
        "1 - One",
        "23/08/2020",
        "24/08/2020",
        "2 - Two",
        "0 - None",
        "syed",
        "abdul",
        "3/353 paramakudi",
        "0987654321123456",
        "VISA",
        "May",
        "2022",
        "987"
      ]
    },
    {
      "cells": [
        "syedabdul",
        "342H8J",
        "Melbourne",
        "Hotel Sunshine",
        "Double",
        "1 - One",
        "24/08/2020",
        "25/08/2020",
        "3 - Three",
        "1 - One",
        "arun",
        "raj",
        "26 maninagar",
        "1234567800987654",
        "VISA",
        "June",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "syedabdul",
        "342H8J",
        "Brisbane",
        "Hotel Cornice",
        "Double",
        "1 - One",
        "25/08/2020",
        "26/08/2020",
        "4 - Four",
        "2 - Two",
        "rahman",
        "syed",
        "11 ganthinagar",
        "4567890876554425",
        "VISA",
        "March",
        "2022",
        "777"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying the adactin hotel booking login details with Members details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin hotel booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_the_adactin_hotel_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the \"syedabdul\",\"342H8J\",\"Sydney\",\"Hotel Creek\",\"Double\",\"1 - One\",\"23/08/2020\",\"24/08/2020\",\"2 - Two\",\"0 - None\",\"syed\",\"abdul\",\"3/353 paramakudi\",\"0987654321123456\",\"VISA\",\"May\",\"2022\" and \"987\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_should_enter_the_and(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print the order number",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.print_the_order_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the log out button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_should_click_the_log_out_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying the adactin hotel booking login details with Members details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin hotel booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_the_adactin_hotel_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the \"syedabdul\",\"342H8J\",\"Melbourne\",\"Hotel Sunshine\",\"Double\",\"1 - One\",\"24/08/2020\",\"25/08/2020\",\"3 - Three\",\"1 - One\",\"arun\",\"raj\",\"26 maninagar\",\"1234567800987654\",\"VISA\",\"June\",\"2022\" and \"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_should_enter_the_and(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print the order number",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.print_the_order_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the log out button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_should_click_the_log_out_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying the adactin hotel booking login details with Members details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin hotel booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_the_adactin_hotel_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the \"syedabdul\",\"342H8J\",\"Brisbane\",\"Hotel Cornice\",\"Double\",\"1 - One\",\"25/08/2020\",\"26/08/2020\",\"4 - Four\",\"2 - Two\",\"rahman\",\"syed\",\"11 ganthinagar\",\"4567890876554425\",\"VISA\",\"March\",\"2022\" and \"777\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_should_enter_the_and(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print the order number",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.print_the_order_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the log out button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_should_click_the_log_out_button()"
});
formatter.result({
  "status": "passed"
});
});