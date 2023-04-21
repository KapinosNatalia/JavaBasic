public class MyString {
    private /*final*/ char[] arrayStr = {};
    //private final char[] arrayStr;
    int count = 0;

    public MyString() {
    }
    public MyString(char[] arrayChar) {
        char[] newArr = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            newArr[i] = arrayChar[i];
            count++;
        }
        arrayStr = newArr;
    }

    // какой тип метода add сделать: void или MyString
    public MyString add(char symbol) {
        char[] tempArray = arrayStr;
        char[] newArrayStr = new char[count + 1];
        for (int i = 0; i < count; i++) {
            newArrayStr[i] = tempArray[i];
        }
        newArrayStr[count] = symbol;
        count++;
        return new MyString(newArrayStr);
    }

    public MyString insert(char[] str, int position) {
        if (position > count) {
            try {
                throw new MyException("Позиция вставки превышает количество символов строки");
            } catch (MyException e) {
                throw new RuntimeException(e);
            }
        };
        char[] tempArray = arrayStr;
        char[] newArrayStr = new char[count + str.length];
        for (int i = 0; i < str.length; i++) {
            newArrayStr[i + position] = str[i];
        }
        for (int i = 0; i < count; i++) {
            if (i < position) {
                newArrayStr[i] = tempArray[i];
            } else {
                 newArrayStr[i + str.length] = tempArray[i];
            }
        }
        count += str.length;
        return new MyString(newArrayStr);
    }

    public MyString insert(char str, int position) {
        if (position > count) {
            try {
                throw new MyException("Позиция вставки превышает количество символов строки");
            } catch (MyException e) {
                throw new RuntimeException(e);
            }
        };
        char[] tempArray = arrayStr;
        char[] newArrayStr = new char[count + 1];
        newArrayStr[position] = str;

        for (int i = 0; i < count; i++) {
            if (i < position) {
                newArrayStr[i] = tempArray[i];
            } else {
                newArrayStr[i + 1] = tempArray[i];
            }
        }
        count++;
        return new MyString(newArrayStr);
    }

    public MyString substring(int firstPos, int lastPos) {
        char[] arrSubstring = new char[lastPos - firstPos + 1];
        for (int i = firstPos; i <= lastPos ; i++) {
            arrSubstring[i - firstPos] = arrayStr[i];
        }
        return new MyString(arrSubstring);
    }

    public MyString substring(int firstPos) {
        return substring(firstPos, count-1);
    }

    public int isContain(char[] substring) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (arrayStr[i] == substring[0]) {
                index = i;
                for (int j = 1; j < substring.length; j++) {
                    if (arrayStr[i + j] != substring[j]) {
                        index = -1;
                        break;
                    }
                }
            }
        }
        return index;
    }
    public int isContain(char substringChar) {
        char[] substringArr = {substringChar};
        return isContain(substringArr);
    }

    public MyString delete(int position) {
        char[] tempArr = arrayStr;
        count--;
        char[] newArrayStr = new char[count];
        for (int i = 0; i < count; i++) {
            if (i < position) {
                newArrayStr[i] = tempArr[i];
            } else {
                newArrayStr[i] = tempArr[i + 1];
            }
        }
        return new MyString(newArrayStr);
    }

    public MyString replace(char oldChar, char newChar) {
        char[] oldSubstr = {oldChar};
        char[] newSubstr = {newChar};
        return this.replace(oldSubstr, newSubstr);
    }

    public MyString replace(char[] oldSubstr, char[] newSubstr) {
        int position = this.isContain(oldSubstr);
        if (position == -1) {
            MyException myExeption = new MyException("Подстрока не найдена");
            return this;
        }
        count = count + (newSubstr.length - oldSubstr.length);
        char[] newArrStr = new char[count];
        for (int i = 0; i < arrayStr.length; i++) {
            if (i < position) {
                newArrStr[i] = arrayStr[i];
            } else {
                newArrStr[i + (newSubstr.length - oldSubstr.length)] = arrayStr[i];
            }
        }
        for (int i = 0; i < newSubstr.length; i++) {
            newArrStr[i + position] = newSubstr[i];
        }
        return new MyString(newArrStr);

    }

    public void print() {
       for (int i = 0; i < count; i++) {
           System.out.print(arrayStr[i]);
       }
       System.out.println();
    }
}
