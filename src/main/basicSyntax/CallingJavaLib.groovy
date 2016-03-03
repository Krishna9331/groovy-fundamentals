package main.basicSyntax

/**
 * Created by mishrk3 on 2/16/2016.
 */

/*
@Grapes(
        @Grab(group = 'joda-time', module = 'joda-time', version = '2.9.2')
)
*/

@Grab(group = 'joda-time', module = 'joda-time', version = '2.9.2')
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

def getDate =
        {
            new Date()
        }

(1..10).each {
    def printableTime = new DateTime(getDate())
    def format = DateTimeFormat.forPattern('MM/dd/yyyy - hh:mm:ss aa')
    println printableTime.toString(format)
    sleep(1000)
}