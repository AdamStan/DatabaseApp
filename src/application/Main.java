package application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@SuppressWarnings("unused")
	private static Session session;
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			primaryStage.setTitle("PortfolioApp");
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("view/MainWindow.fxml"));
	        root = (BorderPane) loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void connect_with_database(){
		SessionFactory factory = HibernateUtil.configureSessionFactory();
        session = factory.openSession();
	}
	public static void main(String[] args) {
		//connect_with_database();
		launch(args);
	}
}
