package dev.killercavin.tacocloud.repository;

import dev.killercavin.tacocloud.entity.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
