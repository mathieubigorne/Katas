(ns FizzBuzz.core)

(defn divisible? [number diviser]
	(= 0 (mod number diviser))
)

(defn int-to-string [number]
	(. String valueOf number)
)

(defn contains-digit? [number digit]
	(.contains 
		(int-to-string number)
		(int-to-string digit)
	))

(defn fizz? [number]
	(or
		(divisible? number 3)
		(contains-digit? number 3)
	))

(defn buzz? [number]
	(or
		(divisible? number 5)
		(contains-digit? number 5)
	))

(defn fizz-buzz [number]
	(cond
		(and (fizz? number) (buzz? number)) "FizzBuzz"
		(fizz? number) "Fizz"
		(buzz? number) "Buzz"
		:else number
	))








