package Basic0901;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//ex69 javafx ��ư)
public class Javafx_Button69 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300); // â ũ��
		root.setSpacing(15);
		//-------------------------------------
		// �� ������ ��� �ڵ尡 ��
		// ��� 1
		//Button btn1 = new Button("�׽�Ʈ1");
		//root.getChildren().add(btn1); // ��ư
		
		//Button btn2 = new Button("�׽�Ʈ2");
		//root.getChildren().add(btn2);
		
		// ��� 2
		Button btn1 = new Button("�׽�Ʈ1");
		
		Button btn2 = new Button("�׽�Ʈ2");
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
