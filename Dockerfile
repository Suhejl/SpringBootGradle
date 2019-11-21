FROM tomcat:9.0.27-jdk11-openjdk
RUN rm -rf /usr/local/tomcat/webapps/*
ADD Gradle_Demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/*
CMD ["catalina.sh", "run"]