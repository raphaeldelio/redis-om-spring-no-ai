## Redis OM Spring without Spring AI Dependency
### The following property should be set to false (default)
redis.om.spring.ai.enabled=false

### It's not necessary to explicitly exclude dependencies
Since the Spring AI dependencies were marked as optional in Redis OM Spring Maven's POM file, they will not be included in the project's dependencies.

### Checking if dependencies are included
To check if the dependencies are included in the project, run the following command:
```shell
mvn dependency:tree
```

### Another way of checking
Another option is to run the project with `redis.om.spring.ai.enabled set to `true` - Since the dependencies are missing, the application will throw a ClassNotFoundException exception

If you run this project with the `redis.om.spring.ai.enabled` property set to `true`, the application will throw a `ClassNotFoundException` exception.
If you run this project without the `redis.om.spring.ai.enabled` property set, the application will print "Hello, Redis OM Spring!" to the console.

### To enable Spring AI
Uncomment the commented sections in the POM file and change the `redis.om.spring.ai.enabled` property to `true` in the `application.properties` file.