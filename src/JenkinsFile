
pipeline {
    agent any

     tools {
        maven 'Maven 3.x'  // The name you provided in the Global Tool Configuration
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'git@github.com:amrita-source/Interviews.git'
            }
        }

        stage('Build') {
            steps {

                    dir('MavenProject')
                {
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                 dir('MavenProject')
                {
                sh 'mvn test'
            }
        }
    }
}
}