FROM openjdk:17
COPY "./target/Motos-1.jar" "app.jar"
EXPOSE 8108
ENTRYPOINT [ "java", "-jar", "app.jar" ]