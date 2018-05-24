/**
 * 
 */
package uv.springelasticsearchrestfulws.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uv.springelasticsearchrestfulws.model.PlotInfo;
import uv.springelasticsearchrestfulws.repository.PlotInfoRepository;
import uv.springelasticsearchrestfulws.utility.LoggerUtility;

/**
 * @author A.Riaydh
 *
 */
@Service
public class PlotInfoServiceImpl implements PlotInfoService {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	LoggerUtility loggerUtility=new LoggerUtility();
	
	private PlotInfoRepository plotInfoRepository;
	

	@Autowired
	public PlotInfoServiceImpl(PlotInfoRepository plotInfoRepository
			) {
		super();
		this.plotInfoRepository = plotInfoRepository;
		
	}

	@Override
	public List<PlotInfo> getAllPlotInfo() {
		List<PlotInfo> list = new ArrayList<PlotInfo>();
		list = (List<PlotInfo>) plotInfoRepository.findAll();
		logger.info(loggerUtility.numberOfRecordFound(list.size()));
		if(list.size()>0 && !list.isEmpty()){
			return list;
		}
		else{
			logger.info(loggerUtility.noOfRecordFound());
			return new ArrayList<PlotInfo>(list);
		}
	}

	@Override
	public PlotInfo getPlotInfo(Long id) {
		boolean check=plotInfoRepository.exists(id);
		PlotInfo ob=new PlotInfo();
		if(check){
			ob=new PlotInfo();
			ob=plotInfoRepository.findOne(id);
			return ob;
		}
		else{
			return new PlotInfo();
		}
		
	}

	@Override
	public PlotInfo savePlotInfo(PlotInfo plotInfo) {
		boolean check=plotInfoRepository.exists(plotInfo.getPlId());
		if(check){
			logger.info(loggerUtility.existId());
			logger.info(loggerUtility.primaryKeyId(plotInfo.getPlId()));
			return new PlotInfo();
		}
		else{
			logger.info(loggerUtility.primaryKeyId(plotInfo.getPlId()));
			return plotInfoRepository.save(plotInfo);
		}
	}
	
	
	

}
