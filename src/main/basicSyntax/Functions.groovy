package main.basicSyntax

/**
 * Created by mishrk3 on 2/15/2016.
 */

def numbers = 1..10

for (num in numbers) {
    if (isEven(num)) {
        println num
    }
}

/**
 *
 * @param num input to the function
 * @return boolean true return if number is even otherwise false
 *
 * on below code use of def is optional in function argument.
 * Also use of return type is not mandatory
 */
def isEven(def num) {
    return num % 2 == 0
}