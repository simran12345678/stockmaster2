FROM java:8
EXPOSE 8761
ADD /target/stockserver.jar stockserver.jar
ENTRYPOINT ["java","-jar","stockserver.jar"]