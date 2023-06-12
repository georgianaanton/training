pipeline {
    agent any
    tools { 
        maven 'maven-3.9.2' 
        jdk 'jdk11' 
    }
    stages{
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
}
