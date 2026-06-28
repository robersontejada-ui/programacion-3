import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SistemaInventario extends Application {

    @Override
    public void start(Stage stage) {

        Label titulo = new Label("SISTEMA DE INVENTARIO");
        titulo.setStyle("-fx-font-size:22px; -fx-font-weight:bold;");

        HBox encabezado = new HBox(titulo);
        encabezado.setAlignment(Pos.CENTER);
        encabezado.setPadding(new Insets(15));

        Label lblCodigo = new Label("Código del Producto:");
        Label lblNombre = new Label("Nombre del Producto:");
        Label lblCategoria = new Label("Categoría:");
        Label lblPrecio = new Label("Precio:");
        Label lblCantidad = new Label("Cantidad:");
        Label lblProveedor = new Label("Proveedor:");
        Label lblEstado = new Label("Estado:");

        TextField txtCodigo = new TextField();
        TextField txtNombre = new TextField();
        TextField txtCategoria = new TextField();
        TextField txtPrecio = new TextField();
        TextField txtCantidad = new TextField();
        TextField txtProveedor = new TextField();

        ComboBox<String> cmbEstado = new ComboBox<>(
                FXCollections.observableArrayList(
                        "Disponible",
                        "Agotado",
                        "Bajo inventario"));

        cmbEstado.setPromptText("Seleccione");

        CheckBox chkPerecedero = new CheckBox("Producto perecedero");
        CheckBox chkRefrigeracion = new CheckBox("Requiere refrigeración");
        CheckBox chkImportado = new CheckBox("Producto importado");

        VBox opciones = new VBox(8);
        opciones.getChildren().addAll(
                chkPerecedero,
                chkRefrigeracion,
                chkImportado);

        GridPane formulario = new GridPane();
        formulario.setPadding(new Insets(20));
        formulario.setHgap(12);
        formulario.setVgap(12);

        formulario.add(lblCodigo, 0, 0);
        formulario.add(txtCodigo, 1, 0);

        formulario.add(lblNombre, 0, 1);
        formulario.add(txtNombre, 1, 1);

        formulario.add(lblCategoria, 0, 2);
        formulario.add(txtCategoria, 1, 2);

        formulario.add(lblPrecio, 0, 3);
        formulario.add(txtPrecio, 1, 3);

        formulario.add(lblCantidad, 0, 4);
        formulario.add(txtCantidad, 1, 4);

        formulario.add(lblProveedor, 0, 5);
        formulario.add(txtProveedor, 1, 5);

        formulario.add(lblEstado, 0, 6);
        formulario.add(cmbEstado, 1, 6);

        formulario.add(new Label("Opciones:"), 0, 7);
        formulario.add(opciones, 1, 7);

        Button btnGuardar = new Button("Guardar");
        Button btnEditar = new Button("Editar");
        Button btnEliminar = new Button("Eliminar");
        Button btnBuscar = new Button("Buscar");

        btnGuardar.setPrefWidth(100);
        btnEditar.setPrefWidth(100);
        btnEliminar.setPrefWidth(100);
        btnBuscar.setPrefWidth(100);

        HBox botones = new HBox(15);
        botones.setAlignment(Pos.CENTER);
        botones.getChildren().addAll(
                btnGuardar,
                btnEditar,
                btnEliminar,
                btnBuscar);

        TableView<String> tabla = new TableView<>();

        TableColumn<String, String> colCodigo = new TableColumn<>("Código");

        TableColumn<String, String> colProducto = new TableColumn<>("Producto");

        TableColumn<String, String> colCategoria = new TableColumn<>("Categoría");

        TableColumn<String, String> colPrecio = new TableColumn<>("Precio");

        TableColumn<String, String> colCantidad = new TableColumn<>("Cantidad");

        TableColumn<String, String> colEstado = new TableColumn<>("Estado");

        tabla.getColumns().addAll(
                colCodigo,
                colProducto,
                colCategoria,
                colPrecio,
                colCantidad,
                colEstado);

        tabla.setPrefHeight(250);

        VBox centro = new VBox(20);
        centro.setPadding(new Insets(15));
        centro.getChildren().addAll(
                formulario,
                botones,
                tabla);

        BorderPane root = new BorderPane();
        root.setTop(encabezado);
        root.setCenter(centro);

        Scene scene = new Scene(root, 900, 650);

        stage.setTitle("Sistema de Inventario");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
