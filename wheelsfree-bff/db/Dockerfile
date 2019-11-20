FROM openjdk:8
COPY ./migrations /migrations
WORKDIR /migrations
ENTRYPOINT ["./mybatis/bin/migrate", "up", "--env=prod"]
