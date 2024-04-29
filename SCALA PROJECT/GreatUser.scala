def greetUser(Input : String): String = {
  println("Hello! I am the Catfish GameDev ChatBot Assistant, how may I help you?")
  val input = scala.io.StdIn.readLine()
  handleInput(Input)
}

