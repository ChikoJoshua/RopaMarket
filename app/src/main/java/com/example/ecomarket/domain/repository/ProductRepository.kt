package com.example.ecomarket.domain.repository

import com.example.ecomarket.R
import com.example.ecomarket.data.models.Product

class ProductRepository {

    fun getProducts(): List<Product> {
        return listOf(
            Product(1, "Aceite de Oliva Extra Virgen", 2.990, R.drawable.boxer1),
            Product(2, "Café Tostado y Molido Orgánico", 7.500, R.drawable.boxer2),

        )
    }
}