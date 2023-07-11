def call(String branch,String goal){
	
    if (branch == "main" || branch == "master") {
      git branch: '$branch', url: 'https://github.com/aadityapatill/PracticeRepo'
    } else {
        println "skipping clone as branch '$branch' is not 'main' or 'master'"
    }

    switch (goal) {
        case "build":
           echo 'mvn build'
            break
        case "test":
           echo 'mvn clean test'
            break
        case "deploy":
            echo 'mvn deploy'
            break
        default:
            echo 'no goals'
            break
    }
}
