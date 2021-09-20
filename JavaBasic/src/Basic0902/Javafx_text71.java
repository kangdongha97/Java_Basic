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

//ex71 텍스트 필드, 텍스트 에어리어)
public class Javafx_text71 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300); // 창 크기
		root.setSpacing(15);
		//-------------------------------------
		// 이 영역에 모든 코드가 들어감
		Button btn1 = new Button("테스트1");
		//Button btn2 = new Button("테스트2");
		
		// 인터페이스
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("호랑이");
			}
		});
		
		TextArea textArea = new TextArea();
		textArea.setDisable(true); // 버튼 비활성화
		

		// 텍스트 필드
		TextField textField = new TextField();
		textField.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			// enter 키입력에 이벤트 발동
			public void handle(ActionEvent arg0) {
				System.out.println("코끼리");
				// 텍스트 필드에 적힌 텍스트를 s에 저장
				String s = textField.getText();
				// 텍스트 필드에 적힌 텍스트를 텍스트 에어리어에 출력
				textArea.appendText(s + "\n"); // run later 스레드안에서 컨트롤 변경x
				// 텍스트 필드 클리어
				textField.setText("");
			}
		});
		
		root.getChildren().addAll(btn1, textArea, textField);
	
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
