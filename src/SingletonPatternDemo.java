public class SingletonPatternDemo {

    public static void main(String[] args) {

        //get the only available object
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
