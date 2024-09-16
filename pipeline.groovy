pipeline {
  agent any
  
  stages {
    stage('Build') {
      steps {
        // Command to build the project
        sh './gradlew assemble'  // TODO: Add the build step
      }
    }
    
    stage('Test') {
      steps {
        // Command to run tests
        sh './gradlew test'  // TODO: Add the test step
      }
    }
  }

  post {
    success {
      echo 'Build succeeded!'
    }
    failure {
      echo 'Build failed!'
    }
  }
}
