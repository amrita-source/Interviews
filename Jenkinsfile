pipeline {
    agent any

    tools {
        maven 'Maven 3.x'  // Ensure this matches Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'git@github.com:amrita-source/Interviews.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}