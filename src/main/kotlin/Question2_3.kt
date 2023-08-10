/**
2. assuming a group A contains elements {a, b, c, d, e , a, g, r, f}
   group B contains {ant, bee, elephant, dog, cat}. Create a map that links the two
   groups using their first character

3. after implementing 2 above, add five entries that map five unique characters to
the respective animal name

 */
fun main(){
   val map = mutableMapOf("a" to "ant", "b" to "bee", "c" to "cat", "d" to "dog", "e" to "elephant")
   map.put("h", "hyena")
   map.put("i", "impala")
   map.put("j", "jaguar")
   map.put("k", "kangaroo")
   map.put("l", "lion")
   for (i in map){
      println(i)
   }
}