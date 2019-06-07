def project = 'sharadprsn/spring-boot-java-11'
def branchApi = new URL("https://api.github.com/repos/${project}/branches")
def branches = new groovy.json.JsonSlurper().parse(branchApi.newReader())
branches.each {
    def branchName = it.name
    def jobName = "${project}-${branchName}".replaceAll('/','-')
    job(jobName) {
        scm {
            git{
                remote {
                    github('sharadprsn/spring-boot-java-11', 'https')
                    credentials('github-credential')
                }

            }
        }
        steps {
            gradle('check')
            gradle {
                tasks('clean')
                tasks('check')
                switches('--info')
            }
        }
    }
}