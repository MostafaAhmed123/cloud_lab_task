pipeline {
    agent any
    tools {
        git 'Default'
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/MostafaAhmed123/cloud_lab_task.git'
                
                // Execute bash script file
                script {
                    sh './entrypoint.sh'
                }
            }
        }
    }
}
