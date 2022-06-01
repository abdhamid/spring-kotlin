package abdhamid.api.kotlin.repository

import abdhamid.api.kotlin.model.Person
import org.springframework.data.jpa.repository.JpaRepository

public interface PersonRepository : JpaRepository<Person, Int>{
}