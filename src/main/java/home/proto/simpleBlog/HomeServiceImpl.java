package home.proto.simpleBlog;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service("homeService")
public class HomeServiceImpl implements HomeService{

	@Override
	public void getbiz() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[impl] getBiz");
	}

	@Override
	public void getbiz2(String test, String[] testArr, HashMap<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[impl] getBiz2 :: " + test);
	}

}
