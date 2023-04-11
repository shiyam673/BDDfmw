pipeline {
 agent any

 stages {
        

 stage('Build') {
            steps {
                bat 'mvn clean test'
            }
            }
            

    }
            post {
        always {
            //to send mail to recipient
            cucumber buildStatus: 'null', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1

        }
        }    

}