# The Pub Simulation          

## Changes out of the ordinary

We had only some small changes.

### The Door
We've introduced a door-class. The door is the gate into the bar.
It will reject customers when the bar is closed. The landlord will
get a list of customers inside the bar by asking the door.

## Solution structure

We have many classes in our solution. However, they are quite small.
That also makes the code much more maintainiable and very nice overall.

Furthermore we are using unittesting.

### Testing

We have unfortunately not tested all classes and all behaviours. We have
tested the following:

- **Door** - *We tested overall functionality, in these tests we also simultenously tested Person class*  
- **Table** - *We tested overall functionality*  
- **Cupboard** - *We tested thoroughly all possible ways to make ingredients by randomized testing. And therfor 'proved' that there won't be any deadlock.*  

The classes `TestPerson` and `TestAll` are pure testclasses.

**Imporant Note**: We have used semaphores and synchronized at places sometimes, and if they are not used for statstics they are used for testing! 
> That should be ok. 
 ~~ Nicholas Smallbone, 2011

## Potential deadlocks

One source of deadlock is the taking of ingredients in a bad order. Its simple to see that it never happens unless you somehow take the ingredients in different orders for the LL and BM. Furthermor we have actually tested it (see testing above).

The assistant is having it's own cycle and is always cleaning the tables, therfor the customers cant get stuck waiting to put down their glasses. And the customers wont get stuck in the queue because of that the servants don\'t lock as stated in the paragraph above.

The Cupboard has only one inni, so it really cant get stuck without being able to listen. That means it will always appreciate putbacks of glasses and cups, therfor the Mixologists won't ever get deadlocked waiting for beverageware.


## Implementation

*Please first look at the planing and the pictures below.*

By now you have a pretty good understanding of our intentions. However we will now dig into some details.

Here follow the classes

### Assistant

It is very like our flow chart, only that it doesn't leave upon closal, no, it leaves when the landlord tells him too. He don't even care about calls for closing. The landlord tells the assistant to go home when only those two are left in the bar.

### Barmaid

Needs no explenation, as it elegantly matches our flow chart below.

### Beverage

There are totally 3 beverage **objects** in the simulation. They contain a list of ingredients and what beverageware it should served in and how long it takes to drink it.

### Beverageware



### Clock

Unchanged

### Customer

We solved the last orders problem as recommended in the assignment description. Codewise this results in that we listen to the closing time channel at two different places.

### Global

This is a class with constants, references and more.

Global contains a reference to everything static in the bar, that is everything but the customers. Also it declares constants for the all kinds of items, which are references used all over the program where appropriate.

It also contains the lists of ingredients needed to make a drink or what beverageware a drink comes in.

### Landlord

This quite similiar to our flowchart, only that the landlord tells the assistant to do his final round when everybody else have left the bar. The door kindly informs the landlord of both when two persons are left (LL + assistant) and when only LL is left.

## The planing

This is what we first did before starting coding, and of course the diagrams below don't always exactly correspond to our current code, but they are pictorially describing how our code works quite accurately.

### Overview

![Overview](https://github.com/oleander/The-Pub-Simulation/raw/master/img/overview.jpg)

### Landlord

![Landlord](https://github.com/oleander/The-Pub-Simulation/raw/master/img/landlord.jpg)

### Barmaid

![Barmaid](https://github.com/oleander/The-Pub-Simulation/raw/master/img/barmaid.jpg)

### Assistant

![Assistant](https://github.com/oleander/The-Pub-Simulation/raw/master/img/assistant.jpg)

### Customer

![Customer](https://github.com/oleander/The-Pub-Simulation/raw/master/img/customer.jpg)

### Orderdrink 1

![Orderdrink 1](https://github.com/oleander/The-Pub-Simulation/raw/master/img/orderdrink1.jpg)

### Orderdrink 2

![Orderdrink 2](https://github.com/oleander/The-Pub-Simulation/raw/master/img/orderdrink2.jpg)

### Order Drink Overview

![Order Drink Overview](https://github.com/oleander/The-Pub-Simulation/raw/master/img/orderdrinkoverview.jpg)

### Objects

![Objects](https://github.com/oleander/The-Pub-Simulation/raw/master/img/objects.jpg)

### Door

![Door](https://github.com/oleander/The-Pub-Simulation/raw/master/img/door.jpg)
