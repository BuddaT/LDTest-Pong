(ns net.buddat.ludumdare.pong.net-client
  (:use lamina.core aleph.tcp aleph.formats net.buddat.ludumdare.pong.net))

(defn connection-established [socket]
  (println "Socket connection established")
  (on-closed socket #(println "closed"))
  (future (doseq [line (line-seq (java.io.BufferedReader. *in*))]
    (enqueue socket line))))

(defn -main [& args]
  (on-realized (tcp-client {:host "localhost" :port DEFAULT_PORT})
    connection-established
    #(println "error:" %)))