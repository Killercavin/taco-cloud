package dev.killercavin.tacocloud.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.Instant

@Entity
data class Taco(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
    @field:NotBlank @field:Size(min = 5, message = "Name MUST be at least 5 characters long") var name: String,
    @field:NotBlank @field:Size(min = 1, message = "At least 1 ingredient MUST be added to create a taco*") @ManyToMany var ingredients: MutableList<Ingredient>,
    @CreationTimestamp val createdAt: Instant? = null,
    @UpdateTimestamp var updatedAt: Instant? = null
) {
    fun addIngredient(ingredient: Ingredient) = ingredients.add(ingredient)
}