(ns tutorial.greeting)

(defn messenger [greeting who]
  (str greeting ", " who "!"))

(messenger "Hello" "Clinton")