package uk.co.zac_h.rssmerger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RssMergerApplication

fun main(args: Array<String>) {
	runApplication<RssMergerApplication>(*args)
}
