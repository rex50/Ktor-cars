package com.rex50.routes

import com.rex50.data.model.Car
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_URL = "http://<local-ip>:8080"
private val cars = listOf(
     Car("Audi e-tron Sportback", "$BASE_URL/cars/e_tron_sb.webp", 5, "SUV"),
     Car("Audi Q3 Sportback", "$BASE_URL/cars/q3_sb.webp", 5, "SUV"),
     Car("Audi Q8", "$BASE_URL/cars/q8.webp", 5, "SUV"),
     Car("Audi e-tron", "$BASE_URL/cars/e_tron.webp", 5, "SUV"),
)

fun Route.randomCar() {
     get("/randomCar") {
          call.respond(
               HttpStatusCode.OK,
               cars.random()
          )
     }
}