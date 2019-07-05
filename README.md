# spring-boot-java-11
modular java 11 application with Spring 5, gradle 5.4 and servlet api 4.

gradle clean build

gradle bootRun


#JENKINS

Jenkins Dockerfile is present in docs/jenkins.

run following command to run a jenkins instance


##For docker jenkins 

sudo docker run --rm --name=jenkins5 -d -p 8080:8080 -p 50000:50000 -v /vagrant/jenkins_home:/var/jenkins_home -v /usr/lib/jvm/java-11-openjdk-amd64:/var/java_home -v /opt/gradle/gradle-5.5:/var/gradle_home -v /var/run/docker.sock:/var/run/docker.sock -v $(which docker):/usr/bin/docker myjenkins:latest
  
## For normal jenkins

java -Duser.home=/var/jenkins_home -jar jenkins.war 

