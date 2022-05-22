@sc2
Feature:  user want to visit amazon web page and verify serch

In order to verify serch 
as a register uger 
i want to visit amazon web page and write a text in serch box then search
  
Scenario Outline: 
Given  user visits amazon home page
And     user will be search by "<productname>" 
Then    user will click on search button
Examples:

| productname          | 
| Apple Watch Series 7 |
