pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/vevego/OTP-week6-lecture'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
    }
}