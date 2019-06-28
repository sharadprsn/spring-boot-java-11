node('master'){
    def gradleHome = tool name: 'gradle5', type: 'gradle'

    stage('SCM'){
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-credential', url: 'https://github.com/sharadprsn/spring-boot-java-11.git']]])
    }
    stage('build'){
        def gradle = "${gradleHome}/bin/gradle"
        sh label: '', script: "${gradle} clean build"
    }


}