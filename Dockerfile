# Updated Dockerfile for IGRPWEB
# MAINTAINER: Paulo Fernandes, paulo.e.fernandes@nosi.cv

### RUN TOMCAT TO DEPLOY WAR FILE
FROM tomcat:8-jre8 

RUN curl -SL https://repo.maven.apache.org/maven2/org/apache/tomee/apache-tomee/7.1.0/apache-tomee-7.1.0-plus.tar.gz -o tomee.tar.gz \
        && tar -xvf tomee.tar.gz --strip-components=1 \
        && rm bin/*.bat \
        && rm tomee.tar.gz*

EXPOSE 8080 

ADD tomcat-users.xml /usr/local/tomcat/conf/ 

ADD context.xml /usr/local/tomcat/webapps/manager/META-INF/ 

ADD /IGRP-Template/target/*.war /usr/local/tomcat/webapps/

CMD ["catalina.sh", "run"]

