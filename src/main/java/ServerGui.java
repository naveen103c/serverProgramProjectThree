import java.io.IOException;
import java.util.HashMap;
import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class ServerGui extends Application {

    private TextField t1;
    HashMap<String, Scene> sceneMap;

    @FXML
    private GridPane gridPane = new GridPane(); // creates a grid pane
    char[] displayWord;
    String displayString;
    TextField s1, s2, s3, s4;
    Button b, b1, b2, playBtn, howToPlayBtn, backToMenuBtn;
    GridPane grid;
    HBox buttonBox;
    VBox clientBox;
    Scene serverStartScene, clientMenuScene;
    BorderPane startPane;
    Server serverConnection;
    ListView<String> listItems, listItems2;
    private Image bg; //The image used for the background
    private ImageView bgView;
    private Button[][] arr = new Button[13][2];
    private EventHandler<ActionEvent> myHandler;
    private int portNumber = -1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Server GUI");
        listItems = new ListView<String>();
        t1 = new TextField();
        t1.setText("8080");
        t1.setMaxWidth(150);
        b1 = new Button("Start Server");
        serverStartScene = createServerLoginGui();
        sceneMap = new HashMap<String, Scene>();
        sceneMap.put("server", serverStartScene);

        b1.setOnAction(e -> {
            try {
                portNumber = Integer.parseInt(t1.getText());
                System.out.println(portNumber);
                serverStartScene = createServerGui();
                sceneMap.put("server", serverStartScene);
                primaryStage.setScene(serverStartScene);
            } catch (Exception t) {
                t1.setText("Please Enter A Port Number");
            }

        });

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent t) {
                Platform.exit();
                System.exit(0);
            }
        });

        primaryStage.setScene(serverStartScene);
        primaryStage.show();

    }

    // create server GUI
    public Scene createServerGui() throws IOException {
        serverConnection = new Server(data -> {
            Platform.runLater(() -> {
                listItems.getItems().add(data.toString());
            });
        }, portNumber);
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(70));
        pane.setStyle("-fx-background-color: #daeaee");
        listItems.setStyle("-fx-text-fill: green");
        pane.setCenter(listItems);
        return new Scene(pane, 800, 800);

    }

    public Scene createServerLoginGui() throws IOException {
        BorderPane pane = new BorderPane();
        t1.setStyle("-fx-text-fill: green");
        t1.setFont(Font.font("Verdana", 20));        
        b1.setStyle("-fx-text-fill: black;-fx-font-weight: bold;-fx-background-color: white;)");        
        b1.setFont(Font.font("Verdana", 20));
        bg = new Image("guesstheword.png");
        bgView = new ImageView(bg);
        VBox vb = new VBox(10, bgView, t1, b1);
        vb.setAlignment(Pos.CENTER);       
        pane.setCenter(vb);
        pane.setStyle("-fx-background-color: linear-gradient(#61a2b1, #2A5058)");
        return new Scene(pane, 700, 700);
    }

}
