pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Unit test") {
            steps {
                sh "./gradlew test"
            }
        }
        stage("Code coverage") {
            sh "./gradlew jacocoTestReport"
            sh "./gradlew jacocoTestCoverageVerification"
        }
    }        
}