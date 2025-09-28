package dev.killercavin.tacocloud

data class TacoOrder(
    val deliveryName: String,
    val deliveryStreet: String,
    val deliveryCity: String,
    val deliveryState: String,
    val deliveryZip: String,
    val ccNumber: String,
    val ccExpiration: String,
    val ccCVV: String,
    val tacos: MutableList<Taco>
) {
    fun addTaco(taco: Taco) = tacos.add(taco)
}
