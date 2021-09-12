(ns clj-gmail.auth
  [:require  [toml.core :as toml]])

(defn config []
  (toml/read (slurp (str (System/getenv "HOME") "/.config/gmail.toml")) :keywordize))

(defn auth []
  (:auth (config)))
