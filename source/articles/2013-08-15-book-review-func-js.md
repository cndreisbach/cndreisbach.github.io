---
template: post
title: "Book Review: Functional JavaScript"
tags: book-review, javascript
image: funcjs.jpg
---

The really surprising thing about
[_Functional JavaScript_ by Michael Fogus](http://www.powells.com/partner/36900/biblio/9781449360726?p_isbn)
is that it appears to target several audiences at once and seems to do
it well. If you are a JavaScript aficionado and you want to understand
functional programming, it works as an introduction. If you do a lot
of functional programming and want to learn how to program in
JavaScript without losing it, it works for that, too.

<div class="article-image image right"><img src="/images/articles/funcjs.jpg" alt="Functional JavaScript cover" /></div>

(Disclosure: Fogus is a previous co-worker of mine and a friend.)

<cite>Functional JS</cite> took me longer to read than I expected,
given its slim size. Although it is not very long, it is incredibly
dense. I found myself not only re-reading the same page two or three
times to get it, but also going back and re-reading previous sections
in order to understand the current section. There are a lot of
back-references in the book, which is good -- it really builds on
itself from chapter to chapter -- but it means it's not a light read.

One thing I liked a lot about this book is that I didn't agree with
everything. There were some code examples that I thought, "I'd do that
differently," and even one idea I disagreed strongly with. Not
agreeing meant there were some challenging ideas and that I was
learning something, which is good.

I'm going to be thinking about this book for a while. Until the last
chapter, I thought to myself, "This book is fun, but I'm not sure I
would write JavaScript this way," but the book concludes with some
solid arguments for using the functional style more with JavaScript.

As a person programming in a functional language most of the time
these days, I recommend this book to any functional programmer that
wants to think deeper about their craft or wants to learn
JavaScript. If you're a JavaScript programmer that wants to try out
functional programming, this is a great introduction, and I think
you'd be well served by reading it before jumping into another
language with an unfamiliar syntax.

_Postscript for those interested:_ The part I disagreed with was his
discussion of idempotence. He uses the formal definition from math and
functional programming (basically, running a function on an argument
should have the same result as running that function again on the
result of the first invocation, so `f(x) = f(f(x))`), which seemed
baffling and which I didn't know about, as I'm much more familiar with
the colloquial version, which is related to a lack of side
effects. Anyway, re-reading it now, it makes more sense, but I still
think it's stated in a confusing way in the text.
