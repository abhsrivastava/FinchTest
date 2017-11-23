package com.abhi.tests.service

import com.abhi.endpoint.HelloEndpoint
import com.abhi.models.HelloRequest
import com.twitter.io.Buf
import io.circe.generic.auto._
import io.circe.syntax._
import io.finch._
import io.finch.circe.jacksonSerializer._
import org.scalatest.{FunSpec, Matchers}

/**
  * Created by ASrivastava on 11/23/17.
  */
class HelloServiceTest extends FunSpec with Matchers {
   describe("should say hello to request") {
      it("let us make a hello request") {
         val json = HelloRequest("foo", "bar").asJson.noSpaces
         HelloEndpoint.sayHello(Input.post("/hello").withBody[Application.Json](Buf.Utf8(json))).awaitValueUnsafe() should equal(Some("Hello foo bar"))
      }
      it("let us make a bye request") {
         val json = HelloRequest("foo", "bar").asJson.noSpaces
         HelloEndpoint.sayBye(Input.post("/bye").withBody[Application.Json](Buf.Utf8(json))).awaitValueUnsafe() should equal(Some("Bye foo bar"))
      }
   }
}
