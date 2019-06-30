FROM sharadprsn/ubuntu-openjre11
RUN mkdir /apps
COPY application/build/libs/application.jar /apps
CMD ["java","-jar","/apps/application.jar"]