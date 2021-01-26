pipeline {
		agent any
		stages {
			stage('build'){
				steps {
					echo 'Started build stage...';
          				sh 'cd mm-sb-demo';
          				sh 'set path=.;%SystemRoot%/system32;G:/software/apache-maven-3.6.3/bin';
          				sh 'mvn clean package';
				}
			}
		}
	}
