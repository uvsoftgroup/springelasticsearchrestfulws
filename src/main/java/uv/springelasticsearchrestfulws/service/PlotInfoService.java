/**
 * 
 */
package uv.springelasticsearchrestfulws.service;

import java.util.List;

import uv.springelasticsearchrestfulws.model.PlotInfo;

/**
 * @author A.Riaydh
 *
 */
public interface PlotInfoService {
	public List<PlotInfo> getAllPlotInfo();
    public PlotInfo getPlotInfo(Long id);
    public PlotInfo savePlotInfo(PlotInfo plotInfo);
}
