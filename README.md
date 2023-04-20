# TAP Sensors Demo App

An application to demonstrate the capabilities of [VMware Tanzu Application Platform](https://tanzu.vmware.com/application-platform).

This application consists of two services:
- Sensor service(s), which periodically publishes events with sensor data
- Hub service, which consumes sensors' events and stores data in its database; also comes with a web dashboard

Features:
- [Spring Cloud Stream](https://spring.io/projects/spring-cloud-stream), a framework built on top of Spring Boot
  and Spring Integration, is used as a flexible messaging abstraction. Spring Cloud Stream supports a variety of binder
  implementations. In this case, we are using the one for RabbitMQ.
- Service Bindings - binding an application workload to a backing service such as a RabbitMQ is one of the most
  important use cases within the context of the VMware Tanzu Application Platform. This use case is made possible
  by the [Service Binding Specification](https://github.com/servicebinding/spec) for Kubernetes. With the service
  binding that is defined in the workload.yml (found under config folder in the respective app), the credentials that
  are required for the connection to the RabbitMQ cluster or PostgreSQL are magically injected into the container
  and the Spring Boot application.
- VMware Aria Operations for Applications (a.k.a. Tanzu Observability, a.k.a. Wavefront) - monitoring a running
  application is one of the most important Day-2 operations concern. A Spring Boot provides seamless integrates with
  Wavefront and publishes application metrics and allows for tracing requests across a distributed system including
  services such as RabbitMQ and PostgreSQL.

![image](overview.png)


## Prerequisites

- Access to an instance of VMware Tanzu Application Platform (`dev`, `light` or `full`)
- A namespace
- [Postgres Operator](https://docs.vmware.com/en/VMware-SQL-with-Postgres-for-Kubernetes/2.0/vmware-postgres-k8s/GUID-install-operator.html) package installed on TAP
- [Rabbit Cluster Operator](https://www.rabbitmq.com/kubernetes/operator/install-operator.html) package installed on TAP
- Privileges of:
  - platform operator, to create ClusterInstanceClass and ClusterRole k8s resources
  - app operator, to create RabbitmqCluster, Postgres and ResourceClaim k8s resources

### Service Operator - Make services available
To run this application with VMware Tanzu Application Platform, you need a RabbitMQ cluster running in the same
Kubernetes namespace (e.g. provisioned via the [RabbitMQ Cluster Operator for Kubernetes](https://www.rabbitmq.com/kubernetes/operator/operator-overview.html)).

You also need an instance of PostgreSQL database running in the same Kubernetes namespace
(e.g. provisioned via the [VMware Postgres Operator](https://docs.vmware.com/en/VMware-SQL-with-Postgres-for-Kubernetes/2.0/vmware-postgres-k8s/GUID-index.html)).

#### RabbitMQ Cluster

To make services available for an app operator to claim, the service operator needs to run the following commands:
```shell
kubectl apply -f config/service-operator/rabbit-claims-rbac.yml
kubectl apply -f config/service-operator/rabbit-cluster-instance-class.yml
kubectl apply -f config/service-operator/sensors-rabbit.yml
```

#### PostgreSQL

To make services available for an app operator to claim, the service operator needs to run the following commands:
```shell
kubectl apply -f config/service-operator/postgres-cluster-instance-class.yml
kubectl apply -f config/service-operator/postgres-claims-rbac.yml
kubectl apply -f config/service-operator/sensors-db.yml
```

### App Operator

#### RabbitMQ Cluster

To claim RabbitMQ service:
```shell
kubectl apply -f config/app-operator/sensors-rabbit-claim.yml
```

#### PostgreSQL

To claim Postgres database:
```shell
kubectl apply -f config/app-operator/sensors-db-claim.yml
```

## Deploying application/services

### Sensor service
To deploy the sensor service on VMware Tanzu Application Platform, execute the following command:
```shell
tanzu apps workload apply -f sensor/config/workload.yml
```

### Hub service
To deploy the hub service on VMware Tanzu Application Platform, execute the following command:
```shell
tanzu apps workload apply -f hub/config/workload.yml
```

You can access the application's UI using the URL shown by running the following command (provided you have DNS configured for Cloud Native Runtimes):

```shell
tanzu app workload get tap-sensors-hub
```
