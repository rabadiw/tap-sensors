# Accelerator Log

## Options
```json
{
  "gitBranch" : "main",
  "gitUrl" : "https://github.com/sample-accelerators/spring-sensors-rabbit.git",
  "projectName" : "spring-sensors-rabbit",
  "publisherRepository" : "index.docker.io/springdeveloper/spring-sensors-publisher",
  "title" : "Tanzu Sensor Database"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(Combo, UniquePath)
┃ ┏ engine.transformations[0] (Combo)
┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ engine.transformations[0].merge (Chain)
┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┏ engine.transformations[0].merge.transformations[0] (Merge)
┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo, Combo, Combo)
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Exclude)
┃ ┃ ┃ ┃ engine.transformations[0].merge.transformations[0].sources[0].<combo> (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[0].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug README.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug demo/publisher-deployment.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug demo/publisher-image.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug mvnw matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug rabbit/cluster.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug rabbit/rbac.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorData.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorRepository.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsApplication.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsDataSink.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsUiController.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/tanzu.css matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/index.html matched [**] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/tanzu/demo/SensorsApplicationTests.java matched [**] -> included
┃ ┃ ┃ ┃ ┗ Debug tap/workload.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[0].<combo>.transformations[1] (Exclude)
┃ ┃ ┃ ┃ ┃  Info Will exclude [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml]
┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug demo/publisher-deployment.yaml matched [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug demo/publisher-image.yaml matched [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug rabbit/cluster.yaml didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug rabbit/rbac.yaml didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorData.java didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorRepository.java didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsApplication.java didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsDataSink.java didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsUiController.java didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml matched [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/tanzu.css didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/index.html didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/tanzu/demo/SensorsApplicationTests.java didn't match [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> included
┃ ┃ ┃ ┗ ┗ Debug tap/workload.yaml matched [tap/workload.yaml, demo/**, src/main/resources/application.yaml, catalog/*.yaml] -> excluded
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ engine.transformations[0].merge.transformations[0].sources[1].<combo> (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[1].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃  Info Will include [tap/workload.yaml]
┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug demo/publisher-deployment.yaml didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug demo/publisher-image.yaml didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug rabbit/cluster.yaml didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug rabbit/rbac.yaml didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorData.java didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorRepository.java didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsApplication.java didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsDataSink.java didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsUiController.java didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/tanzu.css didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/index.html didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/tanzu/demo/SensorsApplicationTests.java didn't match [tap/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┗ Debug tap/workload.yaml matched [tap/workload.yaml] -> included
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[1].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText, RewritePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[1].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [https://github.com/tanzu-end-to-end/spring-sensors.git->https://github.com/s...(truncated), main->main]
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[1].<combo>.transformations[1].transformations[1] (RewritePath)
┃ ┃ ┃ ┗ ┗ ┗ Debug Path 'tap/workload.yaml' matched '^(?<folder>.*/)?(?<filename>([^/]+?|)(?=(?<ext>\.[^/.]*)?)$)' with groups {ext=.yaml, folder=tap/, filename=workload.yaml, g0=tap/workload.yaml, g1=tap/, g2=workload.yaml, g3=workload.yaml, g4=.yaml} and was rewritten to 'config/workload.yaml'
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ engine.transformations[0].merge.transformations[0].sources[2].<combo> (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[2].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃  Info Will include [src/main/resources/application.yaml]
┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug demo/publisher-deployment.yaml didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug demo/publisher-image.yaml didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug rabbit/cluster.yaml didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug rabbit/rbac.yaml didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorData.java didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorRepository.java didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsApplication.java didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsDataSink.java didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsUiController.java didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml matched [src/main/resources/application.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/tanzu.css didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/index.html didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/tanzu/demo/SensorsApplicationTests.java didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┗ Debug tap/workload.yaml didn't match [src/main/resources/application.yaml] -> excluded
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[2].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[2].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [Sensor Database->Tanzu Sensor Databas...(truncated)]
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[3] (Combo)
┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ engine.transformations[0].merge.transformations[0].sources[3].<combo> (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[3].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃  Info Will include [demo/publisher-deployment.yaml, demo/publisher-image.yaml]
┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug demo/publisher-deployment.yaml matched [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug demo/publisher-image.yaml matched [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug rabbit/cluster.yaml didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug rabbit/rbac.yaml didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorData.java didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorRepository.java didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsApplication.java didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsDataSink.java didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsUiController.java didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/tanzu.css didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/index.html didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/tanzu/demo/SensorsApplicationTests.java didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┗ Debug tap/workload.yaml didn't match [demo/publisher-deployment.yaml, demo/publisher-image.yaml] -> excluded
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[3].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[3].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [dev.local/spring-sensors-publisher->index.docker.io/spri...(truncated)]
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[4] (Combo)
┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ engine.transformations[0].merge.transformations[0].sources[4].<combo> (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[4].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃  Info Will include [catalog/*.yaml]
┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug demo/publisher-deployment.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug demo/publisher-image.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug rabbit/cluster.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug rabbit/rbac.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorData.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorRepository.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsApplication.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsDataSink.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/SensorsUiController.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/tanzu.css didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/index.html didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/tanzu/demo/SensorsApplicationTests.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┗ Debug tap/workload.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[4].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[4].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┗ ┗ ┗ ┗  Info Will replace [spring-sensors->spring-sensors-rabbi...(truncated)]
┃ ┗ ╺ engine.transformations[0].merge.transformations[1] (UniquePath)
┗ ╺ engine.transformations[1] (UniquePath)
```
