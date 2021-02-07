package com.reactive

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.onEach
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/people")
class ReactiveController(private val r2dbcPanelistRepository: R2dbcPersonRepository) {

    @GetMapping("/{id}")
    suspend fun getById(@PathVariable id: String) = r2dbcPanelistRepository.findById(UUID.fromString(id))

    @GetMapping("/count")
    suspend fun count() = r2dbcPanelistRepository.count()

    @GetMapping(produces = [MediaType.APPLICATION_NDJSON_VALUE])
    fun getAll() = r2dbcPanelistRepository.findAll().onEach {
        delay(100) // delay deliver in order to show each block of data arriving to destination
        println("Sent ${it.id}")
    }
}