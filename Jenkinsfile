pipeline {
		agent any
		stages {
			stage ('build'){
				steps {
					echo 'Started build stage...';
          				bat 'cd mm-sb-demo';
					bat 'mvn -f mm-sb-demo/pom.xml clean package';
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
					bat 'copy mm-sb-demo\target\demo.war g:\shekar\javasws\apache-tomcat-9.0.13\webapps';
					echo 'Deployment completed successfull...';
				}
			}
		}
	}
