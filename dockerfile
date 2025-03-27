# Usar a imagem oficial do OpenJDK 21
FROM openjdk:21-jdk

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo JAR para dentro do container
COPY target/startzinho-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta padrão da aplicação Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
