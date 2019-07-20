node('master'){
    def gradleHome = tool name: 'gradle5', type: 'gradle'

    stage('SCM'){
        echo 'Pulling...' + env.BRANCH_NAME
        checkout scm
    }
    stage('build'){
        def gradle = "${gradleHome}/bin/gradle"
        sh label: '', script: "${gradle} clean build assemble"
    }
    if(env.BRANCH_NAME.contains("Release")){
        stage('Build Docker Image'){
            sh "sudo docker build -t sharadprsn/sample-app-${env.BRANCH_NAME}:${BUILD_NUMBER} ."

        }
    }
}