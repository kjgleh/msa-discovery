package me.kjgleh.msadiscovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class MsaDiscoveryApplication

fun main(args: Array<String>) {
    runApplication<MsaDiscoveryApplication>(*args)
}
