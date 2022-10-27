### Testing and Test Driven Development (TDD):
1. Setup JUnit for your Intellij project (assesment prep)
2. Write and run your first happy path Junit test. Testing the isValidPassword method from Exercise1.
3. Write a test method for each condition (given by the exercise1) where you expact the the password to be invalid.  
4. Create another test class for testing Employee from exercise2. Setup your employee using @Setup. Write tests for each condition given to you in Exercise2.  
5. Create a new class Calculator with the methods plus/minus/divide/multiply. Write a JUnit test class testing your Calculator. 
    * Simple tests for all four basic calculations
    * A test with numbers greater than 10000
    * A test with negative number as result
    * A test with negative number as parameter, e.g. plus(-4)
    * Now break the calculator on purpose: Make one method behave incorrecty, e.g. always +1 the result.
        * How is the error noticeable?
        * How can you re-run only the failed tests?
    * Bonus: Test with result greater than 3 billion, Test division by 0
6. Refactor your Exercise1.isValidPassword method and create a new class PasswordChecker
    * It should have the (non static) method isValidPassword in it (make sure everything still compiles and the tests within your exercise is still working)
    * testdrive an implementation of a solution that allows you to see the reason for invalidity of the given password.