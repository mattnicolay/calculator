pipeline {
    stages {
        stage('Build') {
            steps {
                sh './gradlew -B -DskipTests clean assemble'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
            post {
                always {
                    junit 'build/test-results/test/*.xml'
                }
            }
        }
    }
}