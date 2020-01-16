(ns dojo-fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [dojo-fizzbuzz.core :refer :all]))

(deftest test-buzz
  (is (= (fizzbuzz 20) "buzz")))

(deftest test-fizz
  (is (= (fizzbuzz 6) "fizz")))

(deftest test-fizzbuzz
  (is (= (fizzbuzz 15) "fizzbuzz")))

(deftest test-proprio-numero
  (is (= (fizzbuzz 8) 8)))
