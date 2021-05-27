package io.todak.study.kopringstudy

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    @GetMapping
    fun index(): ResponseEntity<String> {
        return ResponseEntity.status(HttpStatus.OK)
            .body("Hello World");
    }

}