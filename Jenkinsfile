pipeline {
		agent any
		stages {
			stage('build'){
				steps {
					echo 'Started build stage...'
          cd mm-sb-demo
          set path=.;%SystemRoot%\system32;G:\software\apache-maven-3.6.3\bin;
          mvn clean package
				}
			}
		}
	}
