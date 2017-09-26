package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{AbstractController, ControllerComponents}

import scala.util.Try

@Singleton
class MathController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def sum(maybeNumbers: Option[String] = None) = Action {
    maybeNumbers match {
      case Some(numbers) =>

        Try(Ok(s"sum: ${numbers.split(",").map(_.toDouble).sum}"))
          .getOrElse(BadRequest("Bad request. Example Usage http://host/sum?numbers=1,2,1,3"))

      case None => BadRequest("No numbers sent to sum")
    }

  }

}