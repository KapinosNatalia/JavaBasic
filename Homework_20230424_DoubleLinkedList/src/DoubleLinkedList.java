public class DoubleLinkedList <Type> {
   public ListElement<Type> firstElement;
   public ListElement<Type> lastElement;
   int count = 0;


    public void add(Type element) {
        ListElement<Type> newElement = new ListElement<>(element, lastElement);
        if (firstElement == null) {
            firstElement = newElement;
            lastElement = newElement;
        } else {
            lastElement.setNextElement(newElement);
            newElement.setPreviousElement(lastElement);
            lastElement = newElement;
        }
        count++;
    }

    public void insert(Type element, int position) {
        if (position < 0 || position > count) {
            System.out.println("Индекс должен быть в интервале от 0 до " + count);
            return;
        }
        ListElement<Type> newElement = new ListElement<Type>(element);
        if (firstElement == null) {
            firstElement = newElement;
            lastElement = newElement;
        } else {
            if (position == 0) { // добавляем первый элемент
                newElement.setNextElement(firstElement);
                firstElement = newElement;
            } else if (count == position) { // добавляем последний элемент
                lastElement.setNextElement(newElement);
                newElement.setPreviousElement(lastElement);
                lastElement = newElement;
            } else {
                ListElement<Type> currentElement = firstElement;
                for (int i = 0; i < position; i++) {
                    currentElement = currentElement.getNextElement();
                }
                newElement.setNextElement(currentElement);
                newElement.setPreviousElement(currentElement.getPreviousElement());
                currentElement.getPreviousElement().setNextElement(newElement);
                currentElement.setPreviousElement(newElement);
            }
        }
        count++;
    }

    public String find(Type value) {
        ListElement<Type> currentElement = firstElement;
        String str = "";
        int counter = 0;
        while (currentElement != null) {
            if (currentElement.getData().equals(value)) {
                str += (str.equals(""))?counter:", " + counter;
            }
            currentElement = currentElement.getNextElement();
            counter++;
        }
        return (str.equals(""))?"Значение " + value + " не найдено":"Индексы значения " + value + " : " + str;
    }

    public void sort() {
        ListElement<Type> currentElement1 = firstElement;
        ListElement<Type> currentElement2;
        Type temp;
        while (currentElement1 != null) {
            currentElement2 = firstElement;
            while (currentElement2 != null) {
                if ((int)currentElement1.getData() < (int)currentElement2.getData()) { //как правильно сравнивать <Type>? как правильно сортировать, только данные, или полностью элемент?
                    temp = currentElement1.getData();
                    currentElement1.setData(currentElement2.getData());
                    currentElement2.setData(temp);
                }
                currentElement2 = currentElement2.getNextElement();
            }
            currentElement1 = currentElement1.getNextElement();
        }
    }

    public void delete(Type value) { // удаляет все значения, равные value
        ListElement<Type> currentElement = firstElement;
        while (currentElement != null) {
            if (currentElement.getData().equals(value)) {
                if (count == 1) {
                    firstElement = null;
                    lastElement = null;
                } else {
                    if (currentElement.getPreviousElement() != null) {
                        currentElement.getPreviousElement().setNextElement(currentElement.getNextElement());
                    } else {
                        firstElement = currentElement.getNextElement();
                    }
                    if (currentElement.getNextElement() != null) {
                        currentElement.getNextElement().setPreviousElement(currentElement.getPreviousElement());
                    } else {
                        lastElement = currentElement.getPreviousElement();
                    }
                }
                count--;
            }
            currentElement = currentElement.getNextElement();
        }
    }

    @Override
    public String toString() {
        String str = "";
        ListElement<Type> currentElement = firstElement;
        while (currentElement != null) {
            str += (str.equals(""))?currentElement.getData():"->"+currentElement.getData();
            currentElement = currentElement.getNextElement();
        }
        return str;
    }

}
