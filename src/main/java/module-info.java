module com.example.delete {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires org.kordamp.ikonli.fontawesome5;
    requires com.jfoenix;

    opens com.example.delete to javafx.fxml;
    exports com.example.delete;
}