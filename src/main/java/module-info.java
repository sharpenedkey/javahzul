module com.sharpenedkey.javahzul {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;

    opens com.sharpenedkey.javahzul to javafx.fxml;
    exports com.sharpenedkey.javahzul;
}