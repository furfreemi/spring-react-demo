FROM openjdk:8
COPY ./** /opt/migrations/
WORKDIR /opt/migrations
#VOLUME ["/opt/migrations"]
RUN ls -a ./mybatis/bin/
RUN chmod +x ./mybatis/bin/migrate
ENTRYPOINT pwd && ./mybatis/bin/migrate up
