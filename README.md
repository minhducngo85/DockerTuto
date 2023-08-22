# Docker Tutorial

## Overview
 - The keywords of docker are develop, ship and run. The whole idea of Docker is for developers to develop applications, ship them into containers whcich can then be deployed anywhere.
 - lightweiht and scalable
 - deploy docker container anywhere, on any physical and virtual machines and even on cloud
 
 ## Components of Dockers
 - Docker for Mac - to run docker containers on Mac OS
 - Docker for Linux - to run docker containers on Linux OS
 - Docker for Windows - to run docker containers on Windows OS
 - Docker Engine - to build docker images and create docker containers
 - Docker Hub - this is registry to host various docker images
 - Docker Compose - to degine applications using multiple Docker containers
 
 ## Instation of Docker on Windows
 
 - install docker for Windows: download docker desktop and install it
 - install docker toolbox: Windows 10 Home you must use Docker Toolbox. Windows 10 Pro or Enterprise you can and is recommended running Docker for Windows
 - to test if the docker is installed correctly:
 ```
 docker run --help
 docker run hello-world
 ```
 
 ## Docker Hub
 - this is a registry service on the cloud that allows you to download docker images that are builts by other communities. 
 - we will leatn how to download and use the Jenkins Docker image from Docker hub
 
 ```
 docker pull jenkins/jenkins
 docker run -p 8080:8080 -p 50000:50000 --restart=on-failure jenkins/jenkins
 ```
 
 ## Docker image
 docker images : to list of installed docker images
 docker run centos: download and run docker image if it is not present
 docker rmi ImageID: to remove a docker image. to idetify the image id use the command: docker images
 docker rmi -f ImageID: force to delete image
 
 ## Docker Container
 
Container are instances of Docker images.
Docker un is to run a container.

to run a container in an inactive mode:
```
docker run -it centos /bin/bash
then hit Ctrl+p and you will return to OS Shell.
```

to list of Container:
```
docker ps
docker ps -a
docker history ImageID 
docker history centos
```

to stop a container
```
docker stop ContainerID
```

other command
```
docker rm ContainerID : to delete a container
docker rm 9f215ed0b0d3 : example to delete container
docker stats ContainerID : show stat of a container
docker pause ContainerID : to pause a continer
docker unpause ContainerID: to unpause a container
docker kill ContainerID: to kill the processes in a running container
```
