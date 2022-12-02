# CM2115 Weekly Demo Repo

## Introduction

This repo provides a tidied-up and documented version of the demo code written during each week's Monday session. The aim is to allow you to view the code again, and play about with it so as to deepen your understanding of each individual topic in isolation.

Note that this isn't an alternative to the weekly Smart Home project, which you should still complete via the weekly lab exercises.

## Structure

Each topic is in its own package, within the `uk.ac.rgu` package (e.g., topic 2 is in `uk.ac.rgu.topic2`). Within each package, you'll find classes similar to those written during the demo, plus an `App` class. The `App` class for each topic contains a `main()` method allowing you to run each topic's demo in isolation.

Note that in the class demo, we might re-use classes and/or other code from a previous week (e.g., the demo for topic4 buildes on classes from topic3). In this repo, the topics are made standalone - but any re-used classes are included in the relevant topic folder (so the Animal class from topic3 is also in topic4, etc.).

## Updates

The repo will be updated each week. There's two ways you can use the repo and get the latest updates - cloning and pulling the updates, or forking and synching the updates. The former means you won't be able to push any updates you make to GitHub, while the latter will allow this.

### Cloning and pulling

This is the simplest way. Once you've cloned the repo and the project is open in Visual Studio Code, you can obtain the latest version by  opening the Source Control pane in Visual Studio Code, clicking the three dots at the top and clicking **Pull**. This will add the newest code. Alternatively, if you have the project open then running `git pull` in the terminal will have the same effect.

The disadvantage of this approach is that you can't commit and push your own changes so you'll need to keep your local copy somewhere safe.

### Forking

Forking the repo means an exact copy will be created in a new repo in your own GitHub account. This will allow you to push any changes you make (e.g., working on the suggested exercises). To fork the repo, click the **Fork** button in the top-right of the repo. Follow the instructions on the next page to create the fork. When done, you'll be taken to the forked repo. This is what you should now clone and work on.

To sync the changes from the main repo each week, visit your repo on GitHub and click the **Sync fork** button (under the green **Code** button), then click the **Update branch** button (if there's no updates, you'll see a message informing you of this).

## Topic listing

The following links will take you to the package in `src/main/java` and, where relevant, FXML files in `src/main/resources` for each topic. The list will be updated each week when the new code is added.

- Topic 2: JavaFX
    - [Code](https://github.com/RobertGordonUniversity/cm2115-weekly-demos/tree/main/src/main/java/uk/ac/rgu/topic2)
    - [FXML files](https://github.com/RobertGordonUniversity/cm2115-weekly-demos/tree/main/src/main/resources/uk/ac/rgu/topic2)

- Topic 3: Inheritance, abstract classes, and polymorphism
    - [Code](https://github.com/RobertGordonUniversity/cm2115-weekly-demos/tree/main/src/main/java/uk/ac/rgu/topic3)

- Topic 4: Interfaces
    - [Code (main topic)](https://github.com/RobertGordonUniversity/cm2115-weekly-demos/tree/main/src/main/java/uk/ac/rgu/topic4)
    - [Code (functional interfaces)](https://github.com/RobertGordonUniversity/cm2115-weekly-demos/tree/main/src/main/java/uk/ac/rgu/topic4/functionalinterfaces)

- Topic 5: Advanced Java Concepts
    - [Code](https://github.com/RobertGordonUniversity/cm2115-weekly-demos/tree/main/src/main/java/uk/ac/rgu/topic5)

- Topic 6: Design Patterns (1)
    - [Code](https://github.com/RobertGordonUniversity/cm2115-weekly-demos/tree/main/src/main/java/uk/ac/rgu/topic6)

- Topic 6b: Design Patterns (2)
    - [Code](https://github.com/RobertGordonUniversity/cm2115-weekly-demos/tree/main/src/main/java/uk/ac/rgu/topic6b)

- Topic 7: Java Collections Framework and Streams
    - [Code](https://github.com/RobertGordonUniversity/cm2115-weekly-demos/tree/main/src/main/java/uk/ac/rgu/topic7)

- Topic 8: Exceptions
    - [Code](https://github.com/RobertGordonUniversity/cm2115-weekly-demos/tree/main/src/main/java/uk/ac/rgu/topic8)

- Topic 9: Files
    - [Code](https://github.com/RobertGordonUniversity/cm2115-weekly-demos/tree/main/src/main/java/uk/ac/rgu/topic9)