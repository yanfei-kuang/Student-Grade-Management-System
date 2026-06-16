# Student Grade Management System

A simple **Student Grade Management System** written in **Java**.
This console-based application allows users to manage student information and grades.

## Features

* Add students
* Display all students
* Search students by student ID
* Update student grades
* Delete students
* Exit the program

## Project Structure

```
.
├── Student.java
├── StudentManagementSystem.java
└── README.md
```

### Student.java

Stores student information:

* Student ID
* Name
* Grade

### StudentManagementSystem.java

Provides the main menu and implements all management functions.

## Menu

```
***** Student Grade Management System *****

1. Add Student
2. Show All Students
3. Search Student
4. Update Grade
5. Delete Student
6. Exit
```

## Example

### Add Student

```
Please enter the ID:
1001

Please enter the name:
Tom

Please enter the grade:
95
```

### Show Students

```
Student ID      Name    Grade
1001            Tom     95.0
1002            Alice   88.5
```

## Technologies Used

* Java
* ArrayList
* Scanner
* Object-Oriented Programming (OOP)

## Requirements

* JDK 8 or above

## How to Run

Compile the source files:

```bash
javac Student.java StudentManagementSystem.java
```

Run the program:

```bash
java StudentManagementSystem
```

## Future Improvements

* Sort students by grades
* Calculate average grade
* Store data in files
* Use HashMap
* Connect to MySQL database
* Build a GUI using Swing or JavaFX

## Author

Yanfei Kuang
