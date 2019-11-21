FROM openjdk:8
COPY ./migrations /migrations
WORKDIR /migrations
ENTRYPOINT ["./manage_migrations.sh", "production"]
