import scala.xml.{Elem, NodeSeq}


object XmlApp extends App{
//   class could run without create new instance by extend App class
  val person: Elem = <person>
    <firstName>Zhengyang</firstName>
    <lastName>Qiu</lastName>
    <emails>
      <email type="primary">yang@gmail.com</email>
      <email type="secondary">qiu@gmail.com</email>

    </emails>
    <address>
      <street>595 Market Street</street>
      <city>San Francisco</city>
      <zip>94150</zip>
    </address>
    </person>

  val seq: NodeSeq = person \ "firstName"
  println(seq)

  val seq2: NodeSeq = person \\ "email"
  seq2.map(email=>println(seq2))

  val seq3: NodeSeq = person \\"@type"
  print(seq3)

  val seq4 :NodeSeq = person \\"city"
  println(seq)






}

