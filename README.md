# Java-Assignment-009 - More with BigInteger Objects

**Instructions:**

1. Fork this repository to your GitHub account.
2. Clone the forked repository locally to your machine.
3. Create a new branch named Feature01.

## Part 1: Understanding the Objects on the Stack and Heap

**Objective:** You might be sick of the factorial method by now, but we’re going to do one more version.

1. In the class [Big](src/Big.java), write an iterative version of factorial (using a for loop).
2. Write a method to display a table of the integers from 0 to 30 along with their factorials.
    * At some point around 15, you will probably see that the answers are not correct anymore.
    * Why not?

```text
There's an integer overflow.
It's going higher than the max value
that can be represented by 'int'.
It goes higher than the data type range.
With how the factorial of
15 is 1,307,674,368,000.
```

3. Convert factorial so that it performs its calculation using **BigIntegers** and returns a **BigInteger** as a result.
    * You can leave the parameter alone; it will still be an **integer**.
4. Try displaying the table again with your modified factorial method.
    * Is it correct up to 30?
    * How high can you make it go?

```text
For one, BigInteger can handle large numbers.
So, yes, it can go up to 30. How high?
As both Google and the textbook says,
it only depends on the memory size.
Theoretically, it's unlimited.
The only limit is what the storage can handle. 
```

## Submission

Follow these steps for submission:

1. Create a Feature01 branch of your code if you haven't already.
2. Commit your working code for the exercises to your local copy/Feature01 branch.
3. Push it to your Remote/origin branch (i.e., GitHub: Feature01 -> origin/Feature01).
4. Issue a Pull request to my instructor repo.
5. Make sure to COPY the Pull request URL and submit it for the lab/assignment in Canvas.
