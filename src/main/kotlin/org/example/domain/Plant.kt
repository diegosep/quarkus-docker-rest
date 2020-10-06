package org.example.domain

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import javax.persistence.Entity

@Entity
class Plant : PanacheEntity() {
    companion object : PanacheCompanion<Plant, Long> {
        fun findByName(name: String) = find("name", name)
    }

    lateinit var name: String
    lateinit var type: String
}