import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class AppTest extends FunSuite with ShouldMatchers { 
  val fizzBuzz = new FizzBuzz

  test("FizzBuzz 1 is 1") { 
     assert(fizzBuzz.convert(1) === "1")
  }  

  test("FizzBuzz 2 is 2") { 
     assert(fizzBuzz.convert(2) === "2")
  }  

  test("FizzBuzz 6 is Fizz") {
     assert(fizzBuzz.convert(6) === "Fizz")
  }  

  test("FizzBuzz 3 is Fizz"){
     assert(fizzBuzz.convert(3) === "Fizz")	 
  }
  
  test("FizzBuzz 13 is Fizz"){
     assert(fizzBuzz.convert(13) === "Fizz")	 
  }

  test("FizzBuzz 31 is Fizz"){
     assert(fizzBuzz.convert(31) === "Fizz")	 
  }

  test("FizzBuzz 5 is Buzz"){
     assert(fizzBuzz.convert(5) === "Buzz")	 
  }

  test("FizzBuzz 25 is Buzz"){
     assert(fizzBuzz.convert(25) === "Buzz")	 
  }

  test("FizzBuzz 52 is Buzz"){
     assert(fizzBuzz.convert(52) === "Buzz")	 
  }

  test("FizzBuzz 15 is FizzBuzz"){
     assert(fizzBuzz.convert(15) === "FizzBuzz")	 
  }




}
