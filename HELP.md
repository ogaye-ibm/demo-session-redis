# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.3/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.3/gradle-plugin/reference/html/#build-image)
* [Spring Session](https://docs.spring.io/spring-session/reference/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/index.html#web)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/index.html#actuator)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

```text

Download .jar file of Memcached session manager. As the example we used memcached-session-manager-1.6.2 .
Also download memcached-session-manager-tc7-1.6.2.jar, spymemcached-2.8.4.jar, msm-kryo-serializer-1.6.1.jar, kryo-1.03.jar, reflectasm-0.9.jar, kryo-serializers.jar, joda-time.jar and minlog-1.2.jar.

4. Choose server folder and open context.xml file.
5. Update context.xml so that it contains the Manager configuration for the memcached-session-manager, like this:
<Context path="" docBase="ROOT">
 <Manager className="de.javakaffee.web.msm.MemcachedBackupSessionManager"
   memcachedNodes="n1:host:11211"
   requestUriIgnorePattern=".*\.(png|gif|jpg|css|js)$"
   sessionBackupAsync="false"
   sessionBackupTimeout="100"
   copyCollectionsForSerialization="false"
   transcoderFactoryClass="de.javakaffee.web.msm.serializer.kryo.KryoTranscoderFactory"
   customConverter="de.javakaffee.web.msm.serializer.kryo.JodaDateTimeRegistration"
   />
</Context>
```


