package hello;

import org.springframework.stereotype.Service;

@Service
public class Mocked implements IMocked {

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 20;
	}

}
