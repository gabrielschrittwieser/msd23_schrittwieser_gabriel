# Exercise 3
## Working steps

---

### Maven
1. Install maven and check its version aswell as java versions
2. <code>mvn -v</code> 3.9.6
3. <code>java -version</code> 22.0.1
4. <code>javac -version</code> 22.0.1

---

### Calculator Class
Simple <code>Calculator</code> Class implementing the following arithmetic operations:

```
add
subtract
multiply
divide
```

It takes two numbers and an operator as user-input and displays the corresponding result to the console.

---

### Main Class
<code>Main</code> Class calls upon the <code>calculator</code> Method in order to allow for testing.
Executing the class automatically generated the <i>target</i> folder in the project directory and within it further subfolders and the <code>Main</code> and <code>Calculator</code> .class files.

---

### pom.xml & maven exec
<code>maven-compiler</code> and <code>exec-maven</code> plugins with version 3.13.0 were added to pom.xml .
A build was subsequently created using <code>mvn compile</code>

---

### Directory structure

![target folder](./resources/images/ex3_1.jpg)
After executing the Main-Method for the Calculator project, a folder named "target" was automatically created in the project directory.

### Maven Build

![maven build](./resources/images/ex3_2.jpg)
Console after creating the build using mvn compile

### Executing the Calculator

![calculator](./resources/images/ex3_3.jpg)
Console after using the calculator with the command mvn exec:java