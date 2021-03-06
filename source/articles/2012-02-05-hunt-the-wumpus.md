---
template: post
title: Hunt the Wumpus using Racket
tags: racket, games
image: wumpus.jpg
---

[hunt]: http://www.atariarchives.org/bcc1/showpage.php?page=247
[pcxt]: http://en.wikipedia.org/wiki/IBM_Personal_Computer_XT
[racket]: http://racket-lang.org/
[src]: https://github.com/cndreisbach/prompt.sh/blob/gh-pages/code/wumpus.rkt
[raw_src]: https://raw.github.com/cndreisbach/prompt.sh/gh-pages/code/wumpus.rkt
[repl]: http://en.wikipedia.org/wiki/Read%E2%80%93eval%E2%80%93print_loop

"[Hunt the Wumpus][hunt]" was the first game I ever typed into a computer. Gregory Yob wrote it in the early 1970s, and I found it in _The Best of Creative Computing, Volume 1_. I copied the code painstakingly into Disk BASIC on an [IBM PC XT][pcxt]. And then I played it for hours.

<div class="article-image image right"><img src="/images/articles/wumpus.jpg" alt="Street Wumpus Art" /><div class="attribution">Image by <a href="http://www.flickr.com/photos/tristan_roddis/">tristan_roddis</a>.</div></div>

If there's a language today as suited for beginners to learn with as BASIC was then, I believe that language is [Racket][racket]. You can't boot your computer into a copy of it in ROM, but you can download it for most operating systems, and start it as an application complete with its own integrated editor and interpreter.

Racket is a member of the Lisp family of language, and specifically a member of the Scheme sub-family. This means a few things. First, it means you get to type a lot of parentheses. Second, it means you will compose your program with lots of small functions and will have recursion. Recursion might be a difficult concept for some beginning programmers, but I would counter that it is much easier if you expose yourself to it early before you get FOR loops calcified in your brain.

Anyway, on to the fun! I have written a (slightly modified) version of Hunt the Wumpus in Racket that you can play. You can find the [full source of the program on Github][src]. To run the game, [download the source][raw_src], load it into Racket's graphical editor, Dr Racket, by using the "File > Open..." menu, click the Run button, and then type `(hunt-the-wumpus)` into the prompt (called the Interactions window in Racket and known as a [REPL][repl] to many programmers.) An even better idea if you are trying to learn Racket is to type in the program by hand. You'll learn more and probably cause some bugs, which is always exciting and eye-opening.

I left out two features that are in the original Wumpus game. In the original, the player only had five arrows and lost when they used all five up. Also, the player could start the game over with the same map if they lost. Try adding these features and leave a comment to show us your implementation.

