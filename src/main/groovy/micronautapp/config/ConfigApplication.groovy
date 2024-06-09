package micronautapp.config

import groovy.transform.CompileStatic
import io.micronaut.context.annotation.ConfigurationBuilder
import io.micronaut.context.annotation.ConfigurationProperties

@CompileStatic
@ConfigurationProperties('application')
class ConfigApplication {

    @ConfigurationBuilder("message")
    ConfigMessage message = new ConfigMessage()

}
