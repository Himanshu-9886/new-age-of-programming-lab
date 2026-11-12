
;; Experiment: Sequence Processing in Clojure

;; First Collection
(println "----- FIRST COLLECTION -----")

(def numbers [1 2 3 4 5 6])

(println "Original Collection:" numbers)

;; 1. MAP - Square each element
(println "Squares:" (map #(* % %) numbers))

;; 2. FILTER - Select even numbers
(println "Even Numbers:" (filter even? numbers))

;; 3. REDUCE - Calculate sum
(println "Sum:" (reduce + numbers))

;; 4. TAKE and DROP
(println "Take First 3:" (take 3 numbers))
(println "Drop First 3:" (drop 3 numbers))

;; Threading Macro
(println "Threading Result:"
         (->> numbers
              (map #(* % %))
              (filter even?)
              (take 3)))


;; Second Collection
(println "\n----- SECOND COLLECTION -----")

(def numbers2 '(10 15 20 25 30))

(println "Original Collection:" numbers2)

;; MAP
(println "Squares:" (map #(* % %) numbers2))

;; FILTER
(println "Even Numbers:" (filter even? numbers2))

;; REDUCE
(println "Sum:" (reduce + numbers2))

;; TAKE and DROP
(println "Take First 2:" (take 2 numbers2))
(println "Drop First 2:" (drop 2 numbers2))

;; Threading Macro
(println "Threading Result:"
         (->> numbers2
              (map #(* % %))
              (filter even?)
              (take 3)))

(println "\nProgram Completed Successfully!")
