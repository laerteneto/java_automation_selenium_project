# This project is a web automation framework based in Java, Selenium and Cucumber
I used the Eclipse IDE in this project.

# Dependencies:
We use maeven repository to take  care of all dependencies. So, in order to use this framework, just import this project as a maeven project.

# Setup:
This project works with Java 1.8 and enconding UTF-8

Do not forget to set JAVA 1.8 as the Java compiler:
If you are using Eclipse IDE, just click with the right button in the root projet, click in Propierties, Java Build Path, and  select the libraries tab.
Make sure you are using JAVA 1.8
To set the correct compiler, click with the right button in the root projet, click in Propierties, Java Compiler, in Compiler compliance level make sure it is 1.8

# Drivers supported:
Chome version: 83, ChromeDriver 83.0.4103.39
Firefox version: 77, Geckodriver v0.26.0

# Not required, but good to have:
If you are using Eclipse IDE, you may Install the Cucumber Eclipse Plugin via Eclipse Marketplace in order to see the features with a better view

# How to run:
Make sure the chromedriver and geckodriver inside of src/main/resources have permitions to run as an executable: In linux, inside the folder, you can execute: "chmod -R 777 ."
Execute, as a JUnit test, the file MercedesShopRunner.java, located in src/main/java/runners

# How to choose between Chrome or Firefox:
Go to the Configurations.java file located in "scr/main/java/core" and modify the browser enum as you want

# The test evidences will be saved in src/main/resources/screenshots