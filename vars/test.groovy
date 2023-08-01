def call(Map params) {
    def branch = params.branch
    def url = params.url
    def env = params.env

    if (branch == null) {
        error("Missing 'branch' parameter")
        return
    }

    if (url == null) {
        error("Missing 'url' parameter!")
        return
    }

    if (env == null) {
        error("Missing 'env' parameter!")
        return
    }
  
    echo "Testing branch: ${branch}, URL: ${url}, Language: ${env}"
}

