pipeline {
		agent any
		stages {
			stage('build'){
				steps {
					echo 'Started build stage...';
          				bat 'cd mm-sb-demo';
					bat 'mvn -f mm-sb-demo/pom.xml clean package';
				}
			}
		}
	}
