public class MyArrayInt {
    //Сделать класс для управления массивом из 10 элементов. Реализовать операции: вставка, удаление, сортировка, поиск, вывод в строку.
    private int[] arrayInt = new int[10];
    int count = 0;

    public void add(int value) {
        arrayInt[count] = value;
        count++;
    }
    public void insert(int value, int index) {
        if (index >= 10) {
            System.out.println("Индекс вставляемого элемента должен быть от 0 до 9");
            return;
        }
        arrayInt[index] = value;
        if (count <= index) {
            count = index + 1;
        }
    }
    public void insert(int value) {
        add(value);
    }

    public void sort() {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (arrayInt[i] < arrayInt[j]) {
                    int temp = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = temp;
                }
            }
        }
    }

    /**
     * Функция поиска элемента по значению. Возвращает индекс первого найденного элемента.
     * Если элемент не найден, то вернется -1
     * @param value искомое значение
     * @return индекс элемента
     */
    public int find(int value) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (arrayInt[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void deleteByIndex(int index) {
        if (index >= count) {
            System.out.println("Индекс удаляемого элемента больше, чем элементов в массиве");
            return;
        }
        for (int i = index; i < count; i++) {
            arrayInt[i] = arrayInt[i+1];
        }
        count--;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < count; i++) {
            str += arrayInt[i] + " ";
        }
        return str;
    }
}
