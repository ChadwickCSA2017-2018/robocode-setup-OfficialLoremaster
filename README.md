# RobocodeInitial
This project is an initial project that will get you set up with Robocode, the system that we will use for the majority of our Java projects

## Installation 
You'll need to install Java and JDK to get Robocode up and going. If you are on Mac OSX the easiest way to install [Homebrew] (http://brew.sh/) Then run 
```
brew cask install java 
```
For Windows follow these [instructions](http://robowiki.net/wiki/Robocode/System_Requirements)

Then go to the [Robocode](http://robocode.sourceforge.net/), download the appropriate JAR and open it in your terminal using

```
java -jar robocode-setup-x.y.z.jar
```

where x.y.z is your specific Robocode version 

It should install in your home directory. To run Robocode navigate to the robocode directory and run

```
./robocode.sh
```

# Robot Editor
1. With the Robocode program open, click on the 'Robot' menu and the 'Editor' item.
2. It should give you a little dialog saying it's found a JDK to work with. Click 'OK' to tell it to use the one it found. (If it didn't find anything, you need to install the JDK. You can get it from (java.sun.com).)
3. With the Robot Editor open, click on the 'File' menu, the 'New' submenu, and the 'Robot' item.
4. Type in a name for your bot. It does not have to be the name for the bot you will use for the showdown, just [YourName]Bot will work fine. (i.e. JimBot, JulioBot, RufusBot, BuffyBot, etc.)
5. Next you will be prompted for a package name. Enter your initials. You can make as many bots as you like, but they should all belong to the same package (i.e. use your initials here (and the same set of initials) every single time).
6. It may give you a message that the directory does not exist. Click 'OK' to tell it to create the directory for you. You should now be staring at some boilerplate code. Give it a look see and check out what's going on. If you want an explanation of some of the methods, consult the [Robocode API](http://mark.random-article.com/robocode/javadoc/index.html).
7. Compile the code by clicking on the 'Compiler' menu and the 'Compile' option. It may offer to save the file for you, tell it 'OK'. Unless you've made any changes, it should compile successfully. (If it doesn't compile, review the above steps to see if you missed a step.)

## Let Him Fight!

1. Minimize (or close) the Robot Editor and return to the original Robocode program.
2. Click the 'Battle' menu and the 'New' item.
3. If the bot you just made doesn't show up in the list of bots in the dialog, hit 'F5' and it will refresh the list. (If your bot does show up, hitting 'F5' with neither hurt nor help the situation.)
4. When your bot shows up, double-click on it to add it to the battle, along with several other of the 'sample' bots (your choice).

## Submission

The submission for this assignment is to simply let me see it running. Feel free to explore the code and see what all is going on. I would highly recommend spending a day just playing around with the code and review the [API] (http://mark.random-article.com/robocode/javadoc/index.html) to make sure you have a rough idea of what the code is doing. 
