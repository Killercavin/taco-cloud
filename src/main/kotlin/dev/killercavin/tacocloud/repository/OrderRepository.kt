package dev.killercavin.tacocloud.repository

import dev.killercavin.tacocloud.entity.TacoOrder
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository: JpaRepository<TacoOrder, Long> {
    fun findByDeliveryZip(deliveryZip: String): List<TacoOrder>
}