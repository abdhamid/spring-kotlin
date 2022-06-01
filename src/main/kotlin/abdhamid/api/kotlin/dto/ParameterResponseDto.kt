package abdhamid.api.kotlin.dto

import abdhamid.api.kotlin.model.ParameterEntity

data class ParameterResponseDto(
    val id: Int?,
    val key: String,
    val value: Int,
    val description: String
) {
    companion object {
        fun toDto(entity: ParameterEntity): ParameterResponseDto {
            return ParameterResponseDto(
                entity.id,
                entity.key,
                entity.value,
                entity.description
            )
        }
    }
}