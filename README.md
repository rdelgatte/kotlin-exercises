# Reversible numbers

How many reversible numbers are there below one-billion?

Some positive integers n have the property that the sum [ n + reverse(n) ] consists entirely of odd (decimal) digits. For instance, 36 + 63 = 99 and 409 + 904 = 1313. We will call such numbers reversible; so 36, 63, 409, and 904 are reversible. Leading zeroes are not allowed in either n or reverse(n).

> There are 120 reversible numbers below one-thousand.

## To-do

You can use the existing files to start solving the exercice:

- Unit tests can be written in [`src/test/kotlin/ReversibleNumbersTest.kt`](src/test/kotlin/ReversibleNumbersTest.kt)
- Property based tests can be written in [`src/test/kotlin/ReversibleNumbersPropertyBasedTest.kt`](src/test/kotlin/ReversibleNumbersPropertyBasedTest.kt) (if you are familiar with them)
- The code implementation can be written in [`src/main/kotlin/ReversibleNumbers.kt`](src/main/kotlin/ReversibleNumbers.kt)

Run tests: `gradle test`

## Solution

The expected solution is the "naive" approach which basically consist of decomposing the problem by following the problem instructions. Even though the problem is not complex, we expect the developer to write efficient code and tests (unit tests and property-based tests).

Another approach can be found by analysing deeper the raising patterns of the problem but we do not necessarily expect the candidate to develop it.
