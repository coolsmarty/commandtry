$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumberJava.feature");
formatter.feature({
  "line": 1,
  "name": "CucumberJava",
  "description": "",
  "id": "cucumberjava",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login functionality exists",
  "description": "",
  "id": "cucumberjava;login-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberJava.openBrowser()"
});
formatter.result({
  "duration": 78227590565,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.goToFacebook()"
});
formatter.result({
  "duration": 17115935949,
  "status": "passed"
});
});