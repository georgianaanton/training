pipeline {
    agent any
    tools {
      maven 'Maven-3.8.4'
    }
    stages {
        stage('Source') {
            steps {
                git branch: 'main',
                    changelog: false,
                    poll: false,
                    url: 'https://github.com/georgianaanton/training.git'
            }
        }
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }
    }
//     post {
//         always {
//             junit allowEmptyResults: true,
//                 testResults: '**/TEST-com.learningjenkins.AppTest.xml'
//
//             archiveArtifacts allowEmptyArchive: true,
//                 artifacts: '**/training-1.0-SNAPSHOT.jar'
//         }
//     }
}
