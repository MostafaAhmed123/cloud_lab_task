# Jenkins Docker Image with Docker Support

This Dockerfile extends the official Jenkins LTS Docker image and installs Docker within the Jenkins container to allow it to interact with Docker daemon.

## Build and Run Instructions

### Prerequisites

Make sure you have Docker installed on the host machine where you intend to run this Jenkins Docker container.

### Build the Docker Image and Run the Docker Container

```bash
docker build -t custom-jenkins-docker . && docker run -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home -v /var/run/docker.sock:/var/run/docker.sock custom-jenkins-docker

```

# Executing an Existing Jenkinsfile

Follow these steps to execute an existing Jenkinsfile using a Jenkins job.

## 1. Log in to Jenkins

Open your web browser and navigate to your Jenkins instance. Log in with your credentials.

## 2. Create a New Jenkins Job

- Click on "New Item" on the Jenkins dashboard.
- Enter a name for your job (e.g., "MyPipeline") and choose "Pipeline" as the job type.
- Click "OK" to create the job.

## 3. Configure the Pipeline

- In the job configuration page, scroll down to the "Pipeline" section.
- Choose the definition as "Pipeline script from SCM."

## 4. Select SCM (Source Code Management)

- Choose the type of SCM where your Jenkinsfile is located. This can be Git, SVN, Mercurial, etc.
- Provide the repository URL and other necessary credentials if required.

## 5. Specify Jenkinsfile Path

- In the "Script Path" field, enter the path to your Jenkinsfile. This is the relative path from the root of your repository to the Jenkinsfile.

## 6. Save the Job Configuration

- Scroll down and click "Save" to save the Jenkins job configuration.

## 7. Run the Jenkins Job

- Click on "Build Now" to trigger a build of the pipeline.

## 8. View Pipeline Execution

- Once the build is triggered, click on the job in the Jenkins dashboard to view the details of the pipeline execution.
- The pipeline will progress through the stages defined in your Jenkinsfile.

## 9. Review Console Output

- Click on the build number to view the console output. This will show the detailed logs of each stage and command executed.

## 10. Troubleshoot and Adjust

- If there are any issues, review the console output for error messages.
- Make adjustments to your Jenkinsfile or job configuration as needed.
