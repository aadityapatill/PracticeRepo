def myPipeline(Map params) {
    pipeline {
        agent any
        stages {
            stage('install dependencies') {
                steps {
                    echo "Building with version : ${params.version}"
                }
            }

            stage('Test') {
                steps {
                    echo "Running ${params.test} tests..."
                    script {
                        switch (params.test) {
                            case 'unit':
                                echo 'Running Unit Tests...'
                                break
                            case 'integration test':
                                echo 'Running Integration Tests...'
                                break
                            default:
                                echo 'No test type specified or unrecognized test type.'
                                break
                        }
                    }
                }
            }

            stage('Deploy') {
                steps {
                    echo "Deploying to ${params.deployServer} server..."
                    script {
                        switch (params.deployServer) {
                            case 'staging':
                                echo 'Deploying to Staging server...'
                                break
                            case 'production':
                                echo 'Deploying to Production server...'
                                break
                            default:
                                echo 'Unrecognized deployment server.'
                                break
                        }
                    }
                }
            }

            stage('Notification') {
                script {
                        switch (params.notification) {
                            case 'team and email':
                                echo 'Sent to mail and team...'
                                break
                            case 'team':
                                echo 'Sent to team...'
                                break
                            default:
                                echo 'Sent to mail...'
                                break
                        }
                    }
            }
        }
    }
}
