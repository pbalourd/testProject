import org.hyperskill.hstest.dynamic.DynamicTest
import org.hyperskill.hstest.stage.StageTest
import org.hyperskill.hstest.testcase.CheckResult
import org.hyperskill.hstest.testing.TestedProgram

class testproject : StageTest<Any>() {

    @DynamicTest
    fun printRanksSuitsCardsTest(): CheckResult {
//        Initiate a TestedProgram and provide the first input
        var main = TestedProgram()
        var outputString = main.start().trim()
        outputString = main.execute("test").trim()

//        Without stopping the program, either by itself or forced, a new TestProgram()
//        is initiated
        main = TestedProgram()
        outputString = main.start().trim()
        outputString = main.execute("test").trim()

        return CheckResult.correct()
    }
}