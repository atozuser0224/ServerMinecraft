package gang.atoz.serverminecraft

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServerMinecraftApplication

fun main(args: Array<String>) {
    runApplication<ServerMinecraftApplication>(*args)
}
