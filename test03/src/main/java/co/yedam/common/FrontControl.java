package co.yedam.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class FrontControl extends HttpServlet{
	
		Map<String, Control> map;
		
		public FrontControl(){
			map = new HashMap<>();
		}
		
		@Override
		public void init(ServletConfig config) throws ServletException {
			
			//map ~~~~
			
		}
		
}
