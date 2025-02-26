pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/vevego/OTP-week6-lecture'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
    }
}