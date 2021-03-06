(defproject gifler "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [lib-noir "0.7.6"]
                 [compojure "1.1.6"]
                 [ring-server "0.3.1"]
                 [selmer "0.5.4"]
                 [com.taoensso/timbre "2.7.1"]
                 [com.postspectacular/rotor "0.1.0"]
                 [com.taoensso/tower "2.0.1"]
                 [markdown-clj "0.9.35"]
                 [com.novemberain/monger "1.5.0"]
                 [environ "0.4.0"]]

  :aot :all
  :repl-options {:init-ns gifler.repl}

  :plugins [[lein-ring "0.8.7"]
            [lein-environ "0.4.0"]]

  :ring {:handler gifler.handler/app
         :init    gifler.handler/init
         :destroy gifler.handler/destroy}

  :profiles
  {:production {:ring {:open-browser? false
                       :stacktraces?  false
                       :auto-reload?  false}
                :env {:selmer-dev false
                      :db-uri "mongodb://localhost/gifler"}}

   :dev {:dependencies [[ring-mock "0.1.5"]
                        [ring/ring-devel "1.2.1"]]
         :env {:selmer-dev true
               :db-uri "mongodb://localhost/gifler"}}}

  :min-lein-version "2.0.0")
