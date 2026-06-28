import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PerfilEstudiante extends Application {

    @Override
    public void start(Stage stage) {

        // Título
        Label titulo = new Label("PERFIL DEL ESTUDIANTE");
        titulo.setStyle("-fx-font-size:22px; -fx-font-weight:bold;");

        HBox encabezado = new HBox(titulo);
        encabezado.setAlignment(Pos.CENTER);
        encabezado.setPadding(new Insets(15));

        // Foto simulada
        Rectangle foto = new Rectangle(120, 150);
        foto.setStyle("-fx-fill: lightgray; -fx-stroke: black;");

        Label lblFoto = new Label("Foto");

        VBox panelFoto = new VBox(10);
        panelFoto.setAlignment(Pos.CENTER);
        panelFoto.getChildren().addAll(foto, lblFoto);

        // Campos
        Label lblMatricula = new Label("Matrícula:");
        TextField txtMatricula = new TextField();

        Label lblNombre = new Label("Nombre:");
        TextField txtNombre = new TextField();

        Label lblCarrera = new Label("Carrera:");
        TextField txtCarrera = new TextField();

        Label lblCorreo = new Label("Correo:");
        TextField txtCorreo = new TextField();

        Label lblTelefono = new Label("Teléfono:");
        TextField txtTelefono = new TextField();

        Label lblDireccion = new Label("Dirección:");
        TextField txtDireccion = new TextField();

        Label lblSemestre = new Label("Semestre:");

        ComboBox<String> cmbSemestre = new ComboBox<>(
                FXCollections.observableArrayList(
                        "1",
                        "2",
                        "3",
                        "4",
                        "5",
                        "6",
                        "7",
                        "8"));

        cmbSemestre.setPromptText("Seleccione");

        GridPane formulario = new GridPane();
        formulario.setHgap(10);
        formulario.setVgap(10);

        formulario.add(lblMatricula, 0, 0);
        formulario.add(txtMatricula, 1, 0);

        formulario.add(lblNombre, 0, 1);
        formulario.add(txtNombre, 1, 1);

        formulario.add(lblCarrera, 0, 2);
        formulario.add(txtCarrera, 1, 2);

        formulario.add(lblCorreo, 0, 3);
        formulario.add(txtCorreo, 1, 3);

        formulario.add(lblTelefono, 0, 4);
        formulario.add(txtTelefono, 1, 4);

        formulario.add(lblDireccion, 0, 5);
        formulario.add(txtDireccion, 1, 5);

        formulario.add(lblSemestre, 0, 6);
        formulario.add(cmbSemestre, 1, 6);

        Label lblMaterias = new Label("Materias Inscritas");

        ListView<String> listaMaterias = new ListView<>();

        listaMaterias.getItems().addAll(
                "Programación II",
                "Base de Datos",
                "Redes",
                "Ingeniería de Software",
                "Matemática Discreta");

        listaMaterias.setPrefHeight(150);

        Label lblObservaciones = new Label("Observaciones");

        TextArea txtObservaciones = new TextArea();
        txtObservaciones.setPrefRowCount(5);

        Button btnGuardar = new Button("Guardar");
        Button btnActualizar = new Button("Actualizar");
        Button btnImprimir = new Button("Imprimir");

        btnGuardar.setPrefWidth(100);
        btnActualizar.setPrefWidth(100);
        btnImprimir.setPrefWidth(100);

        HBox botones = new HBox(15);
        botones.setAlignment(Pos.CENTER);
        botones.getChildren().addAll(
                btnGuardar,
                btnActualizar,
                btnImprimir);
        VBox informacion = new VBox(15);
        informacion.getChildren().addAll(
                formulario,
                lblMaterias,
                listaMaterias,
                lblObservaciones,
                txtObservaciones,
                botones);

        HBox contenido = new HBox(30);
        contenido.setPadding(new Insets(20));
        contenido.getChildren().addAll(panelFoto, informacion);

        BorderPane root = new BorderPane();
        root.setTop(encabezado);
        root.setCenter(contenido);

        Scene scene = new Scene(root, 900, 650);

        stage.setTitle("Perfil de Estudiante");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
