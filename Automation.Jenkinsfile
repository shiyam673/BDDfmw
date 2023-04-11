pipeline {
 agent any

 stages {
        stage ('checkOut') {
            steps  {
                     git branch: 'main ', credentialsId: 'Git' , url: 'https://github.com/Aravindk1712/aaaabbbbcc/'
                   }
                   }
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
