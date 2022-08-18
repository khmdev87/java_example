FROM gcr.io/gcp-runtimes/ubuntu_16_0_4:latest

ARG env

# 환경변수 설정
ENV env $env
ENV WORKING_HOME /opt/working/demo
ENV JAR_FILE ROOT.jar
ENV JAVA_HOME /usr/lib/jvm/java-11-oracle

# 심볼릭 링크 생성
RUN rm /bin/sh && ln -s /bin/bash /bin/sh

# Working Home 폴더 생성
RUN set -e \
    && mkdir -m 755 -p ${WORKING_HOME}
    
# Install Dependencies
RUN apt-get update &&
apt-get install -y curl wget unzip tar dos2unix software-properties-common && \
apt-get -y install sudo

# Install_JDK 11
RUN add-apt-repository ppa:openjdk-r/ppa \
    && apt-get update \
    && apt-get install -y openjdk-11-jdk \
    && update-alternatives --config java \
    && ln -s /usr/lib/jvm/java-11-oracle /opt/java

# Copy to the home
COPY ${JAR_FILE} ${WORKING_HOME}/${JAR_FILE}

# Port
EXPOSE 8080
WORKDIR ${WORKING_HOME}

# EXCUTE
ENTRYPOINT java -Dspring.profiles.active=${env} -jar ${WORKING_HOME}/${JAR_FILE}
