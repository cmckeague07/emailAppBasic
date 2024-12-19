Overview
This Email Application is a simple Java-based program designed to manage email accounts for employees in an organization. The program demonstrates key programming principles such as encapsulation, user input handling, random password generation, and dynamic email creation based on department selection.

Features:
Dynamic Email Creation:
Combines user’s first name, last name, and department with a company suffix to generate an email address.

Password Management:
Generates a random password for each user.
Allows users to change their password.

Department Assignment:
Prompts the user to select a department during email creation.

Supports the following departments:
1 for Sales
2 for Development
3 for Accounting
0 for None

Mailbox Settings:
Allows users to set mailbox capacity.
Supports alternate email addresses.

User Information Display:
Displays the user’s name, email, and mailbox capacity.

Clone the Repository:
git clone <repository_url>
cd emailAppBasic

Compile the Code:
Navigate to the src directory and compile the Java files:
cd src
javac emailApp/Email.java emailApp/EmailApp.java

Execute the main application:
java emailApp.EmailApp

Follow the Prompts:
Enter the first and last name.
Select a department.
View the generated email, password, and other details.

Example Usage
Input:
First Name: John
Last Name: Doe
Department Code: 1

Output:
Your password is: Abc123$%!@
Your email is: john.doe@sales.aeycompany.com
DISPLAY NAME: John Doe
COMPANY EMAIL: john.doe@sales.aeycompany.com
MAILBOX CAPACITY: 500mb

File Structure
emailAppBasic/
|-- src/
|   |-- emailApp/
|       |-- Email.java       # Handles email creation and management
|       |-- EmailApp.java    # Entry point for the application
|-- .gitignore                # Files to ignore in version control
|-- .classpath                # IDE-specific configuration
|-- .project                  # IDE-specific configuration
|-- .settings/                # IDE-specific settings

