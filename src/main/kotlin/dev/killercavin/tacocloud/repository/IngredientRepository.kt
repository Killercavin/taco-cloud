package dev.killercavin.tacocloud.repository

import dev.killercavin.tacocloud.entity.Taco
import org.springframework.data.repository.CrudRepository

interface IngredientRepository: CrudRepository<Taco, Long>