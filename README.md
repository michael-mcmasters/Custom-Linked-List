# Custom-Linked-List
Creating my own implementation of the linked list data structure.

A linked list is a chain of nodes that each hold a value and a reference to the next node in the list.
This strategic data structure allows us to add and remove items to the end of a list in constant time O(1).
My implementation is a singly linked list in which the LinkedList class itself holds a reference not only to the head, but also the tail so that appening and prepending works in O(1) time. Appended items are added to the tail whereas prepended items are added to the head.

This project was made to get a better understanding of the linked list data structure and to better understand how Java's default utility list may work under the hood. Feel free to fork this project and do anything with it.

# What I learned

I went into this project expecting appending and prepending to be O(1) constant time because the list object holds a reference to its tail node. What I found was that when I remove the tail node, I don't have the node before it to set as the new tail. To get that, I would either need to turn my data structure into a doubly linked list, which is how Java's utility linked list handles it, or I would need to loop through every value in linear time O(n) to get it. With this new information, if I am ever to create this list again, I would most likely make it a doubly linked list. And if I do choose to stay with a singly linked list, I would append items to the head rather than the tail. This way, removeLast() can get the next item in the list and assign it as the new head in constant time. Which allows the two most commonly used functions of a linked list to work in constant time, add() and removeLast().
