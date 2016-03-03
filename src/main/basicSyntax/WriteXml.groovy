package main.basicSyntax

/**
 * Created by mishrk3 on 2/15/2016.
 */

def file = new File('../resource/St_Louis_Zoo_sample.gpx')

def slurper = new XmlSlurper()

def gpx = slurper.parse(file)

//The library for writing to the xml file
def markupBuilder = new groovy.xml.StreamingMarkupBuilder()
def xml = markupBuilder.bind {
    wpt {
        /**
         * here overriding is must as the implied variable it will not be in scope of wayPoint.
         */
        gpx.wpt.each { point ->
            wayPoint(name: point.name.toString()) {
                mkp.comment(point.desc)
                latitude(point.@lat)
                longitude(point.@lon)
            }
        }
    }
}

def outFile = new File('../resource/St_Louis_Zoo_truncated.xml')
/**
 * calling toString is must as a closure will not be executed until it is called
 */
outFile.write(xml.toString())