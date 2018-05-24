/**
 * 
 */
package uv.springelasticsearchrestfulws.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import uv.springelasticsearchrestfulws.model.PlotInfo;

/**
 * @author A.Riaydh
 *
 */
public interface PlotInfoRepository extends ElasticsearchRepository<PlotInfo, Long> {

}
