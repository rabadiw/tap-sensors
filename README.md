# TAP Sensors Demo App

An application to demonstrate the capabilities of [VMware Tanzu Application Platform](https://tanzu.vmware.com/application-platform).

This application consists of two services:
- sensor service, which periodically publishes events with sensor data
- hub service, which consumes sensors' events and stores data in its database; also comes with a web dashboard

Features:
- [Spring Cloud Stream](https://spring.io/projects/spring-cloud-stream), a framework built on top of Spring Boot
  and Spring Integration, is used as a flexible messaging abstraction. Spring Cloud Stream supports a variety of binder
  implementations. In this case, we are using the one for RabbitMQ.
- Service Bindings - binding an application workload to a backing service such as a RabbitMQ is one of the most
  important use cases within the context of the VMware Tanzu Application Platform. This use case is made possible
  by the [Service Binding Specification](https://github.com/servicebinding/spec) for Kubernetes. With the service binding
  that is defined in the [workload.yml](config/workload.yml), the credentials that are required for the connection
  to the RabbitMQ cluster or PostgreSQL are magically injected into the container and the Spring Boot application.
- VMware Aria Operations for Applications (a.k.a. Tanzu Observability, a.k.a. Wavefront) - monitoring a running 
  application is one of the most important Day-2 operations concern. A Spring Boot provides seamless integrates with 
  Wavefront and publishes application metrics and allows for tracing requests across a distributed system including 
  services such as RabbitMQ and PostgreSQL. 

![image](overview.png)


## Prerequisites

- Access to an instance of VMware Tanzu Application Platform (`dev`, `light` or `full`)
- A namespace
- Postgres Operator package installed on TAP
- Rabbit Cluster Operator package installed on TAP
- Privileges of:
  - platform operator, to create ClusterInstanceClass and ClusterRole k8s resources
  - app operator, to create RabbitmqCluster, Postgres and ResourceClaim k8s resources

### Platform Operator - Make services available
To make services available for app operator to create and claim, the platform operator needs to run the following commands:
```bash
kubectl apply -f platform-operator/rabbit-cluster-instance-class.yml
kubectl apply -f platform-operator/postgres-cluster-instance-class.yml
```

Also, the following RBACs need to be applied:
```bash
kubectl apply -f platform-operator/rabbit-claims-rbac.yml
kubectl apply -f platform-operator/postgres-claims-rbac.yml
```

### RabbitMQ Cluster
To run this application with VMware Tanzu Application Platform, you need a RabbitMQ cluster running in the same 
Kubernetes namespace (e.g. provisioned via the [RabbitMQ Cluster Operator for Kubernetes](https://www.rabbitmq.com/kubernetes/operator/operator-overview.html)).

An app operator needs to run the following command: 
```bash
kubectl apply -f app-operator/sensors-rabbit.yml
```

To claim the service, run:
```bash
kubectl apply -f app-operator/sensors-rabbit-claim.yml
```

### PostgreSQL
To run this application with VMware Tanzu Application Platform, you need an instance of PostgreSQL database running 
in the same Kubernetes namespace (e.g. provisioned via the [RabbitMQ Cluster Operator for Kubernetes](https://www.rabbitmq.com/kubernetes/operator/operator-overview.html)).

An app operator needs to run the following command:
```bash
kubectl apply -f app-operator/sensors-db.yml
```

To claim the service, run:
```bash
kubectl apply -f app-operator/sensors-db-claim.yml
```

## Deploying services

### Sensor service
To deploy the sensor service on VMware Tanzu Application Platform, execute the following command:
```bash
tanzu apps workload apply -f sensor/config/workload.yml
```

### Hub service
To deploy the hub service on VMware Tanzu Application Platform, execute the following command:
```bash
tanzu apps workload apply -f hub/config/workload.yml
```

You can access the application's UI using the URL shown by running the following command (provided you have DNS configured for Cloud Native Runtimes):

```bash
tanzu app workload get tap-sensors-hub
```
