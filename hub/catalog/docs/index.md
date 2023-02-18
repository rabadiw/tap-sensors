# SPRING SENSORS

To deploy this demo app you need to have VMware Tanzu Application Platform with dev, light or full profile installed. For installation instructions, please see the platform documentation. You also need to have prepared the "defult" namespace as described in the "Set Up Developer Namespaces to Use Installed Packages" section of the documentation.

This application acts as a consumer of sensor data which the application stores in an in-memory database and displays on a dashboard.

Spring Cloud Stream, a framework built on top of Spring Boot and Spring Integration, is used as a flexible messaging abstraction. Spring Cloud Stream supports a variety of binder implementations. In this case, we are using the one for RabbitMQ.

So, as a prerequisite to run this application with VMware Tanzu Application Platform, you need a RabbitMQ cluster running in the same Kubernetes namespace (e.g. provisioned via the RabbitMQ Cluster Operator for Kubernetes).
