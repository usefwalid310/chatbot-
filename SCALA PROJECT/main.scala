def parseInput(input: String): List[String] = {
  input.toLowerCase.trim.split("\\s+").toList
}

def handleInput(input: String): String = {
  val inputwords = parseInput(input)
  inputwords match {
    case "hello" | "hi" | "hey" =>
      println("Hello! How can I help you today?")
      handleInput(input)
    case "goodbye" | "bye" => "Goodbye! Have a great day."
    case _ => generateResponse(input)
  }
}

def greetUser(Input : String): String = {
  println("Hello! I am the Catfish GameDev ChatBot Assistant, how may I help you?")
  val input = scala.io.StdIn.readLine()
  handleInput(Input)
}
