---
title: How to design programs
template: post
tags: design
image: blackjack.jpg
---

<div class="note">
<em>Note:</em> This article was adapted from a lecture I gave to beginning programmers
in my Ruby on Rails class at <a href="http://theironyard.com/">The Iron Yard</a>. It
doesn't reflect all the nuances of program design, obviously. I did think it
was a good explanation for someone coming from little to no programming
background.
</div>


When you have a large program to write, you need a framework to figure out how to start. There are two major ways of figuring out how to solve a problem: _top-down_ and _bottom-up_. Here are examples of how they would apply to the problem "I need to build a blackjack game."

## Bottom-up

I sit down and think about what objects make up a blackjack game. I end up with a card, a deck, a hand of cards, a player, and a dealer. Then I make each one as a class with tests, like so:

* Make a Card class
    * A card knows its rank
    * A card can display itself as a string
* Make a Deck class
    * A deck can be shuffled
    * A deck can deal cards
    * know what's in the deck
    * know what's not in the deck
* Make a Hand class
    * A hand can get cards
    * A hand can calculate its total
        * handle aces
    * A hand knows if it's busted
* Make a Player class
    * A player has money
    * A player can gain or lose money
    * A player has a hand
* Make a Dealer class
    * A dealer has a deck
    * A dealer can give players cards

At this point, I have most of the pieces I need, but I can't play a game yet. I need one more class, Game (or BlackjackGame or whatever I want to call it) that orchestrates the other objects. So I:

* Make a Game class
    * sets up the dealer, deck, and player
    * it controls input and output
    * determines if game over


## Top-down

With the top-down method, take your problem and simplify it until it's a problem that's actually approachable. For example, if I was writing a blackjack game, I might do this:

* Write a blackjack game, but:
    * aces are always 1
    * there's no money, just win/lose
    * we only play one round
    * and no one can hit
    * You get two cards, dealer gets two cards, compare, game over.

That's actually doable in just a little code. I would write it in one big clump -- one class, or maybe even no classes.

Once I did that, I'd add in another bit to make it more full-featured. Here's some of the bits I'd have to tackle.

* People can hit to get more cards
* Aces could be 1 or 11
* You can play multiple rounds
* You bet money
* The dealer has to decide when to hit

As you do this, you're going to see _seams_ in your code -- places where you could naturally pull it apart. For example, you might see that you have to determine the value of a hand, taking into account aces. At that point, you'll see that the code for hands should be pulled out into a class. As you keep going, keep pulling out classes.

In the top-down method, your code will get a certain flow. You add code to your [big ball of mud](http://en.wikipedia.org/wiki/Big_ball_of_mud), make it work, and then _[refactor](http://en.wikipedia.org/wiki/Code_refactoring)_ the code to be better organized. Your code will go from clean to messy to clean again, and that's fine. Just don't forget to take the time to refactor as you build in more use cases.

## Combined approach

Most software development is done with a little of each of the above. For example, I might write the simplest possible blackjack program, like in top-down, look at it, decide what classes I see in it, and then write those classes in the bottom-up way, eventually getting rid of my original code. Or, I might go bottom-up, but add as little as possible to each class to get to that minimal blackjack game. Once I have that working, I'd go back and add capabilities to each class.
