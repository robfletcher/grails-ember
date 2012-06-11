<!doctype html>
<html>
	<head>
		<title>Ember JS Resources</title>
		<r:require module="ember"/>
		<r:script>
			$(function() {
				$('#jquery-version').text($().jquery);
				$('#ember-version').text(Ember.VERSION);
			});
		</r:script>
		<r:layoutResources/>
		<style>
			body { font-family: sans-serif; }
			dt, dd { display: inline-block; }
			dt:after { content: ':'; }
		</style>
	</head>
	<body>
		<h1>Ember JS Resources</h1>
		<dl>
			<dt>jQuery version</dt>
			<dd id="jquery-version"></dd>
		</dl>
		<dl>
			<dt>Ember version</dt>
			<dd id="ember-version"></dd>
		</dl>
		<r:layoutResources/>
	</body>
</html>