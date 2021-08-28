# PhoneBook_JAVA_SCHOOL_PROJECT
- **Note** : Old School Project, It was being created for my own sister for her school activity when I was in early college. Please Ignore Coding Standards and Principles.
## Description
This is a command line java application developed to help the user to add,view,search and update his contacts information easily.
Our objective is to manipulate the contact list of persons in easiest possible way.
Objective also includes performing basic operations such as view existing contacts,adding new contact,update an existing contact and search.
<div><p>Application contains Modules:-</p>
  <li>Load Application</li>
  <li>Authentication</li>
  <li>ENCODER</li>
  <li>View Contacts List</li>
  <li>Add Contact</li>
  <li>Update Contact</li>
  <li>Search Contact</li>
  <li> Update  DB</li>
  <li>BOT(Automatic Random Contacts Generator)</li>
  </div>
  
## Technology stack: 
Java 1.6+ .
 

**Screenshot**:

![](https://raw.githubusercontent.com/soumyaprasadrana/PhoneBook_JAVA_SCHOOL_PROJECT/main/images/phoneBook.png)


## Dependencies

Java should be installed on your system.

## Installation
Download the PhoneBook.java file and run below commands on your downloaded folder.
<div>
<code>javac PhoneBook.java</code>
  <br>
<code> java PhoneBook</code>
 
</div>

## Configuration

Application will ask you for a password each time you run it, default passsword is <code>Soumya</code> , use it or you can reset the password by choosing`1` on the option
It will ask your name and passsword,It will save your credentials to a file by encoding your data, and from the next time onwards you ca use your password.

## Known issues

Update contact is working on name basis while name is not a priary key on the database , so for multiple records having same name update function will not work it will update the first occurance node.

## Module wise description
  ### Load Application :
  This module fetches all your previously saved contact from the file named&quot;db.xyz&quot; .It uses File Reading and Writing functions to store your saved contact to a file.It helps to make the application more reliable.
  ### Authentication :
  This module helps to make your data private and protect from unauthorized access.
  ### ENCODER: 
  This module helps to to encrypt your data and to save it into file in encrypted format.
  This module is used at the time of file operation to save or update your data to the main source and the time of loading to decrypt the data gained from the main source.
  It has two functions 1)encode, 2)decode.Encode takes a plain string as input/parameter and return a encrypted cipher,Decode takes a cipher text as input/parameter and return   a plain text after decryption.
  ### View Contact List:
  This module shows the entire contact List present in the file.
  This module also contains another sub module:-View alphabetically.
  Function of sub-module shows all the contact list in alphabetical order according to their names.

  ### Add Contact
  This module contains functionality such as:

- Name Entry
- Mobile No Entry
- Email Entry
Successful execution of the module add the entered information into your phone book and then will call the update db module to add the newly saved contact information to the file.

  ### Search Contact
  This module helps to search any specific contact from the whole phone book. 
  This uses contact&#39;s name as a key-ward to search the specific contact .
  Returns the contact information if found else returns error message &quot;No such contact in your phone book&quot;.
  
  ### Update Existing Contact
   This module helps to select the specific contact that needs to be updated. 
   It takes the help of the search module to select the specific contact,if found next it will ask you what do you want to update and will update the existing contact.

  ### Update DB
   This module helps to write all your managed data to the file &quot;db.xyz&quot; to help the load module to load your existing contacts each time you open the application. 
   It uses File Writer function to write into the file.
   This module always called when you choose exit on the application.

  ### BOT
  This module helps to test your program and to calculate the speed reliability of the application by generating random contacts and storing into the main source.

## Class Diagram

![](https://raw.githubusercontent.com/soumyaprasadrana/PhoneBook_JAVA_SCHOOL_PROJECT/main/images/classDiagram.png)

## Data Flow Diagrams
  ### DFD-1:
  ![](https://github.com/soumyaprasadrana/PhoneBook_JAVA_SCHOOL_PROJECT/blob/main/images/dfd-1%20(2).png)
  ### DFD-2:
  ![](https://raw.githubusercontent.com/soumyaprasadrana/PhoneBook_JAVA_SCHOOL_PROJECT/main/images/dfd-2.png)
  

## How to test the software

You can use the **BOT** module to generate bulk data and test the application.



----

## Open source licensing info
1. [LICENSE](LICENSE)



----


