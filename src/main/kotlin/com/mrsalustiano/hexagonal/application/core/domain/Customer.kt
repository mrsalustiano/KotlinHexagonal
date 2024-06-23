package com.mrsalustiano.hexagonal.application.core.domain



data class Customer(
    val id: String? =null,
    val name: String,
    var address: Address? = null,
    val cpf: String,
    val isValidCPF: Boolean = false




)
