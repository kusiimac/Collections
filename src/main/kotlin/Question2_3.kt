/**
2. assuming a group A contains elements {a, b, c, d, e , a, g, r, f}
   group B contains {ant, bee, elephant, dog, cat}. Create a map that links the two
   groups using their first character

3. after implementing 2 above, add five entries that map five unique characters to
the respective animal name

 */
fun main(){

   val groupA = setOf("a", "b", "c", "d", "e" , "a", "g", "r", "f")
   val groupB = setOf("ant", "bee", "elephant", "dog", "cat")
   val map = mutableMapOf<String, String>()
   for (i in groupA) {
      for(j in groupB) {
         if (i.first() == j.first()) {
            map.put(i, j)
         }
      }
   }
   map.put("h", "hyena")
   map.put("i", "impala")
   map.put("j", "jaguar")
   map.put("k", "kangaroo")
   map.put("l", "lion")
   map.forEach(){
      println(it)
   }
}