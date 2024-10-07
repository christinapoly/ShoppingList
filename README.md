# ShoppingList
A Java Program for Generating Weekly Grocery Lists


🧾 Assignment Description 🧾


You want to make the process of cooking during a week faster.
So you write a program that can print a shopping list, based on the ingredients that are available at home and
the required ingredients in some recipes that you want to cook.
The shopping list should include all the necessary ingredients and their amount that you need to buy for cooking.


The program should first read the available ingredients at home and one or more recipes, all provided as user input.
Implement a method void read() that reads the user input provided in the following format.
The list of available ingredients at home will start with a line AVAILABLE
Each recipe also starts with a line starting with RECIPE
An example of such input is as follows:

AVAILABLE
100 g potato
1 kg tomato
500 g onion
300 g bread
2 kg oil
RECIPE fish dish
1 kg fish
500 g potato
100 g oil
500 g milk

As you can see above, each ingredient line has three parts: amount unit ingredient
where amount is a whole number, unit is either g or kg and ingredient name is at the end of the line.

Implement the method void printShoppingList() that prints out a shopping list.
The printed shopping list must start with Shopping List: . Then in each line the required amount for each ingredient (which must be
in grams), the unit that is g, and the name of ingredient are printed.
The shopping list must be printed in alphabetical order. For the above example, the following shopping list is printed:

Shopping List:
1000 g fish
500 g milk
400 g potato

If no item is in the shopping list the method just prints Shopping List:
