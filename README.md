Problems from project euler to practice java programming and using maven to build and test projects.

To compile and run Problem 1:
```
mvn clean && mvn package && mvn exec:java -Dexec.mainClass="com.euler.Problem1"
```

* mvn clean will delete all old versions of your project 
  (sometimes maven doesn't recompile .java files after they have been changed).

* mvn package will build (compile and jar) .java files.

* mvn exec will run .class file (might need to add a dependency to pom.xml).
