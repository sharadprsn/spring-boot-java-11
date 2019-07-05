node('master'){
    def gradleHome = tool name: 'gradle5', type: 'gradle'

    stage('SCM'){
        echo 'Pulling...' + env.GIT_BRANCH
        checkout scm
        checkout([$class: 'GitSCM', branches: [[name: "${env.GIT_BRANCH}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-credential', url: 'https://github.com/sharadprsn/spring-boot-java-11.git']]])
    }
    stage('build'){
        def gradle = "${gradleHome}/bin/gradle"
        sh label: '', script: "${gradle} clean build assemble"
    }
    stage('Build Docker Image'){
        sh "docker build -t sharadprsn/sample-app:${BUILD_NUMBER} ."
    }


}