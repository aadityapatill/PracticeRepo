 def call(Map pipelineParams) {
  pipeline {
    stages {
      stage('git clone') {
        steps {
          cleanWs()
          script {
            gitCheckout(branch: pipelineParams.branch,  url: "//https://github.com/aadityapatill/PracticeRepo")
          }
        }
      }
   }
  }
 }
   
