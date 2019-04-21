(ns matching-socks.core
  (:gen-class))

(defn divide-by-two [val]
(int (/ val 2)))

(defn get-pairs [input]
  (def frequ (frequencies input))
  (def even-counts (map divide-by-two (vals frequ)))
  (reduce + even-counts))


(defn -main
  "solution to sock-pairs hackerrank problem."
  [& args]
  (def input [10 20 20 10 10 30 50 10 20])
(println (get-pairs input))
  )
