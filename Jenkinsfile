node('master'){
    def gradle = tool name: 'gradle-5.3.1', type: 'gradle'

    stage('SCM'){
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-credential', url: 'https://github.com/sharadprsn/spring-boot-java-11.git']]])
    }
    stage('build'){
        sh label: '', script: 'gradle clean build'
    }


}