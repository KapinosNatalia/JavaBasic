public class ListElement <Type> {
    private Type data;
    private ListElement<Type> previousElement;
    private ListElement<Type> nextElement;

    public ListElement(Type data, ListElement<Type> previousElement, ListElement<Type> nextElement) {
        this.data = data;
        this.previousElement = previousElement;
        this.nextElement = nextElement;
    }
    public ListElement(Type data, ListElement<Type> previousElement) {
        this.data = data;
        this.previousElement = previousElement;
    }
    public ListElement(Type data) {
        this.data = data;
    }

    public void setData(Type data) {
        this.data = data;
    }

    public void setPreviousElement(ListElement<Type> previousElement) {
        this.previousElement = previousElement;
    }

    public void setNextElement(ListElement<Type> nextElement) {
        this.nextElement = nextElement;
    }

    public Type getData() {
        return data;
    }

    public ListElement<Type> getPreviousElement() {
        return previousElement;
    }

    public ListElement<Type> getNextElement() {
        return nextElement;
    }
}
