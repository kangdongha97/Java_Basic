package Basic0902;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//ex72 ��ư ����, ��Ȱ��ȭ)
public class Javafx_ButtonAct72 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300); // â ũ��
		root.setSpacing(15);
		//-------------------------------------
		// �� ������ ��� �ڵ尡 ��
		Button btn1 = new Button("�׽�Ʈ1");
		Button btn2 = new Button("�׽�Ʈ2");
		
		// �������̽�
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				btn2.setText("ȣ����");
			}
		});

		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				//btn1.setVisible(false); // ��ư ����
				btn1.setDisable(true); // ��ư ��Ȱ��ȭ
			}
		});
		
		root.getChildren().addAll(btn1, btn2);
	
		//-------------------------------------
		Scene scene = new Scene(root);
		arg0.setScene(scene); // ���� ���������� ����
		arg0.setTitle("Server"); // ����
		arg0.show(); // â ���
		
	}
	
	public static void main(String[] args) {
	
		launch(); // launch ���� ���ŷ
		System.out.println("Exit");
	}
}