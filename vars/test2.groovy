def call(Map params) {
    def branch = params.branch
    def url = params.url
    def env = params.env

   if (branch == "main" || branch == "master") {
      git branch: '$branch', url: 'https://github.com/aadityapatill/PracticeRepo'
    } else {
        println "skipping clone as branch '$branch' is not 'main' or 'master'"
    }

}
