(ns pong-server
  (:use aleph.tcp
        gloss.core
        lamina.core
        net.buddat.ludumdare.pong.net.message-type)
  (:require clojure.tools.logging)
  (:import [net.buddat.ludumdare.pong.shared Constants]))

(def DEFAULT_PORT Constants/PORT)
(def DEFAULT_CHANNEL "pong-server")

(defn handler [ch client-info]
  (receive-all ch
    #(enqueue ch (str "Handle " % ))))

(defcodec pong-codec (enum :int32 message-type))
(defn -main [& args]
  (start-tcp-server handler {:port DEFAULT_PORT, :frame pong-codec}))