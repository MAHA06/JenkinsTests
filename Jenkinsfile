pipeline { 
    agent any

    triggers {
        pollSCM('*/5 * * * *')
    }
    stages {
       
        stage('Compile') {
            steps {
                gradlew('clean', 'classes')
            }
         }
    }
}
def gradlew(String... args) {
    sh "./gradlew ${args.join(' ')} -s"
}
