pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    environment {
        TOMCAT_IP = "172.31.28.95"
        KEY = "jenkinkey.pem"
    }

    stages {

        stage('Clone Code') {
            steps {
                git 'https://github.com/AKaksarun/sample-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                sh '''
                chmod 400 $KEY
                scp -o StrictHostKeyChecking=no -i $KEY target/sample-app.war ec2-user@$TOMCAT_IP:/opt/tomcat/webapps/
                '''
            }
        }
    }
}
