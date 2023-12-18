### Configure kubectl

- Start Developer Sandbox instance
- Navigate to `3: Access Developer Sandbox from your local machine`
- Copy `.kube/set-context.sh` to current directory's `set-context.sh`
- In a terminal window run `sh set-context.sh`

### Check connectivity to cluster
```bash
╰─❯ tanzu services class list                                                                                                                                                                                                                                        ─╯
  NAME                  DESCRIPTION                                               
  kafka-unmanaged       Kafka by Bitnami                                          
  mongodb-unmanaged     MongoDB by Bitnami                                        
  mysql-unmanaged       MySQL by Bitnami                                          
  postgresql-unmanaged  PostgreSQL by Bitnami                                     
  rabbitmq-unmanaged    RabbitMQ by Bitnami                                       
  redis-unmanaged       Redis by Bitnami       
```
