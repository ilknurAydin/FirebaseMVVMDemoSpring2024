package aydin.firebasedemospring2024.viewmodel;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DataAccessViewModel {

    private final StringProperty personName = new SimpleStringProperty();
    private final int age=0;
    private final ReadOnlyBooleanWrapper writePossible = new ReadOnlyBooleanWrapper();

    public DataAccessViewModel() {
        writePossible.bind(personName.isNotEmpty());
    }

    public StringProperty personNameProperty() {
        return personName;
    }

    public ReadOnlyBooleanProperty isWritePossibleProperty() {
        return writePossible.getReadOnlyProperty();
    }
}