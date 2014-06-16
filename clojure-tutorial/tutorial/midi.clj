(ns tutorial.midi
  (:import (javax.sound.midi MidiSystem Synthesizer)))

(def notes
     [{:note 52 :duration 3}
      {:note 52 :duration 1}
      {:note 55 :duration 1}
      {:note 52 :duration 1}
      {:note 50 :duration 1}
      {:note 48 :duration 2}
      {:note 47 :duration 2}
      {:note 52 :duration 3}
      {:note 52 :duration 1}
      {:note 55 :duration 1}
      {:note 52 :duration 1}
      {:note 50 :duration 1}
      {:note 48 :duration 1}
      {:note 50 :duration 1}
      {:note 48 :duration 1}
      {:note 47 :duration 2}])

(defn play-a-note 
  ([note velocity duration]
   (play-a-note note velocity duration 0))
  ([note velocity duration instrument] 
   (with-open [synth (doto (MidiSystem/getSynthesizer) .open)]
    (let [channel (aget (.getChannels synth) instrument)]
      (.noteOn channel note velocity)
      (Thread/sleep duration)
      (.noteOff channel note)))))

;(play-a-note 60 127 3000)

(doseq [note notes]
       (println (:note note))
       (println (:duration note)))
