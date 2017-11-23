package com.abhi.service

import com.twitter.finagle.Http
import com.twitter.util.Await
import com.abhi.endpoint.HelloEndpoint
import io.finch._
import io.finch.circe._
import io.circe.generic.auto._

/**
  * Created by ASrivastava on 11/23/17.
  */
object HelloService extends App {
   Await.ready{
      val api = HelloEndpoint.all
      Http.server.serve(s":8080", api.toServiceAs[Application.Json])
   }
}
