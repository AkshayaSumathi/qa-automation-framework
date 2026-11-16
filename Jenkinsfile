pipeline {
    agent any

    stages {
        stage('Install browsers') {
            steps {
                    bat 'mvn exec:java "-Dexec.mainClass=com.microsoft.playwright.CLI" "-Dexec.args=install chromium"'
                }
            }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Archive reports') {
            steps {
                        archiveArtifacts artifacts: 'target/surefire-reports/**, target/screenshots/**', allowEmptyArchive: true
            }
        }
    }
}