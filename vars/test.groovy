def call() {
  def y = ["The", "best", "way", "to", "learn", "is", "to"]
  println y
  y.add("teach")
  println y.contains("is")
  println y.get(1)
  println y.pop()
}
