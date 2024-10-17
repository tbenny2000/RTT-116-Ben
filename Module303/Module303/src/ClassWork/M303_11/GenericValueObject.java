package ClassWork.M303_11;

public class GenericValueObject<T,K> {

    private T typeT;
    private K typeK;

    public T getT() {
        return typeT;
    }

    public void setT(T typeT) {
        this.typeT = typeT;
    }

    public static void main(String[] args) {
        // creating your own generic classes is something that is very rare for an engineer and primarily is
        // used when creating a library that many other engineers and projects will use in different ways.
        GenericValueObject<String, String> str = new GenericValueObject<>();
        str.setT("String");
        String s1 = str.getT();

        GenericValueObject<Integer, String> value = new GenericValueObject<>();
        value.setT(1);
        Integer i = value.getT();
    }

}
