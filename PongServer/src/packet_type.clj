(ns packet-type
  (:use [clojure.set :only [map-invert]]))

(def packet-id-to-type
  {0x0 :keep-alive})

(def packet-type (map-invert packet-id-to-type))