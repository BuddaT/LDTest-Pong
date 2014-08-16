(ns net.buddat.ludumdare.pong.net.message-type
  (:use [clojure.set :only [map-invert]]))

(def message-id-to-type
  {0x0 :keep-alive
  0x1 :login
  0x2 :logout
})

(def message-type (map-invert message-id-to-type))