/**
 * 
 */
package uv.springelasticsearchrestfulws.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


import uv.springelasticsearchrestfulws.model.UserRegistration;

/**
 * @author A.Riaydh
 *
 */
public interface UserRegistrationRepository extends ElasticsearchRepository<UserRegistration, Long> {

}
