/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxborderpanelayoutex;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author mhcrnl
 */
public class JavaFXBorderPaneLayoutEx extends Application {
    
    TextArea ta;
    
    @Override
    public void start(Stage primaryStage) {
        
        //BorderPane borderPane = new BorderPane();
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 800, 650);
        HBox hbox = addHBox();
        VBox vbox = addVBox();
        ta = new TextArea();
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        
        menuBar.getMenus().addAll(menuFile);
        root.setTop(menuBar);
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               System.out.println("Hello World!");
            }
        });
        
        Button btnClose = new Button("Close");
        btnClose.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("Fereastra va fi inchisa!");
                //root.hide();
            }
        });
        
        
        root.setBottom(hbox);
        root.setLeft(vbox);
        root.setCenter(ta);
        
       
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private HBox addHBox() {
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: #336699;");

        Button buttonCurrent = new Button("Current");
        buttonCurrent.setOnAction(new EventHandler<ActionEvent>(){
           @Override
           public void handle(ActionEvent event){
               System.out.println("Fereastra va fi inchisa!");
               //primaryStage.close();
           }
        });
        buttonCurrent.setPrefSize(100, 20);

        Button buttonProjected = new Button("Projected");
        buttonProjected.setPrefSize(100, 20);
        hbox.getChildren().addAll(buttonCurrent, buttonProjected);

        return hbox;
    }

    private VBox addVBox() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(8);
        
        Text title = new Text("Insert data.");
        title.setFont(Font.font("Arrial", FontWeight.BOLD,14));
        vbox.getChildren().add(title);
        
        Label modelMasina = new Label("Modelul Masinii:");
        vbox.getChildren().add(modelMasina);
        
        TextField tfMasina = new TextField();
        vbox.getChildren().add(tfMasina);
        
        Label anulFabricatiei = new Label("Anul Fabricatiei: ");
        vbox.getChildren().add(anulFabricatiei);
        
        TextField tfAnFab = new TextField();
        vbox.getChildren().add(tfAnFab);
        
        Label km = new Label("Kilometri:");
        vbox.getChildren().add(km);
        
        TextField tfKm = new TextField();
        vbox.getChildren().add(tfKm);
        
        Button btnAdd = new Button("Adauga");
        btnAdd.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Tip masina: "+tfMasina.getText()+
                        ", an: "+tfAnFab.getText()+".");
                ta.setText("red "+tfMasina.getText());
            }
            
        });
        vbox.getChildren().add(btnAdd);
        
        return vbox;
    }
    
}
