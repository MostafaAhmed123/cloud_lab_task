pipeline {
    agent any

    tools {
        git 'Default'
    }

    stages {
        stage('Build') {
            steps {
                script {
                    git 'https://github.com/MostafaAhmed123/cloud_lab_task.git'
                    sh './entrypoint.sh'
                }
            }
        }
    }
}
