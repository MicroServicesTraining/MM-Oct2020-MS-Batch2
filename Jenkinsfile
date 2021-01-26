pipeline {
		agent any
		stages {
			stage('build'){
				steps {
					echo 'Started build stage...';
          				bat 'cd mm-sb-demo';
          				bat 'set path=%SystemRoot%/system32;G:/software/apache-maven-3.6.3/bin';
          				bat 'mvn clean package';
				}
			}
		}
	}
