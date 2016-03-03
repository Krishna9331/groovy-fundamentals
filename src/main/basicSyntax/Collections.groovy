package main.basicSyntax
/**
 * Created by mishrk3 on 2/15/2016.
 */
def beatles = ["John", "Krishna", "Anonymous"]
def greeting = "Hello, "
for (def i = 0; i < beatles.size; i++) {
    /**concept of gString where a variable can be acessed using $ sign.
     * The $ sign consider the immediate value after the sign only e.g
     * $beatles[i] will be applied only to beatles not on the whole beatles[i]
     * for doing this we need to use ${beatles[i]}* Also whenever gString is being used it is mandatory to use double quotes
     * */
    println "$greeting" + beatles[i]
    //println "$greeting" + "${beatles[i]}"
}

println "other way of doing this ------------->"

for (beatle in beatles) {
    println "$greeting" + beatle
}