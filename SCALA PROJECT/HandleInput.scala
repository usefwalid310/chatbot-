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


