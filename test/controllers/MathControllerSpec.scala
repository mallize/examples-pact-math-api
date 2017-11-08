package controllers

import org.scalatest.{BeforeAndAfterAll, FunSpec, Matchers, TestData}
import org.http4s.server.Server
import com.itv.scalapact.ScalaPactVerify._
import org.scalatestplus.play.{OneServerPerTest, PlaySpec}
import org.scalatestplus.play.guice.GuiceOneServerPerTest
import play.api.Application
import play.api.inject.guice.GuiceApplicationBuilder


class MathControllerSpec extends PlaySpec with GuiceOneServerPerTest {

//  override def newAppForTest(testData: TestData): Application = {
//    new GuiceApplicationBuilder()
//  }

  "Verify Consumer Contracts" must {

    "calculate the sum of the provided numbers" in {

      verifyPact
          .withPactSource(loadFromLocal("pacts"))
          .noSetupRequired
          .runVerificationAgainst("localhost", 19001)



    }

  }
}
