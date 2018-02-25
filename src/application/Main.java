package application;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import application.resources.*;

public class Main extends Application {
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
	public static void add_faculties_and_people(){
		Transaction tx = session.beginTransaction();
		ArrayList<Faculty> faculties = new ArrayList<Faculty>();
		faculties.add(new Faculty("EEIA"));
		faculties.add(new Faculty("MECHANICZNY"));
		faculties.add(new Faculty("CHEMICZNY"));
		faculties.add(new Faculty("FTIMS"));
		faculties.add(new Faculty("BAIS"));
		faculties.add(new Faculty("WIPOS"));
		faculties.add(new Faculty("BINOZ"));
		for(Faculty f : faculties){
			session.save(f);
		}
		tx.commit();
		System.out.println("Faculties was added");
	}
	public static void main(String[] args) {
		connect_with_database();
		add_faculties_and_people();
		launch(args);
	}
}
