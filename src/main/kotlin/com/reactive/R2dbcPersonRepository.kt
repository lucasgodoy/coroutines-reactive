package com.reactive

import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface R2dbcPersonRepository : CoroutineCrudRepository<DbPerson, UUID> {
}