package dev.killercavin.tacocloud.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.Instant

@Entity
data class TacoOrder(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
    @field:NotBlank(message = "Name can't be blank") var deliveryName: String,
    @field:NotBlank(message = "Delivery street can't be blank") var deliveryStreet: String,
    @field:NotBlank(message = "Delivery city can't be blank") var deliveryCity: String,
    @field:NotBlank(message = "Delivery state can't be blank") var deliveryState: String,
    @field:NotBlank(message = "Delivery zip code can't be blank") var deliveryZip: String,
    @field:NotBlank(message = "Credit card number can't be blank") var ccNumber: String,
    @field:NotBlank(message = "Credit card expiration can't be blank") var ccExpiration: String,
    @field:NotBlank(message = "Credit card CVV can't be blank") var ccCVV: String,
    @field:Size(min = 1, message = "At least 1 taco MUST be added to create an order*") @OneToMany(cascade = [CascadeType.ALL], mappedBy = "taco") var tacos: MutableList<Taco>,
    @CreationTimestamp val createdAt: Instant? = null,
    @UpdateTimestamp var updatedAt: Instant? = null
) {
    fun addTaco(taco: Taco) = tacos.add(taco)
}
