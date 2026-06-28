import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        Label titulo = new Label("REGISTRO DE VISITANTES");
        titulo.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");

        HBox encabezado = new HBox(titulo);
        encabezado.setAlignment(Pos.CENTER);
        encabezado.setPadding(new Insets(15));

        Label lblNombre = new Label("Nombre Completo:");
        TextField txtNombre = new TextField();

        Label lblCedula = new Label("Cédula:");
        TextField txtCedula = new TextField();

        Label lblTelefono = new Label("Teléfono:");
        TextField txtTelefono = new TextField();

        Label lblMotivo = new Label("Motivo de Visita:");
        TextField txtMotivo = new TextField();

        Label lblPersona = new Label("Persona a Visitar:");
        TextField txtPersona = new TextField();

        Label lblFecha = new Label("Fecha:");
        TextField txtFecha = new TextField();

        Label lblTipo = new Label("Tipo de Visitante:");

        ComboBox<String> cmbTipo = new ComboBox<>(FXCollections.observableArrayList(
                "Estudiante",
                "Padre/Madre",
                "Suplidor",
                "Invitado"));

        cmbTipo.setPromptText("Seleccione");

        Label lblDocumento = new Label("Documento Entregado:");

        RadioButton rbCedula = new RadioButton("Cédula");
        RadioButton rbPasaporte = new RadioButton("Pasaporte");
        RadioButton rbCarnet = new RadioButton("Carnet");

        ToggleGroup grupo = new ToggleGroup();
        rbCedula.setToggleGroup(grupo);
        rbPasaporte.setToggleGroup(grupo);
        rbCarnet.setToggleGroup(grupo);

        HBox documentos = new HBox(15, rbCedula, rbPasaporte, rbCarnet);

        GridPane formulario = new GridPane();
        formulario.setPadding(new Insets(20));
        formulario.setHgap(10);
        formulario.setVgap(10);

        formulario.add(lblNombre, 0, 0);
        formulario.add(txtNombre, 1, 0);

        formulario.add(lblCedula, 0, 1);
        formulario.add(txtCedula, 1, 1);

        formulario.add(lblTelefono, 0, 2);
        formulario.add(txtTelefono, 1, 2);

        formulario.add(lblMotivo, 0, 3);
        formulario.add(txtMotivo, 1, 3);

        formulario.add(lblPersona, 0, 4);
        formulario.add(txtPersona, 1, 4);

        formulario.add(lblFecha, 0, 5);
        formulario.add(txtFecha, 1, 5);

        formulario.add(lblTipo, 0, 6);
        formulario.add(cmbTipo, 1, 6);

        formulario.add(lblDocumento, 0, 7);
        formulario.add(documentos, 1, 7);

        Button btnRegistrar = new Button("Registrar");
        Button btnLimpiar = new Button("Limpiar");
        Button btnCancelar = new Button("Cancelar");

        btnRegistrar.setPrefWidth(100);
        btnLimpiar.setPrefWidth(100);
        btnCancelar.setPrefWidth(100);

        HBox botones = new HBox(20, btnRegistrar, btnLimpiar, btnCancelar);
        botones.setAlignment(Pos.CENTER);

        TableView<String> tabla = new TableView<>();

        TableColumn<String, String> colNombre = new TableColumn<>("Nombre");
        TableColumn<String, String> colCedula = new TableColumn<>("Cédula");
        TableColumn<String, String> colTelefono = new TableColumn<>("Teléfono");
        TableColumn<String, String> colMotivo = new TableColumn<>("Motivo");
        TableColumn<String, String> colPersona = new TableColumn<>("Persona");
        TableColumn<String, String> colTipo = new TableColumn<>("Tipo");

        tabla.getColumns().addAll(
                colNombre,
                colCedula,
                colTelefono,
                colMotivo,
                colPersona,
                colTipo);

        tabla.setPrefHeight(250);

        VBox centro = new VBox(20);
        centro.setPadding(new Insets(15));
        centro.getChildren().addAll(formulario, botones, tabla);

        BorderPane root = new BorderPane();
        root.setTop(encabezado);
        root.setCenter(centro);

        Scene scene = new Scene(root, 900, 650);

        stage.setTitle("Registro de Visitantes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}