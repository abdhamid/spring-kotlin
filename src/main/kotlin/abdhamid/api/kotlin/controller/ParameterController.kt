package abdhamid.api.kotlin.controller

import abdhamid.api.kotlin.model.ParameterEntity
import abdhamid.api.kotlin.dto.CreateParameterRequestDto
import abdhamid.api.kotlin.dto.ParameterResponseDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.tags.Param
import abdhamid.api.kotlin.service.ParameterService

@RestController
@RequestMapping("/api/v1/settings")
class ParameterController (val parameterService: ParameterService) {

    @GetMapping
    fun getParameters(): List<ParameterResponseDto> {
        return parameterService.getParameters().map {
            ParameterResponseDto.toDto(it)
        }
    }

    @GetMapping("{id}")
    fun getParameterById(@PathVariable("id") id: Int): ParameterEntity {
        return parameterService.getParameterById(id)
    }

    @PostMapping
    fun addParameter(@RequestBody requestDto: CreateParameterRequestDto): ParameterEntity {
        return parameterService.createParameter(requestDto)
    }

    @PutMapping("{id}")
    fun updateParameter(
        @PathVariable("id") id: Int,
        @RequestBody requestDto: CreateParameterRequestDto
    ): ParameterEntity {
        return parameterService.updateParameter(id, requestDto)
    }

    @DeleteMapping("{id}")
    fun deleteParameter(@PathVariable("id") id: Int): ParameterEntity {
        return parameterService.deleteParameter(id)
    }


}