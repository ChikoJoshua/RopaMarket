package com.example.ecomarket.utils

import java.text.NumberFormat
import java.util.Locale

object PriceFormatter {

    fun clp(price: Int): String {
        val format = NumberFormat.getCurrencyInstance(Locale("es", "CL"))
        return format.format(price)
    }
}
