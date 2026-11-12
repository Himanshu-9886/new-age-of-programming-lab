
;; Experiment: Immutable Data Structures in Clojure

;; 1. LIST
(println "----- LIST -----")

(def my-list '(10 20 30 40))

(println "Original List:" my-list)
(println "First Element:" (first my-list))
(println "Rest of List:" (rest my-list))

(def new-list (conj my-list 5))

(println "Original List:" my-list)
(println "New List:" new-list)


;; 2. VECTOR
(println "\n----- VECTOR -----")

(def my-vector [10 20 30 40])

(println "Original Vector:" my-vector)
(println "Element at Index 2:" (get my-vector 2))
(println "Count:" (count my-vector))

(def new-vector (conj my-vector 50))

(println "Original Vector:" my-vector)
(println "New Vector:" new-vector)


;; 3. MAP
(println "\n----- MAP -----")

(def my-map {:name "Himanshu" :age 19 :course "Cybersecurity"})

(println "Original Map:" my-map)
(println "Name:" (get my-map :name))

(def updated-map (assoc my-map :city "Rewari"))

(println "Original Map:" my-map)
(println "Updated Map:" updated-map)

(def removed-map (dissoc my-map :age))

(println "Original Map:" my-map)
(println "Map after removing age:" removed-map)


;; 4. SET
(println "\n----- SET -----")

(def my-set #{10 20 30 40})

(println "Original Set:" my-set)
(println "Contains 20:" (contains? my-set 20))

(def new-set (conj my-set 50))

(println "Original Set:" my-set)
(println "New Set:" new-set)

(def removed-set (disj my-set 30))

(println "Original Set:" my-set)
(println "Set after removing 30:" removed-set)

(println "\nProgram Completed Successfully!")
