pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/lohithp1805/ParaBank_Automation.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Archive Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }

    }

    post {

        always {
            archiveArtifacts artifacts: 'screenshots/*.png', allowEmptyArchive: true
        }

        success {
            echo 'Automation Tests Passed!'
        }

        failure {
            echo 'Automation Tests Failed!'
        }

    }
}
