---

# SQL & PL/SQL Exercises

This folder contains PL/SQL control structures and stored procedures for various banking scenarios.

---

## ✅ Control Structures

### 1. `Scenario1_DiscountAbove60.sql`
- Applies a 1% discount to loan interest rates for customers over 60.

### 2. `Scenario2_VIPFlag.sql`
- Updates `IsVIP = TRUE` for customers with balance > $10,000.

### 3. `Scenario3_LoanReminder.sql`
- Sends reminder for loans due in next 30 days.

---

## ✅ Stored Procedures

### 1. `Scenario1_ProcessMonthlyInterest.sql`
- Procedure `ProcessMonthlyInterest` applies 1% interest to savings account balances.

### 2. `Scenario2_UpdateEmployeeBonus.sql`
- Procedure `UpdateEmployeeBonus` adds a bonus % to all employees in a given department.

### 3. `Scenario3_TransferFunds.sql`
- Procedure `TransferFunds` transfers funds between two accounts after checking for sufficient balance.

---

### Notes
- PL/SQL scripts can be executed in Oracle SQL Developer or similar tools.
- Use `CALL` to invoke stored procedures after creation.
