# ParaBank-Automation-Testing-Project
Parabank Automation

Welcome to the Parabank Automation project! This repository contains automated tests for key functionalities of the Parabank web application using Selenium Java and TestNG.

Link Demo : https://parabank.parasoft.com/parabank/index.htm

## Covered Test cases

●  Automate User Registration process

●  Automate successful user login

●  Automate User Log Out functionality

●  Automate Open a new account saving

●  Automate Funds Transfer functionality

## Test Scenarios

● Scenario 1: Account Registration Ensures that a valid user account exists before running scenarios. Register a new user with valid details. Verify success message: “Your account was created successfully. You are now logged in.” Logout to prepare for test execution.

● Scenario 2: Login Verification Objective: Validate login functionality with valid & invalid credentials. Steps: Enter valid credentials → Validate successful login. Enter invalid credentials → Validate error message.

● Scenario 3: Log out functionality: Validate log out functionality succes.

● Scenario 4: Open New Account Ojective: Verify account creation process (Checking/Savings). Steps: Navigate to Open Account → Select type + funding account. Confirm new account number displayed. Verify account appears in Accounts Overview.

● Scenario 5: Transfer Funds Objective: Validate fund transfer between accounts. Steps: Select From & To Accounts + Amount. Confirm transfer details. Verify updated balances in Accounts Overview.

## Registration Test Data

This repository includes test data for registration testing using data-driven techniques.

File Details

File Name: DataRegister.csv
Purpose: Contains registration data for automated tests.

Data Format

Each line in DataRegister.csv follows the format: 
First Name : Mohamed
Last Name : Away Toumi
Address : manzel chaker
City : Tunisia
State : Sfax
ZipCode : 3076
Tel : 25378710
SSN : 123
Username : MedToumi
Password : 123456789

Reporting
The Extent Reports generated from the Selenium TestNG tests are located under target/surefire-reports/emailable-report.html.html.
