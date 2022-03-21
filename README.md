# <p align="center">TribalQAChallenge
## Introduction
  
  ### This repository was developed to upload the Tribal QA Challenge files. The challenge is divided in three sections:
  
  - #### Section 1: create manual tests cases to run in a Sign in screen:
    <img align="center" src="https://github.com/jkpequeno/TribalQAChallenge/blob/main/initialScreen.png"></img> 
  #### <t> The test cases were created in a .txt document named Section1.txt.
  
  - #### Section 2: create test scenarios and data to test API methods (POST and GET) according to the following informations:
  
  |name|petType|age|race|
  |-------------|-------------|-------------|-------------|
  |<p align="center">string|<p align="center">string|<p align="center">integer|<p align="center">string|
  |<p align="center">Max length 100|<p align="center">Max length 50|<p align="center">|<p align="center">Max length 50|
  
  The tests must have the following responses:
  |201 code|400 code|404 code|500 code|
  |-------------|-------------|-------------|-------------|
  |The correct data are posted| Bad request| Not found | Internal server error|
  
  #### <t> The test cases were created in a .txt document named Sectio2.txt.
  
  - #### Section 3: create automated test scripts, using the automation tool that I choose, to test the following page:
  <img align="center" src="https://github.com/jkpequeno/TribalQAChallenge/blob/main/TribalCurrentJobOpenings.png"></img>
  #### <t> The automated test scripts were developed in the eclipse IDE, using Java language and Selenium with Cucumber. To run the automated test scripts, it will be necessary to have an IDE with java language compatibillity and Cucumber Extension. The archives are in the Section3_UI folder.
