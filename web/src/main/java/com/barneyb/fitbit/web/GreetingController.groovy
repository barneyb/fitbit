package com.barneyb.fitbit.web
import com.barneyb.fitbit.model.Greeting
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
/**
 *
 *
 * @author barneyb
 */
@RestController
class GreetingController {

    @RequestMapping(value = "/", produces = "application/json")
    Greeting greet(
        @RequestParam(defaultValue = "World") String name
    ) {
        new Greeting(body: "Hello, $name!")
    }

}
