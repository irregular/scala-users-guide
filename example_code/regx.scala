println("Enter an empty string at any time to exit.")

var loop = true
while( loop ){
  println( "str> " )

  var str = readLine()
  if( str.length == 0 )
    loop = false
  println( "pat> " )
  var pat = readLine()

  if( pat.length == 0 )
    loop = false
  if ( loop ){
    println(str.replaceAll("("+pat+")", "[$1]"))
  }
}
