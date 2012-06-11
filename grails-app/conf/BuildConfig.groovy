grails.project.work.dir = 'target'
grails.project.class.dir = 'target/classes'
grails.project.test.class.dir = 'target/test-classes'
grails.project.test.reports.dir = 'target/test-reports'
grails.project.target.level = 1.6

grails.project.dependency.resolution = {
    inherits 'global'
    log 'warn'
    repositories {}
    dependencies {}
    plugins {
        runtime(':resources:1.2-RC1', ':jquery:1.7.2', ":tomcat:$grailsVersion") { export = false }
    }
}
