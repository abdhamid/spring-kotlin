package abdhamid.api.kotlin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("hello")
    fun helloWorld() : String {
        return "hello world!"
    }

    @GetMapping("addNumber")
    fun addNum(
        @RequestParam(defaultValue = "0") num1: Int,
        @RequestParam(defaultValue = "0") num2: Int
    ): Int {
        return num1 + num2
    }

}