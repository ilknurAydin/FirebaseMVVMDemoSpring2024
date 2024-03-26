module aydin.firebasedemospring2024 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires firebase.admin;
    requires com.google.auth;
    requires com.google.auth.oauth2;
    requires google.cloud.firestore;
    requires google.cloud.core;
    requires com.google.api.apicommon;



    opens aydin.firebasedemospring2024 to javafx.fxml;

    exports aydin.firebasedemospring2024.viewmodel;
    opens aydin.firebasedemospring2024.viewmodel to javafx.fxml;
    exports aydin.firebasedemospring2024.view;
    opens aydin.firebasedemospring2024.view to javafx.fxml;
    exports aydin.firebasedemospring2024.model;
    opens aydin.firebasedemospring2024.model to javafx.fxml;
}