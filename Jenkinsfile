pipeline {
	agent {
        docker {
            image 'maven:3-openjdk-11'
            args '-v $HOME/Documents/paycraft/maven:/root/.m2'
        }
    } 

	stages {
		stage ('Compile Stage') {
			steps {
				withMaven(maven : 'MAVEN_HOME'){
					sh 'mvn clean compile'
				}
			}
		}

		stage ('Testing Stage') {
			steps {
				withMaven(maven : 'MAVEN_HOME') {
					sh 'mvn test'
				}
			}
		}

		stage ('Deploy Stage') {
			steps {
				withMaven(maven : 'MAVEN_HOME') {
					sh 'mvn deploy'
				}
			}
		}
	}
}