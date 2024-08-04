class C { // Declaration of class C

    private String DataField1;
    private int DataField2;
    private double DataField3;

    public static void main(String args[]){  // main method, this is always the same
        C object1 = new C("objec1",100,200), object2 = new C("object2"), object3 = new C();  // just declaring an object doesnt create one, it needs to be assigned to a variable

        // calling on this object

        object1.method2(123);  // this method call is bound to object 1 
        object1.method1();      // This is not a class method and requires an instance of the class to work
        object2.method2(123, "object2"); // the difference in parameter is equivalent to a unique name, esssentially making these two different functions or methods by way of overloading
    }


    public C(){
        this("",1,0);
    }

    public C (String s){
        this(s,1,0);
    }

    public C (String s, int i){
        this(s,i,0);
    }

    public void method1(){
        System.out.println(DataField1 + " " + DataField2 + " " + DataField3);
    }

    public void method2(int i){
        method2(i,"unknown");
    }

    public void method2(int i , String s){
        DataField2 = i;
        System.out.println(i +" recieved from " + s);
    }

    public C (String s, int i, double d){
        DataField1 = new String(s);
        DataField2 = i;
        DataField3 = d;
    }
}
