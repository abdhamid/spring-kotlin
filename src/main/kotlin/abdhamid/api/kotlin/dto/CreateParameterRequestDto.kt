package abdhamid.api.kotlin.dto

data class CreateParameterRequestDto(
    val key: String,
    val value: Int,
    val description: String
)