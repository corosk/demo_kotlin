package com.example.demo.controller

import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.*

@RestController
class MyController {
    @ApiOperation(value = "doc header...", notes = "detailed doc...")
    @RequestMapping(value = "/double", method = arrayOf(RequestMethod.GET))
    fun doubleValue(number: Int): Int {
        return 2 * number
    }

    @RequestMapping(value = "/triple", method = arrayOf(RequestMethod.GET))
    fun tripleValue(number: Int): Int {
        return 3 * number
    }
}
