import scala.io.Source
import scala.collection.mutable.ListBuffer

def generateResponse(question: String): String = {
  val userFile = Source.fromFile("User.csv")
  val userData = userFile.getLines().map(_.split(",").map(_.trim)).toList
  userFile.close()

  val dataFile = Source.fromFile("Data.csv")
  val data = dataFile.getLines().map(_.split(",").map(_.trim)).toList
  dataFile.close()

  userData.find(_(0) == question) match {
    case Some(row) => s"As you asked before, you can ${row(1)}"
    case None =>
      val words = parseInput(question)
      data.find(row => words.exists(word => row(0).contains(word))) match {
        case Some(row) =>
          data.find(row => words.exists(word => row(1).contains(word))) match {
            case Some(row) => s"${row(3)}: ${row(2)}"
            case None => "Sorry, I couldn't find a matching response."
          }
        case None => ""
      }
  }
}





