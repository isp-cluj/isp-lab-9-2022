# Lab 9

## Exercise 1 

Implement a basic stock trade application starting from the example provided in package exercise 1.

The aplication should provide following functionalities:
- View market stocks and their current value - this feature is implemented and can be used as reference for next points;

![alt text](./docs/market.png)

- View user portofolio owned stocks
    - View owned stocks in a table view similar with Market;
    - For each owned stock display in table followings: symbol, name, quantity, current market value (quantity * price); 

![alt text](./docs/portofolio.png)

- Buy stock:
    - Implement "Buy" button functionality;
    - Buy is limited by available cache funds (stored in Portofolio class, attribute "funds");

![alt text](./docs/buy.png)

- Sell stock
    - Create user interface
    - Implement "Sell";

![alt text](./docs/sell.png)

For implementing user interface use **Netbeans 12.6** and **UI designer** facility. All user interface should be implemented in the provided **StockMarketJFrame** class. 



## Exercise 2 (Optional)

Study MVC design pattern and how this can be implemented in Java. Here are some links presenting how MVC pattern can be implemented:
- https://medium.com/@ssaurel/learn-to-make-a-mvc-application-with-swing-and-java-8-3cd24cf7cb10 
- https://examples.javacodegeeks.com/core-java/java-swing-mvc-example/ 

Use MVC pattern to add a user interface to program in exercise 2 where will be a button and a text field for each sensor type. When button is pressed value of the sensor is displayed in the text field.
