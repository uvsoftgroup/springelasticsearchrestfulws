/**
 * 
 */
package uv.springelasticsearchrestfulws.configuration;

import java.net.InetAddress;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @author A.Riaydh
 *
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = "uv.springelasticsearchrestfulws.repository")
@ComponentScan(basePackages = {"uv.springelasticsearchrestfulws.service"})
public class EsConfig {

	@Autowired
    private Environment environment;
    @Bean
    public Client client() throws Exception {

        Settings esSettings = Settings.settingsBuilder()
                .put("cluster.name", environment.getProperty("spring.data.elasticsearch.cluster-name"))
                .build();

        return TransportClient.builder()
                .settings(esSettings)
                .build()
                .addTransportAddress(
				  new InetSocketTransportAddress(InetAddress.getByName(environment.getProperty("elasticsearch.host")),
						  Integer.valueOf(environment.getProperty("elasticsearch.port"))));
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() throws Exception {
        return new ElasticsearchTemplate(client());
    }

    //Embedded Elasticsearch Server
    /*@Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(nodeBuilder().local(true).node().client());
    }*/

}
