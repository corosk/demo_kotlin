package com.example.demo.controller

import com.example.demo.body.Person
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class KotlinController {
    @ApiOperation(value = "doc header...", notes = "detailed doc...")
    @RequestMapping(value = "/kotlin", method = arrayOf(RequestMethod.GET))
    fun kotlinmethod(str: String): Person {
        var s : String = "abc"
        val t : String = "xyz"

        var str = str + s + t

        var num = 0

        for (i in 0 until 100) {
            num += i
        }

        var person = Person()
        person.age = num
        person.name = str
        return person
    }
}