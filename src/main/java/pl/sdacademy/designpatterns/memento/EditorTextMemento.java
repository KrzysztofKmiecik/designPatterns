package pl.sdacademy.designpatterns.memento;

public class EditorTextMemento {
    //tyle samo pol

    private String value;

    public EditorTextMemento(final EditorText editorText) {
        //kopiowanie wszystkich pol
        //oryginalny obiekt do memento
        this.value = editorText.getValue();
        //this.index=editor.getindex()
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }
}
