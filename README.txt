# This project is a web automation framework based in Java, Selenium and Cucumber

# Dependencies:
### We use maeven repository to take of all dependencies. So, in order to use this framework, just import this project as a maeven project.

# Setup:
This project works with Java 1.8 and enconding UTF-8

Do not forget to set JAVA 1.8 as the Java compiler:
If you are using Eclipse IDE, just click with the right button in the root projet, click in Propierties, Java Build Path, and  select the libraries tab.
Make sure you are using JAVA 1.8
To set the correct compiler, click with the right button in the root projet, click in Propierties, Java Compiler, in Compiler compliance level make sure it is 1.8

# Drivers supported:
Chome version: 83, ChromeDriver 83.0.4103.39
Firefox version: 77, Geckodriver v0.26.0

# How to run:
Make sure the crhomedriver inside of src/main/resources have permitions to run as a executable
In linux, inside the folder, you can execute: "chmod -R 777 ."

# Not required, but good to have:
If you are using Eclipse IDE, you may Install the Cucumber Eclipse Plugin via Eclipse Marketplace in order to see the features with a better view