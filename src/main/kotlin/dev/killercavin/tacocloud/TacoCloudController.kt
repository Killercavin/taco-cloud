package dev.killercavin.tacocloud

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/tacos")
class TacoCloudController{
    @GetMapping("/home") @ResponseStatus(HttpStatus.OK)
    fun tacoCloud(): String {
        return "Taco Cloud API"
    }
}