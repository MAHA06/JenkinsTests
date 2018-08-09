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
                 junit 'reports/**/*.xml'
            }
            
        }

    }
}
def gradlew(String... args) {
    sh "./gradlew ${args.join(' ')} -s"
}
