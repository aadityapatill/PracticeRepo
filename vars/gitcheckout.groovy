  def call(Map params) {
    def branch = params.branch
    def url = params.url
    def env = params.env
 checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])

    if (url == null) {
        error("Missing 'url' parameter!")
        return
    }

    if (env == null) {
        error("Missing 'env' parameter!")
        return
    }
  
    echo "Testing branch: ${branch}, URL: ${url}, Environment: ${env}"
}
