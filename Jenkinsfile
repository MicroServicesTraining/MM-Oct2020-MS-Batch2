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
			stage('deployment'){
				steps {
					echo "Build successful..";
					bat 'copy mm-sb-demo/target/*.jar G:/shekar/javasws/apache-tomcat-9.0.13/webapps';
					echo "deployment successful...";
				}
			}
		}
	}
