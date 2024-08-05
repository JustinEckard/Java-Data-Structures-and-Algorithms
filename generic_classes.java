public class generic_classes {

    public static void main(String[] args) {
         // Example usage
    GenClass inObject = new GenClass();
    GenClass doubleObject = new GenClass();

    GenClass_1<Integer,Double> obj1 = new GenClass_1<Integer,Double>();


    int k = (Integer) inObject.find(6);  // Example usage, typecasting is needed as find returns an object but k is an int use Integer for type casting
    // Same thing for Double 
    double d = (Double) inObject.find(6);  

    }
   
}

class  intClass{
    int[] storage = new int[50];       // This is a generic class, but is limited to ints
}


class GenClass {
    Object[] storage = new Object[50];

    Object find(int n){
        return storage[n];          // This is a generic class that stores objects instead 
    }
}

class GenClass_1<T1,T2> {   // This removes the need for typing as generic types can be defined then passed in after
    T1 t11,t12;
    T2 t22;
    T1 f(T1 t){
        t11 = t;

        return t11;
    }
}
