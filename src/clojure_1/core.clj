(ns clojure-1.core 
  (:require [ring.adapter.jetty :as jetty]))

(defn handler [request]
  {:status 2000
   :headers {"Content-Type" "text/plain"}
   :body "Hello World something"})

(defn -main []
  (jetty/run-jetty handler {:port 3000}))
