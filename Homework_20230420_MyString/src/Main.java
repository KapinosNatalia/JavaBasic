public class Main {
    public static void main(String[] args) throws MyException {
        String str = "ggg";
        str.substring(2);

        MyString myStringEmpty = new MyString();

        char[] arrChar = {'W','o','r','l','d'};
        MyString myStringNotEmpty = new MyString(arrChar);

        myStringNotEmpty.print();
        myStringEmpty = myStringNotEmpty;
        myStringEmpty.print();

        myStringNotEmpty = myStringNotEmpty.add('!');
        myStringNotEmpty.print();
        char[] arrChar1 = {'H','e','l','l','o'};
        //char[] arrChar1 = {'H','e'};
        myStringNotEmpty = myStringNotEmpty.insert(arrChar1,0);
        myStringNotEmpty.print();
        char[] arrChar2 = {' '};
        myStringNotEmpty = myStringNotEmpty.insert(arrChar2,5);
        myStringNotEmpty.print();
        char[] arrChar3 = {','};
        myStringNotEmpty = myStringNotEmpty.insert(arrChar3,5);
        myStringNotEmpty.print();
        myStringNotEmpty = myStringNotEmpty.insert('!',13);
        myStringNotEmpty.print();
        MyString substring = myStringNotEmpty.substring(0, 3);
        substring.print();
        substring = myStringNotEmpty.substring(7, 11);
        substring.print();
        substring = myStringNotEmpty.substring(7);
        substring.print();

        System.out.println(myStringNotEmpty.isContain(arrChar1));
        System.out.println(myStringNotEmpty.isContain(arrChar));
        char[] arrChar4 = {'H','e','l','o'};
        System.out.println(myStringNotEmpty.isContain(arrChar4));
        System.out.println(myStringNotEmpty.isContain('W'));
        System.out.println(myStringNotEmpty.isContain('u'));

        char[] arrChar5 = {'G','o','o','d',' ','b','y','e'};
        myStringNotEmpty = myStringNotEmpty.replace(arrChar1, arrChar5);
        myStringNotEmpty.print();
        myStringNotEmpty = myStringNotEmpty.replace('!', '?');
        myStringNotEmpty.print();
        myStringNotEmpty = myStringNotEmpty.replace(arrChar1, arrChar5);
        myStringNotEmpty.print();

        myStringNotEmpty = myStringNotEmpty.delete(0);
        myStringNotEmpty.print();
        myStringNotEmpty = myStringNotEmpty.delete(0);
        myStringNotEmpty.print();
        myStringNotEmpty = myStringNotEmpty.delete(4);
        myStringNotEmpty.print();

    }
}
