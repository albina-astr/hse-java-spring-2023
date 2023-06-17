# Use a base Java image
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /github-actions

# Copy the compiled Java application to the container
COPY src ./src

# Set the entry point for the container
ENTRYPOINT ["java", "/github-actions/src/main/java/org/example/Main.java"]