<h1 align="center">Postem</h1>


## Description

A department - employee administrator website on grails. It contains two main screens, a department and a employee table where you can execute crud actions. This project was part of my basic training in a software development company.

## Demo 

### Authentication screen ###


![GitHub Logo](/images/Login.jpg)


### Departments ###

![GitHub Logo](/images/Departments.jpg)


### Create Department ###

![GitHub Logo](/images/CreateDepartment.jpg)


### Edit Department ###

![GitHub Logo](/images/EditDepartment.jpg)


### Employees ###

![GitHub Logo](/images/Employees.jpg)



### Create Employees ###

![GitHub Logo](/images/CreateEmployee.jpg)



## Edit Employees ##

![GitHub Logo](/images/EditEmployee.jpg)

## About the project.

### Backend 

The database was build with dbeaver EE software on a postgreSQL database. It contains three simple tables, Departments, Employees, Users.

### Frontend

The UI was built on grails with Intellij premium.

### CSS

All the CSS was implemented with Bootstrap plus some small additions of mine.

## Problems I faced.

The hardest part for me was learning and understanding Grails. Grails is based on three mains concepts, Controllers, Services and views which you need to understand well in order to build an acceptable website. Something else that troubled me was the setup of the postgreSQL database with the grails project and the installation of postgreSQL driver.

# Checklist for better and cleaner code.

* [ ] Meaningful names with camelCase
* [ ] Only create specific controllers and services - no general C-S
* [ ] Controller-Service names always start with lowercase letters
* [ ] SQL: no need for sql.close, 
* [ ] SQL: always """ multiline queries """
* [ ] SQL: no queries with "?"
* [ ] SQL: always try catch on queries
* [ ] SQL: always catch with: e.printStackTrace(); to log the error
* [ ] SQL: on catch return empty lists not boolean false, unless its a boolean query 
* [ ] SQL: use firstRow for one row returns
* [ ] Give models one parameter and same names, not [res:res, something:something123]
* [ ] Dispose of useless files-methods
* [ ] Name the views according to actions, so you dont have to render views
* [ ] Implement alerts and delete confirmations
* [ ] Implement local bootstrap
* [ ] Always format your code
