pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh 'chmod +x ./entrypoint.sh'
                    sh './entrypoint.sh'
                }
            }
        }
    }
}
