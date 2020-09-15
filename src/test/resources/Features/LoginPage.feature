Feature: Verfying the adactin hotel booking functionalities
Scenario Outline: Verifying the adactin hotel booking login details with Members details

Given user is on the adactin hotel booking page
When user should enter the "<username>","<password>","<location>","<hotels>","<roomtype>","<nor>","<checkind>","<checkoutd>","<apr>","<cpr>","<firstname>","<lastname>","<billingaddress>","<cardno>","<cardtype>","<exdatemonth>","<exdateyear>" and "<cvv>" 
And print the order number
Then user should click the log out button

Examples:
     |username|password|location |hotels        |roomtype|nor    |checkind  |checkoutd |apr      |cpr     |firstname|lastname|billingaddress  |cardno          |cardtype|exdatemonth|exdateyear|cvv |
     |syedabdul|342H8J |Sydney   |Hotel Creek   |Double  |1 - One|23/08/2020|24/08/2020|2 - Two  |0 - None|syed     |abdul   |3/353 paramakudi|0987654321123456|VISA    |May        |2022      |987 |
     |syedabdul|342H8J |Melbourne|Hotel Sunshine|Double  |1 - One|24/08/2020|25/08/2020|3 - Three|1 - One |arun     |raj     |26 maninagar    |1234567800987654|VISA    |June       |2022      |123 |
     |syedabdul|342H8J |Brisbane |Hotel Cornice |Double  |1 - One|25/08/2020|26/08/2020|4 - Four |2 - Two |rahman   |syed    |11 ganthinagar  |4567890876554425|VISA    |March      |2022      |777 |

     
     
     
     
     
     
     
     
     
     
     
     
     