(ns clj-gmail.gmail
  (:require [clojure-mail.core :refer [inbox]]
            [clojure-mail.gmail :as gmail]
            [clj-gmail.auth :refer [creds]]
            [clj-gmail.formatting :refer [pprint]]))

(defn read-inbox []
  (let [{:keys [user pass]} (creds)
        store (gmail/store user pass)
        messages (inbox store)]
    (dorun (map pprint messages))))

(comment

  (read-inbox)

  (let [{:keys [user pass]} (creds)
        store (gmail/store user pass)]
    (def store store)
    (def m (first (inbox store))))

  (pprint m)
  (dorun (map pprint (inbox store))))
