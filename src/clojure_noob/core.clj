(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))

(if true
  "By Zeus's hammer!"
  "By Aquaman's trident!")

(if false
  "By Zeus's hammer!"
  "By Aquaman's trident!")

(if true
  (do (println "Success!")
      "By Zeus's hammer!")
  (do (println "Failure!")
      "By Aquaman's trident!"))

(when true
  (println "Success!")
  "abra cabara")

(nil? 2)

(nil? nil)

(1 2 3)
(type 1)

(def hello (fn [] "Hello"))

(hello)
