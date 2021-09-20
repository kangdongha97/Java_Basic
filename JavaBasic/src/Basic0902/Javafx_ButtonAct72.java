package Basic0902;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//ex72 버튼 삭제, 비활성화)
public class Javafx_ButtonAct72 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300); // 창 크기
		root.setSpacing(15);
		//-------------------------------------
		// 이 영역에 모든 코드가 들어감
		Button btn1 = new Button("테스트1");
		Button btn2 = new Button("테스트2");
		
		// 인터페이스
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				btn2.setText("호랑이");
			}
		});

		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				//btn1.setVisible(false); // 버튼 삭제
				btn1.setDisable(true); // 버튼 비활성화
			}
		});
		
		root.getChildren().addAll(btn1, btn2);
	
		//-------------------------------------
		Scene scene = new Scene(root);
		arg0.setScene(scene); // 위의 설정값들을 적용
		arg0.setTitle("Server"); // 제목
		arg0.show(); // 창 띄움
		
	}
	
	public static void main(String[] args) {
	
		launch(); // launch 에서 블로킹
		System.out.println("Exit");
	}
}