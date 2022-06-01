package abdhamid.api.kotlin

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition
class SpringKotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinApplication>(*args)
}
