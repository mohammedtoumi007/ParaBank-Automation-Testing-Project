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

● Registration : Account Registration Ensures that a valid user account exists before running scenarios. Register a new user with valid details. Verify success message: “Your account was created successfully. You are now logged in.” Logout to prepare for test execution.

● Scenario 1: Login Verification Objective: Validate login functionality with valid & invalid credentials. Steps: Enter valid credentials → Validate successful login. Enter invalid credentials → Validate error message. DDT Applied: Excel with DataRegister

● Scenario 2: Open New Account Ojective: Verify account creation process (Checking/Savings). Steps: Navigate to Open Account → Select type + funding account. Confirm new account number displayed. Verify account appears in Accounts Overview.

● Scenario 3: Transfer Funds Objective: Validate fund transfer between accounts. Steps: Select From & To Accounts + Amount. Confirm transfer details. Verify updated balances in Accounts Overview.
