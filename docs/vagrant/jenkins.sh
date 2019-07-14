sudo apt-get update && sudo apt-get install docker.io -y && sudo systemctl start docker && sudo systemctl enable docker
sudo apt-get install openjdk-11-jdk-headless -y
cd /tmp &&  wget https://services.gradle.org/distributions/gradle-5.5-bin.zip
sudo apt-get install unzip -y && sudo unzip -d /opt/gradle /tmp/gradle-*.zip