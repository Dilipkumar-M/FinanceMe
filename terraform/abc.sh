

#!/bin/bash
sudo apt update -y && apt upgrade -y

echo "Install Java JDK 8"
sudo apt remove -y java
sudo apt install default-jdk -y

echo "Install Maven"
sudo apt install maven -y

echo "Install git"
sudo apt install -y git

echo "Install Docker engine"
curl -fsSL https://get.docker.com -o get-docker.sh
sudo sh get-docker.sh

#sudo usermod -a -G docker jenkins
#sudo service docker start
#sudo chkconfig docker on

echo "Install Jenkins"
curl -fsSL https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key | sudo tee /usr/share/keyrings/jenkins-keyring.asc > /dev/null
echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc]  https://pkg.jenkins.io/debian-stable binary/ | sudo tee  /etc/apt/sources.list.d/jenkins.list > /dev/null
sudo apt-get update -y
sudo apt-get install fontconfig -y
sudo apt-get install jenkins -y


#sudo usermod -a -G docker jenkins
#sudo chkconfig jenkins on
#sudo systemctl start docker
#sudo systemctl enable docker
#sudo systemctl start jenkins
#sudo systemctl enable jenkins
