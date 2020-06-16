## Eureka Service Cloud
Simple Eureka service Cloud to orchestrate microservices.

### Docker
The Dockerfile in the main directory can be executed to build a container
that run the microservice.

To see all the containers installed locally type
```docker ps -a```

To build the container go in the Dockerfile directory and type 
```docker build -t ImageName:TagName dockerfile_dir```

to execute a container in local type ```docker run -p 8080:8080 ImageName:TagName```

###Info
Tutorial how to build [here](https://developer.okta.com/blog/2017/06/15/build-microservices-architecture-spring-boot) 