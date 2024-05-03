# Hangmen

The classic, fully customizable word guessing game now brought to your computer!

# Requirements

In order to launch the game via the Console, [Java Runtime Environment](https://www.java.com/de/download/manual.jsp) must be installed on your machine.

# Installation

Use the command line to navigate to the directory you have saved the game in.

```
cd C:\User\name\directory...
```

In order to launch the game, use the _java_ command and the pass the _words.txt_ file as a command line argument.

```
java Hangmen.java words.txt
```

# Customizing the word list

If you want to use your own word list to play with, simply edit the words.txt file, seperating each word with a line break.

> Java
> Python
> JavaScript

Alternatively, you can create your own txt file with which you provide your words. Note that in this case, you have to change your command line argument to the path of that file when running the game.

# Playing Hangmen

The game consists of as many rounds as there are words in the _words.txt_ file. Each round, a word from the provided file is randomly selected. You may now guess a character that the selected word might contain.
Your guess can only consist of a single letter, which is not case-sensitive, so the game treats upper and lower case letters equally.

### Winning a round

If you manage to guess the word before the Hangman is fully displayed, that is before you miss 11 tries, you win the round.

### Losing a round

If you guess 11 characters incorrectly, the Hangman is subjected to their cruel fate and you lose the round.

### End of the game

Once all rounds have concluded, your total score of won and lost rounds is displayed.

# Author

Author: [Gabriel Schrittwieser](https://github.com/gabrielschrittwieser)
University: [FH JOANNEUM](https://www.fh-joanneum.at/)

# Exercises

## First exercise to learn basic markdown syntax

- [Exercise 1](./exercise1.md)

## Second exercise to further grasp markdown syntax with a collection of git commands

- [Exercise 2](./exercise2.md)

## Third exercise to learn versioning a Java Project with Git

- [Exercise 3](./exercise3.md)

## Fourth exercise to learn testing using JUnit

- [Exercise 4](./exercise4.md)