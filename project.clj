(defproject clj-gmail "0.1.0-SNAPSHOT"
  :description "Read Gmail Inbox using Clojure"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot clj-gmail.core
  :profiles {:uberjar {:aot :all :uberjar-name "app.jar"}})
