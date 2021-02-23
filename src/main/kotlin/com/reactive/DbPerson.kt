package com.reactive

import org.springframework.data.annotation.Id
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate
import java.util.*
import java.util.UUID

@Table("person")
data class DbPerson (
    @JvmField @Id var id: UUID?,
    val name: String,
    val pictureUrl: String? = null,
    val birthday: LocalDate,
    val gender: String? = null,
    val postalCode: String? = null,
    val countryCode: String
) : Persistable<UUID> {

    override fun getId() = id

    // r2dbc does not work in this version as jdbc. If you provide the value of the field marked
    // as @Id automatically it's treated as an UPDATE
    override fun isNew(): Boolean {
        val result = id == null
        if (result) id = UUID.randomUUID()
        return result
    }
}