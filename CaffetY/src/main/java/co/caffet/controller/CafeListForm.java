
package co.caffet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.caffet.common.Control;
import co.caffet.service.CafeService;
import co.caffet.service.CafeServiceMybatis;
import co.caffet.vo.CafeVO;

public class CafeListForm implements Control {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
<<<<<<< HEAD
		
		CafeService cafeList = new CafeServiceMybatis();
		List<CafeVO> list = cafeList.cafeList();
=======
		String all = "all";
		CafeService cafeList = new CafeServiceMybatis();
		List<CafeVO> list = cafeList.cafeList(all);
>>>>>>> branch 'main' of https://github.com/hosubbi/midproject.git
		
		request.setAttribute("list", list);
		
		return "cafe/cafeList.tiles";
	}

}
