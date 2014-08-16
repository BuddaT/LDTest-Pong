(defproject ld-server "0.1-SNAPSHOT"
  :description "Pong Server"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.logging "0.3.0"]
                 [aleph "0.3.3"]
                 [lamina "0.5.2"]
                 [gloss "0.2.2"]
                 [net.buddat.ludumdare.pong/pongshared "0.1-SNAPSHOT"]]
  :main pong-server
  :java-source-paths ["java-src"])
