pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
             bat   'mvn clean package'
             bat "docker build . -t app:${env.BUILD_ID}"
            }
        }
    }
}