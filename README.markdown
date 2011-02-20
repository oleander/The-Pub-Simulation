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

## The planing

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
