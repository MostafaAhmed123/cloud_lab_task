pipeline {
    agent any

    stages {
        stage('Fetch GitHub Repo') {
            steps {
                script {
                    // Fetch the GitHub repository
                    git url: 'https://github.com/MostafaAhmed123/cloud_lab_task.git', branch: 'main'
                    
                    // Make entrypoint.sh executable and run it
                    sh 'chmod +x ./entrypoint.sh'
                    sh './entrypoint.sh'
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed! Check the build logs for details.'
        }
    }
}
