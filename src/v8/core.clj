(ns v8.core
  (:require [net.n01se.clojure-jna :as jna]))

(defn run-script
  "Compiles and runs a JS file"
  [script]
  ((jna/jna-fn String v8wrapper/run) script))
