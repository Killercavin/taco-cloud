package dev.killercavin.tacocloud.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.Instant

@Entity
data class Ingredient(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) val id: Long? = null,
    @field:NotBlank(message = "Name can't be blank") var name: String,
    @Enumerated(EnumType.STRING) var type: Type,
    @CreationTimestamp val createdAt: Instant? = null,
    @UpdateTimestamp var updatedAt: Instant? = null
)
