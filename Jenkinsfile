pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/roddyrojasl/jenkins-pipeline-sample.git'
            }
        }
        stage('Install') {
            steps {
                sh 'mvn install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
