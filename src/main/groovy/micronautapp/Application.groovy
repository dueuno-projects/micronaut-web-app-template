package micronautapp

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.info.License

@CompileStatic
@OpenAPIDefinition(
        info = @Info(
                version = '${api.version}',
                title = '${api.title}',
                description = '${api.description}'
        )
)
class Application {

    static void main(String[] args) {
        Micronaut.run(Application, args)
    }
}
