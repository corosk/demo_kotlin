package com.example.demo.controller

import com.example.demo.body.Person
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = "hello")
class HelloController {

    @RequestMapping(value = "/person", method = arrayOf(RequestMethod.POST))
    fun getPerson(@RequestBody person: Person): Person {
        return Person(person.name, person.age)
    }

}
