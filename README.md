# G2AutomationTask_Abdulrhman_Alfiky

## Hi dears,
### in this document i will mention the Project structure for Web and API Projects

### -WEB UI Project
this project aims to automate the functionality of admin tab page in OrangeHRM website

#### Design pattern used:- 
- i'm using two patterns in my project (**Page object model pattern** & **Singelton design pattern**) 
those patterns helped me in creating the project with most reliable, readable way for anyone who want to continue in the project
- the project have main package (**task**), contains all packages required for the project, inside it have the following
    - **driver** package contain the web driver that are using across all scenarios which achieve the idea of singelton pattern
    - **pages** package contain the BasePage class and all classes that automation interact with, containing in each page class its elements and actions which also achieve the POM pattern 
    - **tests** package containing packages that have classes to run required test 
    - **Hooks** class containing methods that need to be run before test execution
    - **utilities** class have the config handling of property files 
  

### test execution approach 
in this project i'm using ****BDD approach** by using Cucumber framework**  



### Tools & Technology used
| WebUI                              | 
|------------------------------------|
| selenium as a driver execution     | 
| TestNG as a test runner            | 
| Maven as a build tool              | 
| cucumber Tool                      | 
| Allure report for reporting        |

### Deliverables 
[x] **project uploaded in GitHub** 
[x] **list of tools and technologies**
[x] **Documentation**



