class EmberGrailsPlugin {

    def version = '0.9.8.1' // version number is synced with the version of ember.js that this plugin includes
    def grailsVersion = '1.3 > *'
    def dependsOn = [resources: '1.1.6 > *', jquery: '1.7.2 > *']
    def pluginExcludes = [
        'grails-app/views/*.gsp'
    ]

    def title = 'Ember Resources Plugin'
    def author = 'Rob Fletcher'
    def authorEmail = 'rob@freeside.co'
    def description = '''\
A plugin that provides resources definitions for Ember.js
'''

    def documentation = 'http://freeside.co/grails-ember'
    def license = 'MIT'
    def organization = [ name: 'Freeside Software', url: 'http://freeside.co/' ]
    def issueManagement = [ system: 'GitHub', url: 'https://github.com/robfletcher/grails-ember/issues' ]
    def scm = [ url: 'https://github.com/robfletcher/grails-ember' ]

}
