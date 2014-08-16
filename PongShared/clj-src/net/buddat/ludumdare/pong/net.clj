(ns net.buddat.ludumdare.pong.net
  (:use aleph.tcp
  gloss.core
  lamina.core
  net.buddat.ludumdare.pong.net.message-type)
  (:import (net.buddat.ludumdare.pong.shared Constants)))
(def DEFAULT_PORT Constants/PORT)