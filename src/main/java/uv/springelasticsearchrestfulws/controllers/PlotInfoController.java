/**
 * 
 */
package uv.springelasticsearchrestfulws.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uv.springelasticsearchrestfulws.model.PlotInfo;
import uv.springelasticsearchrestfulws.service.PlotInfoServiceImpl;

/**
 * @author A.Riaydh
 *
 */
@RestController
@RequestMapping("/plotinfo")
public class PlotInfoController {

private PlotInfoServiceImpl plotInfoServiceImpl;

@Autowired
public PlotInfoController(PlotInfoServiceImpl plotInfoServiceImpl) {
	super();
	this.plotInfoServiceImpl = plotInfoServiceImpl;
}

@RequestMapping(method = RequestMethod.GET)
public List<PlotInfo> getAllPlotInfo() {
    return plotInfoServiceImpl.getAllPlotInfo();
}

@RequestMapping(value="/{id}", method = RequestMethod.GET)
public PlotInfo getAllPlotInfo(@PathVariable Long id) {
    return plotInfoServiceImpl.getPlotInfo(id);
}
@RequestMapping(value = "/add", method = RequestMethod.POST)    
public PlotInfo savePlotInfo(@RequestBody PlotInfo plotInfo) {        
    return plotInfoServiceImpl.savePlotInfo(plotInfo);
}

}
