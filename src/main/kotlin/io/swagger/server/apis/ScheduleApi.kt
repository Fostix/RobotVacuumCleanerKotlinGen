/**
* Robot vacuum cleaner
* No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/package io.swagger.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.authenticate
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.delete
import io.ktor.locations.get
import io.ktor.locations.post
import io.ktor.locations.put
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.route

import io.swagger.server.Paths
import io.swagger.server.infrastructure.ApiPrincipal


import io.swagger.server.models.TaskForRobot

@KtorExperimentalLocationsAPI
fun Route.ScheduleApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()
    post<Paths.createTaskInSchedule> {  _: Paths.createTaskInSchedule ->
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    delete<Paths.createTaskInSchedule1> {  _: Paths.createTaskInSchedule1 ->
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    get<Paths.getScheduleAllRobots> {  _: Paths.getScheduleAllRobots ->
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json"
            val exampleContentString = """{
  "dateTimeFrom" : "dateTimeFrom",
  "task" : "task",
  "cleaningMode" : "DRY_CLEANING",
  "id" : 1,
  "robotId" : 0,
  "roomId" : 6
}"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }        }
    }
    get<Paths.getScheduleByIdRobots> {  _: Paths.getScheduleByIdRobots ->
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json"
            val exampleContentString = """{
  "dateTimeFrom" : "dateTimeFrom",
  "task" : "task",
  "cleaningMode" : "DRY_CLEANING",
  "id" : 1,
  "robotId" : 0,
  "roomId" : 6
}"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }        }
    }
    put<Paths.updateTaskInSchedule> {  _: Paths.updateTaskInSchedule ->
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
}
