package com.hcl.list;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class NameListController {
	@RequestMapping("/names")
	public ModelAndView nameDemo(){
	List<String> lstnames =new ArrayList<String>();
	lstnames.add("sri");
	lstnames.add("priya");
	lstnames.add("hari");
	lstnames.add("subi");
	lstnames.add("sasi");
	lstnames.add("senthil");
	return new ModelAndView("ShowPage","Lists",lstnames);
	}
}
