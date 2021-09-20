package Basic0902;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//ex73 Thread에서 버튼 컨트롤)
class ConnectThread extends Thread{
	

	Javafx_Thread73 hello;
	ConnectThread(Javafx_Thread73 hello){
		this.hello = hello;
	}
	@Override
	public void run() {
		System.out.println(2);
		Platform.runLater( 
				() -> {
					hello.btn1.setText("호랑이");

				});

	}
}
public class Javafx_Thread73 extends Application{
	Button btn1 = new Button("테스트1");
	Button btn2 = new Button("테스트2");
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300); // 창 크기
		root.setSpacing(15);
		//-------------------------------------
		// 이 영역에 모든 코드가 들어감
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent arg0) {
				new Thread() {
					@Override
					public void run() {
						System.out.println(1);
						// Thread 안에서 컨트롤 조작할 때 방식
						Platform.runLater( 
								() -> {
									btn2.setText("호랑이");

								});

					}
				}.start();
			}
		});

		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// ConnectThread 의 생성자에 Hello 클래스를 인수로 전달
				new ConnectThread(Javafx_Thread73.this).start();
			}
		});
		
		root.getChildren().addAll(btn1, btn2);
	
		//-------------------------------------
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.setTitle("Server");
		arg0.show();
		
	}
	
	public static void main(String[] args) {
	
		launch(); // launch 에서 블로킹
		System.out.println("Exit");
	}
}
