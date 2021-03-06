package introduceConstant;

public class ClassB {

    // Introduce const should cause Illegal Selection, because
    // Constant can not hold an instance of the outer class
    public void method1() {
        InnerClass ic = new InnerClass();
    }
    
    // Replace All Occurences, private
    public void method2() {
        String s = "text";
    }

    class InnerClass {

        String var = "text";

        // Replace All Occurences, private, public
        class InnerClass1 {
            String var = "text1";
        }

        class InnerClass2 {
            String var = "text1";
        }
    }
}
