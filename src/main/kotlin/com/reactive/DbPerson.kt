package com.reactive

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate
import java.util.*

@Table("person")
data class DbPerson(
    @Id val id: UUID,
    val name: String,
    val pictureUrl: String? = null,
    val birthday: LocalDate,
    val gender: String? = null,
    val zipCode: String? = null,
    val countryCode: String
)