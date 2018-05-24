/**
 * 
 */
package uv.springelasticsearchrestfulws.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import uv.springelasticsearchrestfulws.model.UserRole;

/**
 * @author A.Riaydh
 *
 */
public interface UserRoleRepository extends ElasticsearchRepository<UserRole, Long> {

}
