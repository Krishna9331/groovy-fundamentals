package main.basicSyntax

/**
 * Created by mishrk3 on 2/15/2016.
 */

def cat = "meow"
def one = 1
/**
 * below line do not have any compile time error.
 * It fails once we try to run it.
 * This shows that compiler does not check type safe
 */
//Integer single = "one"

println cat
println cat.getClass()
println cat.toUpperCase()

println "---------------------------->"
println one
println one.getClass()
/**
 * below line do not have any compile time error.
 * It fails once we try to run it
 */
//println one.toUpperCase()

println "---------------------------->"
/**
 * This shows power of dynamic language where it is changing the type at runtime
 */
one = "one"
println one
println one.getClass()
println one.toUpperCase()