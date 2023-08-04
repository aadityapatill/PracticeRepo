def getCurrentTimestamp() {
    return new Date().format("yyyy-MM-dd HH:mm:ss")
}

def getCurrentUser() {
    return Jenkins.instance.getAuthentication().getName()
}

def getCurrentBuildNumber() {
    return env.BUILD_NUMBER
}

def mavenAction(String action) {
    switch (action) {
        case "clean":
            echo "Executing 'mvn clean'..."
            //bat 'mvn clean'
            break
        case "package":
            echo "Executing 'mvn package'..."
            //bat 'mvn package'
            break
        case "install":
            echo "Executing 'mvn install'..."
            //bat 'mvn install'
            break
        default:
            echo "Invalid Maven action: ${action}. No action taken."
            break
    }
}

def printMessage(String message) {
    echo "Message: ${message}"
}

def sendSlackNotification(String message) {
    echo "Sending Slack notification: ${message}"
}

def addNumbers(int a, int b) {
    return a + b
}

def getCurrentBranchName() {
    return env.BRANCH_NAME
}

def isRunningOnMaster() {
    return env.NODE_NAME == "master"
}

def getAllNodes() {
    return Jenkins.instance.nodes.collect { node -> node.name }
}
