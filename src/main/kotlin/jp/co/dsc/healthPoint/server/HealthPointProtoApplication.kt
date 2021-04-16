package jp.co.dsc.healthPoint.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HealthPointProtoApplication

fun main(args: Array<String>) {
	runApplication<HealthPointProtoApplication>(*args)
}
