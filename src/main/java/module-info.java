module com.app.detexapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires java.sql;
    requires javafx.web;

    opens com.app.detexapp to javafx.fxml;
    exports com.app.detexapp;
}