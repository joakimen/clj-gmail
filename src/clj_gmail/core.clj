(ns clj-gmail.core
  (:require [clj-gmail.gmail :as gmail])
  (:gen-class))

(defn -main
  [& args]
  (gmail/read-inbox))


(comment
  (-main))
