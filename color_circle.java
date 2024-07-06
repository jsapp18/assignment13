import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class color_circle extends Application{
	@Override 
	public void start(Stage the_stage){
		StackPane stack_pane = new StackPane();
		Circle circle = new Circle(65);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		stack_pane.getChildren().add(circle);
		stack_pane.setOnMousePressed(e ->{circle.setFill(Color.BLACK);});
		stack_pane.setOnMouseReleased(e ->{
			circle.setFill(Color.WHITE);
			circle.setStroke(Color.BLACK);
		});
		Scene scene = new Scene(stack_pane, 120, 120);
		the_stage.setTitle("Black and White Circle");
		the_stage.setScene(scene);
		the_stage.show(); 

	}
}