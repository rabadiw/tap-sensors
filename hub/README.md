# Demo application for VMware Tanzu Application Platform

An application to demonstrate the capabilities of [VMware Tanzu Application Platform](https://tanzu.vmware.com/application-platform).

## Prerequisites

To deploy this demo app you need to have VMware Tanzu Application Platform with `dev`, `light` or `full` profile installed. 
For installation instructions, please see the [platform documentation](https://docs.vmware.com/en/VMware-Tanzu-Application-Platform/index.html). You also need to have prepared the "defult" namespace as described in the "Set Up Developer Namespaces to Use Installed Packages" section of the documentation.

This application acts as a consumer of sensor data which the application stores in an in-memory database and displays on a dashboard.

[Spring Cloud Stream](https://spring.io/projects/spring-cloud-stream), a framework built on top of Spring Boot and Spring Integration, is used as a flexible messaging abstraction. 
Spring Cloud Stream supports a variety of binder implementations. In this case, we are using the one for RabbitMQ.

So, as a prerequisite to run this application with VMware Tanzu Application Platform, you need a RabbitMQ cluster running in the same Kubernetes namespace (e.g. provisioned via the [RabbitMQ Cluster Operator for Kubernetes](https://www.rabbitmq.com/kubernetes/operator/operator-overview.html)).

```yaml
apiVersion: rabbitmq.com/v1beta1
kind: RabbitmqCluster
metadata:
  name: rmq-1
```

To apply this `RabbitmqCluster` run the following command:

```
kubectl apply -f rabbit/cluster.yaml
```

Binding an application workload to a backing service such as a RabbitMQ queue is one of the most important use cases within the context of the VMware Tanzu Application Platform. 
This use case is made possible by the [Service Binding Specification](https://github.com/servicebinding/spec) for Kubernetes.
With the service binding that is defined in the [workload.yaml](config/workload.yaml), the credentials that are required for the connection to the RabbitMQ cluster are magically injected as environment variables into the container.

You do need a `ClusterRole` that allows the "Services Toolkit" component access to bind to the RabbitMQ cluster you just created. Apply the `ClusterRole` definition using:

```
kubectl apply -f rabbit/rbac.yaml
```

## Deploying the application

To deploy this application on VMware Tanzu Application Platform, execute the following command:
```
tanzu apps workload create spring-sensors -f config/workload.yaml
```

You can access the application's UI using the URL shown by running the following command (provided you have DNS configured for Cloud Native Runtimes):

```
tanzu app workload get spring-sensors
```

## Deploying the publisher

The sensor data is generated and sent by [this](https://github.com/tanzu-end-to-end/spring-sensors-sensor) application via asynchronous messaging.

To build this application using the build service apply the an `Image` definition using:

```
kubectl apply -f demo/publisher-image.yaml
```

Check the build pod progress using:

```
kubectl get pod -l=image.kpack.io/image=spring-sensors-publisher
```

Once the init containers finish and the pod status shows `Complete`, you can check the image status using:

```
kubectl get image.kpack.io spring-sensors-publisher
```

That should show `READY` as `True` and the `LATESTIMAGE` populated.

We are now ready to deploy the publisher app using a Kubernetes `Deployment`, run this command:

```
kubectl apply -f demo/publisher-deployment.yaml
```

You can scale up the number of sensors displayed in the demo app by using:

```
kubectl scale deployment/spring-sensors-publisher --replicas=5
```
