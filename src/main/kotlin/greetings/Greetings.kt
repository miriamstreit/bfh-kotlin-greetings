@file:JvmName("Greetings")

package greetings

val map: HashMap<String, String> = hashMapOf(
        "berlin" to "Guten Tag!",
        "bern" to "Guten Tag!",
        "london" to "Hello!",
        "boston" to "Hello!",
        "paris" to "Bonjour!",
        "milano" to "Ciao!",
        "madrid" to "Hola!",
)

fun getGreeting(city: String): String? {
    if (map.containsKey(city.toLowerCase())) {
        return map.get(city.toLowerCase())
    }
   return "City not found!"
}

fun main() {
    println("Enter a city: ")
    val city : String = readLine()!!
    println(getGreeting(city))
}
