Hier ist ein weniger formelles und anfängerfreundlicheres README:

---

# Temperature Converter for Java Terminal

## Project Overview

This is a simple **Temperature Converter** built in Java that runs in the terminal. The project was created as a learning exercise to get familiar with basic Java programming concepts. It lets users enter a temperature in Celsius and choose whether to display it in Celsius or convert it to Fahrenheit. This is one of my first Java projects, and I'm exploring how to handle **user input** and **basic calculations** in Java.

## Features

- **User Input**: Uses the `Scanner` class to get temperature and unit preferences from the user.
- **Temperature Conversion**: Converts Celsius to Fahrenheit if the user selects this option.
- **Basic Error Handling**: Gives feedback if an invalid choice is entered.
- **Simple, Readable Code**: Commented code to make it easier to understand each step.

## How It Works

1. The program asks the user to input the current temperature in Celsius.
2. Users can select to view the temperature in **Celsius** or **Fahrenheit**.
3. If "Fahrenheit" is selected, it converts the Celsius input to Fahrenheit using:
   \[
   \text{Fahrenheit} = (\text{Celsius} \times 1.8) + 32
   \]
4. If an unrecognized input is given, it asks the user to try again with either "celsius" or "fahrenheit."

## Usage

To run this program, open a terminal, compile, and execute the file with:

```bash
javac tempConv.java
java tempConv
```

## Why I Built This

As a beginner in Java (my main language is Python), I created this project to get comfortable with **Java syntax** and **basic programming tasks**. It’s a simple exercise, but it helped me understand the fundamentals of Java input handling and basic data types. 
