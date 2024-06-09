package micronautapp.controllers

import micronautapp.services.MessageService
import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject

@CompileStatic
@Controller("/api/v1")
class MessageController {

    @Inject
    MessageService messageService

    @Get("/message/{id}")
    String message(String id) {
        return messageService.message + " We've got '${id}'"
    }
}
