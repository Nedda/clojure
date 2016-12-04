(defproject clojure-1 "0.1.0-SNAPSHOT"
  :description "my first clojure server"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler clojure-1.core2/handler}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.2.1"]
                 [ring/ring-jetty-adapter "1.2.1"]]
  :main clojure-1.core
  :profiles {:uberjar {:aot :all}})
