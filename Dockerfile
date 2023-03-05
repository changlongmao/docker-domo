FROM adoptopenjdk/openjdk8:ubi
WORKDIR /home/app
COPY   target/*.jar  ./
RUN rm -f *-sources.jar

env JAVA_HOME /opt/java/openjdk
env PATH $PATH:$JAVA_HOME/bin
ENV JAVA_OPTS="-Xms500m -Xmx500m  -XX:+ExitOnOutOfMemoryError -Dlog4j2.formatMsgNoLookups=true"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS  -jar *.jar" ]