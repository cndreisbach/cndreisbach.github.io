---
template: post
title: A Death in the Family, or Elementary
tags: linux, elementary
image: dead_mac.gif
---

[Elementary OS]: http://elementaryos.org/
[Tarsnap]: http://www.tarsnap.com/
[x120e]: http://www.thinkwiki.org/wiki/Category:X120e
[Spectacle]: http://spectacleapp.com/
[Hiveminder]: http://hiveminder.com/
[Backblaze]: http://www.backblaze.com/

<figure class="article-image right"><img src="/images/articles/dead_mac.gif" alt="Dead Mac" /></figure>

Last week, my spouse's beloved old white Macbook died. It lived long enough for us to use Migration Assistant, but the screen is never coming back on. We are not exactly rolling in gold coins at `prompt.sh` HQ, so I decided to give her my newer Macbook Pro (about 3 years old, I think, although upgraded with an SSD and 8 GB of RAM about a year ago) instead of buying a new computer.

As you can imagine, this left me in a quandry. What computer to use? I have a [Lenovo ThinkPad x120e][x120e], a nice little laptop that won a Best in Show award at CES 2011. I got it super-cheap to have as a Linux machine about a year ago, and upgraded it with a nice SSD and 8 GB of RAM. I always like to have a travel laptop, something under $500 that could be stolen or destroyed without my heart going with it. When I've used the x120e in the past, though, I've been underwhelmed: Ubuntu runs pretty slow on it. Ubuntu isn't exactly lightweight anymore, though, so I decided to give it another try with another Linux distro: [Elementary OS][].

The current version of Elementary, Luna, is based off Ubuntu 12.04 LTS, so I've got a stable system. I normally like to use a well-supported distro, and save newer or less-supported ones for VMs, but the look and feel of Elementary was nice and after some testing on a VM, it seemed I could use it like any Ubuntu spin. (I've tried both Lubuntu and Xubuntu and have never fallen in love with them.)

<figure class="article-image image right"><img width="400px" src="/images/articles/eos_system_settings.png" alt="Elementary System Settings" /><figcaption>You look kind of familiar...</figcaption></figure>

So far, I really like it! It's snappy. The default window manager is not a tiling WM, but it has hotkeys to move window [Spectacle][]-style, which is what I was using in OS X. A lot of its look-and-feel seem to be aping OS X, but that's not an especially bad idea. One of Elementary's selling points is the list of applications the Elementary developers have made, and they are very nice. The file browser and terminal are very simple and usable, and their mail and music applications are growing on me. I'm still using webmail, but my favorite task manager, [Hiveminder][], lets me manage tasks via IMAP, so I've been using the Elementary mail app for that.

I had to replace [Backblaze][] as my off-site backup system, as it doesn't support Linux. I went with the neckbeardiest option, [Tarsnap][], which is both cheap and working.

The hardest part hasn't been moving off OS X; it's been moving off a really powerful computer to a much weaker one. The AMD Fusion E-350 processor in my ThinkPad is a lot better than an Atom chip, but it's still pretty anemic. (It does get great battery life, though.) The graphics card is weak sauce, especially since I get the choice between a buggy, but slightly-better-performing closed source driver, and a stable but pokey open-source driver. (I'm sticking with the open source one because it handles multiple monitors better.) Suddenly, I can't open 20 tabs in my browser. Flash is actually slow. Too much JavaScript can choke my computer. This might be a blessing in disguise: I'll be more conscientious about what I'm developing if it's slow on my own box.

For years, I was a Linux user, and then about 9 years ago, I got a Mac and became a convert. Over the last few years, I've had these weird pangs of conscience and jumped back to Linux from time to time, even wiping my Macbook and running Linux on it, but it's never stuck. This time, it wasn't some open-source longing; it was necessity. Necessity seems to work better: I haven't flipped out and run to the Apple store yet.
