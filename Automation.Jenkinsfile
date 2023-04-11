pipeline {
    agent any

 

    stages {
        stage ('checkOut') {
            steps  {
                     git branch: 'master', credentialsId: 'Git' , url: 'https://github.com/shiyam673/BDDfmw/'
                   }

 

        stage('Jar Creation') {
            steps {
                bat 'mvn clean package assembly:single -Dmaven.test.skip=true'
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