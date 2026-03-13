pipeline {

    agent any

    tools {
        maven 'Maven_3.9'
        jdk 'JDK_25'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/lohithp1805/ParaBank_Automation.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }

    }

}
