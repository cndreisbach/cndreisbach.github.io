---
template: post
title: Fun with my Raspberry Pi
category: posts
tags: raspberry-pi
image: raspberry_pi_board.jpg
---

[rpi]: http://www.raspberrypi.org
[arch]: http://archlinuxarm.org
[unix]: http://en.wikipedia.org/wiki/Unix_philosophy
[awesome]: http://awesome.naquadah.org
[surf]: http://surf.suckless.org
[w3m]: http://en.wikipedia.org/wiki/W3m
[surfraw]: http://surfraw.org
[st]: http://st.suckless.org
[slock]: http://tools.suckless.org/slock
[emacs]: http://gnu.org/s/emacs

It's Friday afternoon, 5 PM. I've been working all day on a top-of-the-line Macbook Pro, two browsers open, each with 20+ tabs, two Java Virtual Machine instances going, and it's not breaking a sweat. I see that it's quitting time, and what do I do? Unplug the keyboard and monitor from my shiny Mac and plug them into a tiny motherboard with a SD memory card sticking out of it, and boot up my [Raspberry Pi][rpi], which has a fraction of the memory and processing power of the MacBook.

<div class="article-image image right"><img src="/images/articles/raspberry_pi_board.jpg" alt="Raspberry Pi Board" /><div class="attribution">Image by <a href="http://www.flickr.com/photos/dannychamoro/">DannyChamorro</a>.</div></div>

If you haven't heard of a Raspberry Pi, it's an inexpensive ARM-based computer created by a charity for the purpose of giving kids an easy-to-access computer to learn programming on. It usually runs Linux and can do most anything you'd expect a computer to do, albeit not as fast as you'd expect if you spend all day with high-end technology.

So why would I be so excited at the end of the day to plug mine in? (Actually, I haven't unplugged it all weekend and am writing this right now on it.) I love using it because it is fun in the way that all activities with arbitrary restrictions can be fun: it's a challenge and a learning experience. Instead of using my normal software suite, I've been using the lightest-weight stuff I can. I'm running [Arch Linux][arch] on it and using:

* [awesome][] for a window manager
* [surf][] for a web browser, and [w3m][] for when I can surf in text mode
* [surfraw][] for looking up stuff
* [st][] for a terminal
* [slock][] for screen locking
* [emacs][] for an editor (yes, yes, I realize this is not a particularly light-weight choice)

<div class="article-image image"><a href="/images/articles/raspberry-pi-screenshot.png"><img src="/images/articles/raspberry-pi-screenshot-small.jpg" alt="Screenshot of my desktop" /></a><div class="attribution">Screenshot of my desktop while writing this article</div></div>

All these (except Emacs) follow [the Unix philosophy][unix] with a level of purity that would, frankly, be unreasonable and unproductive in my normal work computing, but are refreshing to an idealist like me. This little computer makes me want to move to a cabin in the woods and code like our forefathers did. The irony is that I couldn't use it without my Macbook's network sharing: the router in my house is far away from my desk and the Raspberry Pi doesn't have wifi built in, so I have to run an Ethernet cable from my Mac to it in order to upload this post.
