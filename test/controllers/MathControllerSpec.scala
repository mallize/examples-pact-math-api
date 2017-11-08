package controllers

import com.itv.scalapact.ScalaPactVerify._
import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneServerPerTest

class MathControllerSpec extends PlaySpec with GuiceOneServerPerTest {

  "Verify Consumer Contracts" must {

    "calculate the sum of the provided numbers" in {

      verifyPact
          .withPactSource(loadFromLocal("pacts"))
          .noSetupRequired
          .runVerificationAgainst("localhost", 19001)
    }

  }
}
