package main.basicSyntax
/**
 * Created by mishrk3 on 2/15/2016.
 */

/**
 * In place of using for loop and initializing the value for some range we can directly use ..
 */
def numbers = 1..10

for (num in numbers) {
    println "The value is: " + num
}

//range for letters

def chars = 'a'..'g'
for (ch in chars) {
    println "The character is: " + ch
}

def enum DAYS {
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT,
    SUN
}

def weekDays = DAYS.MON..DAYS.FRI
println "week days in enum are ----->"
for (day in weekDays)
    println day

println "extents for weekDays range are: ----->"
println weekDays.from
println weekDays.to
