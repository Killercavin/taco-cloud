package dev.killercavin.tacocloud.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/tacos")
class TacoCloudController{
    private val logger: Logger = LoggerFactory.getLogger(TacoCloudController::class.java)

    @GetMapping @ResponseStatus(HttpStatus.OK)
    fun tacoCloud(): String {
        logger.info("Running the taco cloud API landing...")
        return "Taco Cloud API"
    }
}