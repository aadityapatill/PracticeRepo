def getCurrentTimestamp() {
    return new Date().format("yyyy-MM-dd HH:mm:ss")
}

def getCurrentUser() {
    return Jenkins.instance.getAuthentication().getName()
}

def getCurrentBuildNumber() {
    return env.BUILD_NUMBER
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
