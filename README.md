# rest_assured_API_tests
Java, Maven, Testng

code folder: main/src/test/java

# Resources:
Rest-assured documnetation:
https://github.com/rest-assured/rest-assured

Mock server used for testing:
https://reqres.in/

Json-server set up:
https://www.npmjs.com/package/json-server

## Maven dependencies:
database of Maven dependecies with code to be pasted into pom.xml file 
https://mvnrepository.com/

Rest-assured:
https://mvnrepository.com/artifact/io.rest-assured/rest-assured/4.3.2

Testng:
https://mvnrepository.com/artifact/org.testng/testng/7.3.0

Json library:
https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple/1.1.1

### YouTube resources:
part 1 (setup and get method) https://www.youtube.com/watch?v=JJ7Tp7_fX4c
part 2 (get, post, put, patch, delete) https://www.youtube.com/watch?v=mkIliGAePBM

part 3 (setting up fake json server) https://www.youtube.com/watch?v=IbJdcApXziU&t=1154s

### solutions for common problems:

Maven project defaults to Java 5 - console error
add to pom.xml: 

'
<properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
</properties>
'

Testng doesn't execute given url - console error:

https://stackoverflow.com/questions/57299606/testng-by-default-disables-loading-dtd-from-unsecure-urls


    
