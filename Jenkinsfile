pipeline {
  agent any
  stages {
      stage('Build') {
          steps {
              sh './gradlew -DskipTests clean assemble'
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