(ns FizzBuzz.test.core
	(:use [FizzBuzz.core])
	(:use [clojure.test])
)

(deftest verify_that_9_is_divisible_by_3
	(is (divisible? 9 3)))

(deftest verify_that_4_is_not_divisible_by_3
	(is (not (divisible? 4 3))))

(deftest verify_that_33_contains_3
	(is (contains-digit? 33 3)))

(deftest verify_that_3_is_Fizz
	(is (fizz? 3)))

(deftest verify_that_4_is_not_Fizz
	(is (not (fizz? 4))))

(deftest verify_that_13_is_Fizz
	(is (fizz? 13)))

(deftest verify_that_5_is_Buzz
	(is (buzz? 5)))

(deftest verify_that_4_is_not_Buzz
	(is (not (buzz? 4))))

(deftest verify_that_15_is_Buzz
	(is (buzz? 15)))

(deftest verify_that_1_is_1
	(is 
		(= (fizz-buzz 1) 1)))

(deftest verify_that_3_is_Fizz
	(is 
		(= (fizz-buzz 3) "Fizz")))

(deftest verify_that_5_is_Buzz
	(is 
		(= (fizz-buzz 5) "Buzz")))

(deftest verify_that_15_is_FizzBuzz
	(is 
		(= (fizz-buzz 15) "FizzBuzz")))










