package Basic0902;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//ex73 Thread���� ��ư ��Ʈ��)
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
					hello.btn1.setText("ȣ����");

				});

	}
}
public class Javafx_Thread73 extends Application{
	Button btn1 = new Button("�׽�Ʈ1");
	Button btn2 = new Button("�׽�Ʈ2");
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300); // â ũ��
		root.setSpacing(15);
		//-------------------------------------
		// �� ������ ��� �ڵ尡 ��
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent arg0) {
				new Thread() {
					@Override
					public void run() {
						System.out.println(1);
						// Thread �ȿ��� ��Ʈ�� ������ �� ���
						Platform.runLater( 
								() -> {
									btn2.setText("ȣ����");

								});

					}
				}.start();
			}
		});

		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// ConnectThread �� �����ڿ� Hello Ŭ������ �μ��� ����
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
	
		launch(); // launch ���� ���ŷ
		System.out.println("Exit");
	}
}
