package abdhamid.api.kotlin.service

import abdhamid.api.kotlin.model.ParameterEntity
import abdhamid.api.kotlin.repository.ParameterRepository
import abdhamid.api.kotlin.dto.CreateParameterRequestDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import org.springframework.web.servlet.tags.Param

@Service
class ParameterService (val parameterRepository: ParameterRepository) {
    fun getParameters(): List<ParameterEntity> {
        return parameterRepository.findAll();
    }

    fun getParameterById(id: Int): ParameterEntity {
        return parameterRepository.findById(id).orElseThrow { UsernameNotFoundException("user not found") }
    }

    fun createParameter(parameterRequestDto: CreateParameterRequestDto): ParameterEntity{
        return parameterRepository.save(ParameterEntity(parameterRequestDto))
    }

    fun updateParameter(id: Int, parameterRequestDto: CreateParameterRequestDto): ParameterEntity {
        val parameterEntity: ParameterEntity = getParameterById(id)
        parameterEntity.updateEntity(parameterRequestDto)
        return parameterRepository.save(parameterEntity)
    }

    fun deleteParameter(id: Int): ParameterEntity {
        val parameterEntity: ParameterEntity = getParameterById(id)
        parameterRepository.deleteById(id)
        return parameterEntity
    }
}