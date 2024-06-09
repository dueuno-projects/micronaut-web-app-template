package micronautapp.services

import micronautapp.config.ConfigApplication
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Slf4j
@Singleton
@CompileStatic
class MessageService {

    @Inject
    ConfigApplication configApplication

    String getMessage() {
        return configApplication.message.text
    }

}
