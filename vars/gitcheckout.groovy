 def call(Map pipelineParams) {
  pipeline {
    agent {
      label pipelineParams.agent
    }
    stages {
      stage('git clone') {
        steps {
          cleanWs()
          script {
            gitCheckout(branch: pipelineParams.branch,  url: "//https://github.com/aadityapatill/PracticeRepo")
          }
        }
      }
      stage('run web test cases') {
        steps {
          script {
            if (url == null) {
                  error("Missing 'url' parameter!")
                       return
                }
            bat "mvn --version"
          }
        }
      }
   }
  }
 }
   
