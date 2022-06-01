package abdhamid.api.kotlin.repository

import abdhamid.api.kotlin.model.ParameterEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ParameterRepository: JpaRepository<ParameterEntity, Int> {

}
