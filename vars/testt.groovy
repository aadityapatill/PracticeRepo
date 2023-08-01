def call(Map params) {
    def branch = params.branch
    def url = params.url
    def env = params.env

     bat 'mvn --version'      

   if (branch == "main" || branch == "master") {
      git branch: '$branch', url: '$url'
    } else {
        println "skipping clone as branch '$branch' is not 'main' or 'master'"
    }

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
