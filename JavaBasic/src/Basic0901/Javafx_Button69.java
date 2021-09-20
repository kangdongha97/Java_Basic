package Basic0901;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//ex69 javafx 버튼)
public class Javafx_Button69 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		VBox root = new VBox();
		root.setPrefSize(400, 300); // 창 크기
		root.setSpacing(15);
		//-------------------------------------
		// 이 영역에 모든 코드가 들어감
		// 방법 1
		//Button btn1 = new Button("테스트1");
		//root.getChildren().add(btn1); // 버튼
		
		//Button btn2 = new Button("테스트2");
		//root.getChildren().add(btn2);
		
		// 방법 2
		Button btn1 = new Button("테스트1");
		
		Button btn2 = new Button("테스트2");
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
