package com.github.mlrv.skel

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {
  def run(args: List[String]) =
    SkelServer.stream[IO].compile.drain.as(ExitCode.Success)
}