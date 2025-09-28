package dev.killercavin.tacocloud

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.SessionAttributes

@RestController
@RequestMapping("/design")
@SessionAttributes("tacoOrder")
class DesignTacoController {
    private val logger: Logger = LoggerFactory.getLogger(DesignTacoController::class.java)

    @GetMapping @ResponseStatus(HttpStatus.OK)
    fun showDesign(): String {
        logger.info("Running the taco design controller...")
        return "Taco Design"
    }
}