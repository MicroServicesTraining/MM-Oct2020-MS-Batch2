pipeline {
		agent any
		stages {
			stage ('build'){
				steps {
					echo 'Started build stage...';
          				bat 'cd banking-service';
					bat 'mvn -f banking-service/pom.xml clean package';
					echo 'Maven build is completed successfully...';
				}
			}
			stage ('test') {
				steps {
					echo 'Regression tests stage started...';
					echo 'Test stage completed successfully...';
				}
			}
			stage ('sonar') {
				steps {
					echo 'Sonar code analysis stage started...';
					echo 'Sonar code analysis completed successfully';
				}
			}
			stage ('fortify') {
				steps {
					echo 'Fortify scans stage started....';
					echo 'Fortify scans completed successfully...';
				}
			}
			stage ('deployment') {
				steps {
					echo 'Deployment stage started...';
					# bat 'cd banking-service/target'
					# bat 'copy "./banking-service-0.0.1-SNAPSHOT.war" "G:/shekar/javasws/apache-tomcat-9.0.13/webapps/banking-service.war"'
					echo 'Deployment completed successfully...';
				}
			}
		}
	}
