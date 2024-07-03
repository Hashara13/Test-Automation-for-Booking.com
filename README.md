# Test Suite: Validate Registration Functionality on Booking.com

## Purpose

The purpose of this test suite is to validate the registration functionality on the Booking.com website. This includes verifying both valid and invalid email inputs during the registration process.

## Objectives

- Ensure that the registration page loads correctly.
- Verify that valid email inputs are accepted and processed correctly.
- Verify that invalid email inputs are appropriately handled with the expected error messages.

## Scope

- Testing will be conducted on the registration page of the Booking.com website.
- Both valid and invalid email inputs will be tested.
- The tests will be executed on the Firefox browser.

## Test Cases

| TEST CASE ID | TEST CASE DESCRIPTION                        | PRECONDITION                          | TEST DATA                             | EXPECTED RESULT                                                                                     | POSTCONDITION                   | ACTUAL RESULT | STATUS |
|--------------|----------------------------------------------|---------------------------------------|---------------------------------------|----------------------------------------------------------------------------------------------------|---------------------------------|---------------|--------|
| TC001        | Load Registration Page                      | Browser is open and driver is initialized | N/A                                   | Registration page should load successfully and all elements should be visible.                   | Registration page loaded       |               |        |
| TC002        | Valid Email Input Registration              | Registration page is loaded           | nethhashara@gmail.com                 | Email input should be accepted, and the user should be redirected to the next step of the registration process or see a success message.                       | Email processed successfully   |               |        |
| TC003        | Invalid Email Input Registration            | Registration page is loaded           | nethhara@gmail.com                    | Email input should be rejected, and an appropriate error message should be displayed indicating the email format or account issue.                             | Error message displayed        |               |        |
| TC004        | Empty Email Input Registration              | Registration page is loaded           | Empty input                           | Empty field error message should be displayed indicating that the email field is required.      | Error message displayed        |               |        |
| TC005        | Long Email Input Registration               | Registration page is loaded           | A very long email address              | Email input should be accepted and processed correctly if within character limits.               | Email processed successfully   |               |        |
| TC006        | Special Characters in Email Registration    | Registration page is loaded           | user@example!#$%.com                  | Email input containing special characters should be rejected with an appropriate error message. | Error message displayed        |               |        |
| TC007        | Numeric Email Input Registration            | Registration page is loaded           | 123@example.com                       | Email input should be accepted if valid format, regardless of numeric characters.                | Email processed successfully   |               |        |
| TC008        | Multiple Domain Extensions in Email         | Registration page is loaded           | user@example.co.in                    | Email input with multiple domain extensions should be accepted if valid.                         | Email processed successfully   |               |        |

## Test Inputs

| Test Input ID | Example Input                             | Description                                         |
|---------------|-------------------------------------------|-----------------------------------------------------|
| TI001         | nethhashara@gmail.com                     | Valid email format                                  |
| TI002         | nethhara@gmail.com                        | Invalid email format                                |
| TI003         | "" (empty string)                         | Empty email input                                   |
| TI004         | user@example!#$%.com                      | Email with special characters                       |
| TI005         | 123@example.com                          | Email with numeric characters                       |
| TI006         | user@example.co.in                        | Email with multiple domain extensions               |
