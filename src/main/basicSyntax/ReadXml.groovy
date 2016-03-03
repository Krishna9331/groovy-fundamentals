package main.basicSyntax

/**
 * Created by mishrk3 on 2/15/2016.
 */

def file = new File('../resource/St_Louis_Zoo_sample.gpx')

def slurper = new XmlSlurper()

def gpx = slurper.parse(file)
/**
 * The concept of gPath allow us to access the any node child object of a document.
 * because of dynamic nature of groovy we can point to some not exist node children which we expect at runtime.
 * If it does not get the node even at the time of runtime it will return an empty child but no error.
 */

println gpx.metadata.name
println gpx.metadata.desc

/**
 * for accessing an attribute of a node we have to use @ notation before the attribute name
 */

println "The version is: " + gpx.@version

gpx.wpt.each {
    println "--------------------------------->"
    println "Point name is: " + it.name
    println "Latitude: " + it.@lat
    println "Longitude: " + it.@lon
}