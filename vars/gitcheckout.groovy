  def call(Map pipelineParams) {
  pipeline {
     agent pipelineParams.agent
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
   
