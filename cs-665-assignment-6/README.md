
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | SHIBO       WANG           |
| Date         | 12/06/2024                 |
| Course       | Fall                       |
| Assignment # | 6                          |

# Assignment Overview
Please add a paragraph or two overviewing the objectives of the assignment.

The objective of this assignment is to develop a software solution that simulates a notification system for a delivery service. The primary focus is to implement classes that represent a shop, delivery requests, and drivers. The system is required to notify multiple drivers when a delivery request is created, ensuring they are informed of the product to be delivered and its destination.

To meet this objective, the solution involves creating classes for Shop, DeliveryRequest, and Driver, as well as an implementation of the Driver interface through a TaxiDriver class. The shop class maintains a list of drivers, allowing new drivers to be registered and notified about new delivery requests. A delivery request includes the details of the product and address, which are shared with all registered drivers when a new request is created. The design demonstrates the Observer design pattern, where the drivers act as observers, and the shop is the subject that broadcasts updates.

# GitHub Repository Link:
https://github.com/shibo725/cs-665-assignment-6

# Implementation Description 


For each assignment, please answer the following:

- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.

The implementation offers a high level of flexibility, primarily due to the use of interfaces and loose coupling between classes. The Driver interface is a key aspect of this flexibility. Any future types of drivers can be easily added by simply implementing the Driver interface. For example, if you need to add a new driver type such as BikeDriver or TruckDriver, you can create new classes that implement the Driver interface without modifying the existing code in the Shop or DeliveryRequest classes.

Similarly, the Shop class operates independently of the specific types of drivers. It relies on the Driver interface to notify all registered drivers, which means that the shop does not need to know the details of how each driver handles a delivery request. This makes the system easily extendable. New drivers can be registered, and existing ones can be removed without affecting the overall operation of the system.

- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.

Use of Interfaces: The Driver interface is used to define how different types of drivers respond to a delivery request. This abstraction simplifies the code and makes it clear how drivers are expected to behave, while allowing future driver types to be added easily. This design also minimizes dependencies between classes, making it easier to understand and modify parts of the system in isolation.

Readable Naming Conventions: All class, method, and variable names are descriptive and follow common naming conventions. For instance, createDeliveryRequest, registerDriver, and notifyDrivers clearly express the actions being performed, reducing the cognitive load on developers reading the code for the first time.

Modular Design: The code is broken down into small, manageable pieces, with methodscreateDeliveryRequest and notifyDrivers handling specific tasks. This makes it easier for develop

- Describe how you have avoided duplicated code and why it is important.

Common Functionality in Superclasses and Interfaces: The Driver interface defines a contract for driver behavior, ensuring that all driver types (e.g., TaxiDriver, or any future driver classes) implement the same update() method. This eliminates the need to write similar methods in each driver class, as they all follow the same interface contract.

Reusability through Methods: The Shop class contains reusable methods like registerDriver(), removeDriver(), and notifyDrivers(). These methods centralize the logic for driver registration and notifications, avoiding repetition. For instance, instead of adding the same notification logic in every part of the code where drivers need to be notified, the notifyDrivers() method is called consistently across the application.

Why: Maintainability: When code is duplicated, any change or bug fix must be applied in multiple places, increasing the risk of inconsistencies. By centralizing common logic, you reduce the amount of code that needs to be modified when updates are required, making the system easier to maintain and evolve.

Readability: Avoiding duplication makes the code cleaner and easier to read. Instead of scattered logic, functionality is centralized and reusable, allowing developers to quickly understand how different parts of the system work together.

Reduced Risk of Bugs: Duplicated code increases the chances of errors because changes in one part of the codebase might not be reflected elsewhere. By avoiding duplication, the system becomes less prone to bugs that might result from inconsistent modifications across multiple locations.
- If applicable, mention any design patterns you have used and explain why they were
chosen.

In the implementation of this assignment, the Observer Design Pattern was applied to manage the communication between the Shop and the Driver classes. The reason for selecting this design pattern is that it allows for a flexible and scalable way to broadcast delivery requests to multiple drivers. The Observer Pattern facilitates the decoupling of the Shop and Driver classes, meaning that changes in the notification mechanism do not require changes to how the Driver objects behave.

This choice ensures flexibility, as new types of delivery-related objects (e.g., different types of drivers or even other delivery recipients) can be easily added without modifying the core logic of the Shop class. Each new type would only need to implement the Driver interface and register itself with the Shop. Similarly, the system allows for easy removal of driver objects without the need to modify other parts of the code. This pattern ensures that changes are isolated to the relevant objects, reducing the likelihood of errors and improving code maintainability.



# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




