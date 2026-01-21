# Bank Management System (Java)

## ♦️Overview

This project is a console-based Bank Management System implemented in Java, demonstrating the concept of Inheritance and Object-Oriented Programming (OOP).
It allows users to create and manage different types of bank accounts:

Saving Account (with compound interest)

Current Account (with cheque book facility & minimum balance rule)

Fixed Deposit Account (with simple interest)

The program is fully menu-driven and accepts user input at runtime using the Scanner class.

## 🧠 OOP Concepts Used
Inheritance – All account types inherit from a common base class account

Method Reusability – Deposit, withdrawal, and display methods reused

Encapsulation – Account details handled through class methods

Polymorphism – Different interest calculations for different account types

## 🏗️ Class Structure
### 1️⃣ account (Base Class)
Common properties and methods for all accounts.

Data Members:

name – Account holder name

accNo – Account number

balance – Account balance

Methods:

accountDetails() – Accepts basic account details

deposit(double amt) – Deposits amount

withdrawl(double amt) – Withdraws amount

display() – Displays account details

### 2️⃣ SavingAccount (Derived Class)
Extends account and adds compound interest feature.

Additional Feature:

Compound Interest at 7.2%

Method:

compoundInterest(int time)

### 3️⃣ CurrentAccount (Derived Class)
Extends account and includes business account features.

Additional Features:

Minimum balance: ₹5000

Penalty: ₹150 if minimum balance not maintained

Cheque book facility

Simple interest at 5%

Methods:

chequeBook()

minBalance()

simpleInterest(int time)

### 4️⃣ FixDeposit (Derived Class)
Extends account and handles fixed deposit operations.

Additional Data:

Aadhaar number

Age

Address

Fixed deposit amount

Interest:

Simple interest at 6%

Methods:

extraDetails()

fd(int time)

Display()

### 5️⃣ bank (Main Class)
Contains the main() method and controls program flow using a menu-driven loop.

## ▶️ How to Run
Compile the program:

javac bank.java
Run the program:

java bank
## 🧪 Sample Features
User can choose account type

Deposit & withdraw money

Interest calculation based on account type

Penalty applied automatically in current account

Fixed deposit interest calculation

Continuous execution using do-while loop

## ⚠️ Notes
This is a console-based academic project

No database or file handling is used

Designed for learning Java inheritance concepts

## 🚀 Future Enhancements
Add file handling or database support

Improve validation (negative amount, invalid input)

Add login system

Convert to GUI (JavaFX / Swing)


## ⭐ If you like this project, don’t forget to star the repository!
