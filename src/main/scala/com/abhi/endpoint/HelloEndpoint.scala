package com.abhi.endpoint


/**
  * Created by ASrivastava on 11/23/17.
  */

import com.abhi.models._
import io.circe.generic.auto._
import io.finch._
import io.finch.circe.jacksonSerializer._

object HelloEndpoint {
   val all = sayHello :+: sayBye

   def sayHello = post("hello") :: jsonBody[HelloRequest] mapOutput { case HelloRequest(name, surname) =>
         Ok(s"Hello $name $surname")
   }
   def sayBye = post("bye") :: jsonBody[HelloRequest] mapOutput { case HelloRequest(name, surname) =>
         Ok(s"Bye $name $surname")
   }
}


