package progect05;

public class SmartPhone extends TelPhone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("通过语音打电话！");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("通过语音发短信！");
	}
	
	public void playGame(){
		System.out.println("这是能打游戏的！");
	}

}
