(ns clj-gmail.formatting
  [:require [clojure-mail.message :as message]])

(defn sender [msg]
  (let [s (message/sender msg)]
    (or (:name s) (:address s))))

(defn received-date [msg]
  (.format
   (java.text.SimpleDateFormat. "yyyy/MM/dd hh:mm")
   (message/date-received msg)))

(defn subject [msg]
  (or (message/subject msg) "(no subject)"))

(defn pprint-fmt [msg]
  (format "[%s] <%s> %s"
          (received-date msg)
          (sender msg)
          (subject msg)))

(defn pprint [msg]
  (println (pprint-fmt msg)))
