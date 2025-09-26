package dev.killercavin.tacocloud

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/tacocloud")
class TacoCloudController{
    @GetMapping("/home") @ResponseStatus(HttpStatus.OK)
    fun tacoCloud(): String {
        return "Taco Cloud"
    }
}