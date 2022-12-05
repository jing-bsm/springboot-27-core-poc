# POC 

```

-Dspring.profiles.active=qal -Ddebug=true -Dspring.cloud.config.username=config-server-user -Dspring.cloud.config.password=secret

```


JAVA_OPTS=-Dspring.profiles.active=qal -DAPPLICATION_NAME=hierarchy-graph-maker -DKAFKA_ADDRESS=dev-kafka-cxsuite.foresee.com:9092 -DKAFKA_TRACE_LOGGING_TOPIC=qal-core-platform-logging -Dcom.sun.management.jmxremote=true -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.port=10101 -Dplatform-security-redis.hostName=auth-tokens-qa.lbpwvt.ng.0001.use1.cache.amazonaws.com -Dplatform-security-redis.port=6379 -Deureka.client.eurekaServerDNSName=qa.aws.foreseeresults.com -Deureka.client.healthcheck.enabled=true -DMETRICS_TOPIC=qal-core-platform-metrics -DHYSTRIX_STREAM_TOPIC=qal-core-platform-circuit-breaker -DPLATFORM_CONFIG_SERVER_URI=http://dev-config-server.foresee.com/platform-config-server -DHYSTRIX_STREAM_ZK_NODES=dev-zookeeper-cxsuite1.foresee.com,dev-zookeeper-cxsuite2.foresee.com,dev-zookeeper-cxsuite3.foresee.com -Dlogging.config=classpath:log4j2-aws.xml -Dspring.cloud.config.username=config-server-user -Dspring.cloud.config.password=secret -Deureka.instance.lease-renewal-interval-in-seconds=30 -Deureka.instance.lease-expiration-duration-in-seconds=90 -DAsyncLoggerConfig.RingBufferSize=1024 -Dlog4j2.formatMsgNoLookups=true -Dspring.jndi.ignore=true
VAULT_ROLE_ID=c95ba689-e397-0200-6edd-6f3826a0fa7c;VAULT_SECRET_ID=08c5e486-c1d9-7720-707d-475f41f89eea;VAULT_URI=http://dev-vault.aws.foreseeresults.com:8200 
