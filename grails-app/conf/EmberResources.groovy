def version = '0.9.8.1'

modules = {
    'ember' {
    	dependsOn 'jquery'
        resource id: 'js', url: [plugin: 'ember', dir: 'js/ember', file: "ember-${version}.min.js"], nominify: true
    }

    'ember-dev' {
    	dependsOn 'jquery'
        resource id: 'js', url: [plugin: 'ember', dir: 'js/ember', file: "ember-${version}.js"]
    }
}