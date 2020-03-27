# EventHandling
This project is to demonstrate the creation and use of custom event handling in java. in short in this project we are going to demonstrate the creation of custom event Listeners. this project also using the multi threading to demonstrate how listener set by one thread can be triggered by other thread.
In this project we are basically trying to do some specified task whenever someone changes the command in command object.
if event on the command is set by some thread and triggerd by some other thread then also event listener will perform specified action but that action is performed by the thread who triggered it, not by one who set it
