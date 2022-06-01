package abdhamid.api.kotlin.model

import abdhamid.api.kotlin.dto.CreateParameterRequestDto
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity(name = "parameters")
data class ParameterEntity (
    @Column(name = "_key", unique = true, nullable = false)
    var key: String,

    @Column(name = "param_value")
    var value:Int,

    var description: String,

) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null

    @CreationTimestamp
    lateinit var createdAt: LocalDateTime

    @UpdateTimestamp
    lateinit var updatedAt: LocalDateTime

    constructor(requestDto: CreateParameterRequestDto) : this(
        requestDto.key,
        requestDto.value,
        requestDto.description
    )

    fun updateEntity(requestDto: CreateParameterRequestDto) {
        key = requestDto.key
        value = requestDto.value
        description = requestDto.description
    }
}