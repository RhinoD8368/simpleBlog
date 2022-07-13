package home.proto.simpleBlog;

import org.springframework.stereotype.Service;

@Service("homeService")
public class HomeServiceImpl implements HomeService{

	@Override
	public void getbiz() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[impl] getBiz");
	}

	@Override
	public void getbiz2() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("[impl] getBiz2");
	}

}
