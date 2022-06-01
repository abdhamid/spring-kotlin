package abdhamid.api.kotlin.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Person(
    @Id
    val id: Int,
    val name: String,
    val job: String
)
