#!/bin/bash

echo "--------------- 서버 배포 시작 -----------------"
docker stop spring-git-github || true
docker rm spring-git-github || true
docker pull ${{ steps.login-ecr.outputs.registry }}/spring-git-github/spring-git-github:latest
docker run -d --name spring-git-github -p 8080:8080 ${{ steps.login-ecr.outputs.registry }}/spring-git-github/spring-git-github:latest
echo "--------------- 서버 배포 끝 -----------------"
