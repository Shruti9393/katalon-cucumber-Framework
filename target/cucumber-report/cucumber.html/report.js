$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("online.feature");
formatter.feature({
  "line": 1,
  "name": "Add to cart Functionality",
  "description": "As user I want to check the shopping cart functionality",
  "id": "add-to-cart-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11565496200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Remove lowest priced item from the cart",
  "description": "",
  "id": "add-to-cart-functionality;remove-lowest-priced-item-from-the-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I add four random items to my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I view my cart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I find total four items listed in my cart",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I search for lowest price item",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I am able to remove the lowest price item from my cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am able to verify three items in my cart",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAddFourRandomItemsToMyCart()"
});
formatter.result({
  "duration": 1906580400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iViewMyCart()"
});
formatter.result({
  "duration": 1916050500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iFindTotalFourItemsListedInMyCart()"
});
formatter.result({
  "duration": 72430300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSearchForLowestPriceItem()"
});
formatter.result({
  "duration": 311829300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAmAbleToRemoveTheLowestPriceItemFromMyCart()"
});
formatter.result({
  "duration": 27700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAmAbleToVerifyThreeItemsInMyCart()"
});
formatter.result({
  "duration": 3035889200,
  "status": "passed"
});
formatter.after({
  "duration": 108400,
  "status": "passed"
});
});