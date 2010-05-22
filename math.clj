(ns bdbmath)

(defn product [x]
  (apply * x))

(defn sum [x]
  (apply + x))

(defn mean [x]
  (float (/ (sum x) (count x) )))

(defn lillsqrt [x]
  (. java.lang.Math sqrt x))

(defn storsqrt [x]
  (cond (empty? x) ()
        :else (cons (lillsqrt(first x)) (storsqrt(rest x)))))

(if *command-line-args*
  (cond (= (first *command-line-args*) "sum") (println (sum '(1 2 3)))
   :else (println "feeel!")))