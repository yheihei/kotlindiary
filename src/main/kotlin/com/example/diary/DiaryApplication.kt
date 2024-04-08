package com.example.diary

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class DiaryApplication

fun main(args: Array<String>) {
	runApplication<DiaryApplication>(*args)
}

@Controller
class HelloController {
    @GetMapping("/demo")
    fun index(model: Model): String {
				model.addAttribute("message", "Hello World! Yheiiiiiiiiii")
				return "index"
    }
}

