package Basic0902;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//ex71 �ؽ�Ʈ �ʵ�, �ؽ�Ʈ �����)
public class Javafx_text71 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300); // â ũ��
		root.setSpacing(15);
		//-------------------------------------
		// �� ������ ��� �ڵ尡 ��
		Button btn1 = new Button("�׽�Ʈ1");
		//Button btn2 = new Button("�׽�Ʈ2");
		
		// �������̽�
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("ȣ����");
			}
		});
		
		TextArea textArea = new TextArea();
		textArea.setDisable(true); // ��ư ��Ȱ��ȭ
		

		// �ؽ�Ʈ �ʵ�
		TextField textField = new TextField();
		textField.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			// enter Ű�Է¿� �̺�Ʈ �ߵ�
			public void handle(ActionEvent arg0) {
				System.out.println("�ڳ���");
				// �ؽ�Ʈ �ʵ忡 ���� �ؽ�Ʈ�� s�� ����
				String s = textField.getText();
				// �ؽ�Ʈ �ʵ忡 ���� �ؽ�Ʈ�� �ؽ�Ʈ ���� ���
				textArea.appendText(s + "\n"); // run later ������ȿ��� ��Ʈ�� ����x
				// �ؽ�Ʈ �ʵ� Ŭ����
				textField.setText("");
			}
		});
		
		root.getChildren().addAll(btn1, textArea, textField);
	
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
