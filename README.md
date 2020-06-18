# This project is a web automation framework based in Java, Selenium and Cucumber
I used the Eclipse IDE in this project.

## Dependencies:
We use maeven repository to take care of all dependencies. So, in order to use this framework, just import this project as a **Maeven project**.

## Setup:
- This project works with **Java 1.8** and enconding UTF-8.

- Do not forget to set JAVA 1.8 as the Java compiler:
- **If you are using Eclipse IDE:**
 > Just click with the right button in the root projet, click in Propierties, Java Build Path, and  select the libraries tab (Make sure you are using JAVA 1.8).
 
 >To set the correct compiler, click with the right button in the root projet, click in Properties, Java Compiler, in Compiler compliance level make sure it is 1.8.

## Drivers:
Inside this project you will find the following drivers for **LINUX**:
- Chome version: 83, ChromeDriver 83.0.4103.39.
- Firefox version: 77, Geckodriver v0.26.0.

**Make sure:**
- The chromedriver and geckodriver located on *src/main/resources* have permitions to run as an executable: 
 >In UNIX based OS, inside the folder *src/main/resources*, you can execute the command: `chmod -R 777`.

- You can use different Chrome or Firefox versions, but make sure to update their driver files accordingly.

## How to choose between Chrome or Firefox:
Go to the Configurations.java file located in *scr/main/java/core* and modify the browser enum as you want.

## How to run:
- Execute the file *MercedesShopRunner.java* located in *src/main/java/runners* as a **JUnit test**.

_________________

### Not required, but good to have:
If you are using Eclipse IDE, you may Install the Cucumber Eclipse Plugin via Eclipse Marketplace in order to see the features with a better view.

### The evidences:
The test evidences will be saved in *src/main/resources/screenshots*.
