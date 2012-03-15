class FizzBuzz {
       def convert(number: Int) = {
           if(number == 15){
	     "FizzBuzz"
	   } else if (isDivisibleOrContains(number, 3)) {
	     "Fizz"
           } else if(isDivisibleOrContains(number, 5)) {
	     "Buzz"
	   }  else {
             number.toString
	   }
       }

       def contains(number:Int, digit:Int) = {
          number.toString.contains(digit toString)
       }

       def isDivisibleOrContains(number:Int, digit:Int) = 
       	   number % digit == 0 || contains(number, digit)
}