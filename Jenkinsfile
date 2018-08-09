pipeline { 
    agent any

    triggers {
        pollSCM('*/5 * * * *')
    }
    stages {
       stage('Checkout: Code') {
steps {
sh "rm -r *"

 git url: 'https://github.com/MAHA06/JenkinsTests'
sh "chmod -R +x *"
}
}
        stage('Compile') {
            steps {
                gradlew('clean', 'classes')
            }
         }
           stage('Unit Tests') {
            steps {
                gradlew('test')
            }
            post {
                always {
                    junit '**/build/test-results/test/TEST-*.xml'
                }
            }
        }

    }
}
def gradlew(String... args) {
    sh "./gradlew ${args.join(' ')} -s"
}
