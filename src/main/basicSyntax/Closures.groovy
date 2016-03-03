package main.basicSyntax

/**
 * Created by mishrk3 on 2/15/2016.
 */

def myClosure = {
    println "In a closure"
    println new Date()
}

/**
 * closure has a property called deferred execution which means once closure is defined it is not executed
 * until it is called.
 * For calling closure parenthesis is important otherwise it will not be executed
 **/

println "example of deferred property of closure"

for (i in 1..3) {
    myClosure()
    sleep(1000)
}

println "closure as anonymous behavior"

(1..3).each { println "As an anonymous closure" }


println "Accessing each element of the array"

/**
 * $it allows access to all the element of the array
 */
(1..3).each { println "As an anonymous closure: $it" }

println "Accessing each element of the array by overriding"

(1..3).each { i -> println "As an anonymous closure overriding default 'it': $i" }


println "chaining the action"

/**
 * findAll accepts a predicated that evaluates as a boolean
 */
(1..10).findAll { it % 2 == 0 }.each { println "closure printing even number: $it" }

