import scala.util.control.Breaks._

var words = Array( "foobar", "baz", "quux" )
var secret = words( scala.util.Random.nextInt(3) )

println( "guess? " )

breakable {
  for ( guess <- io.Source.stdin.getLines )
    if( guess == secret ){
      println( "You win!" )
      break
    }else
      println( "Sorry, you lose.!" )

    println( "guess? " )
}

println( s"The work was $secret." )
