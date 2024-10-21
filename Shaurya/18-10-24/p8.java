class p8 {
    public static void main(String[] args) {
        String[] names = {"Rajesh", "Amitabh", "Preeti", "Suman", "Devi", "Ravi"};
        
        System.out.println("Name          Capital Letters Count");
        
        for (int i = 0; i < names.length; ++i) {
            String name = names[i];
            int capitalCount = 0;
            for (int j = 0; j < name.length(); j++) {
                if (Character.isUpperCase(name.charAt(j))) {
                    capitalCount++;
                }
            }
            System.out.println(name + "          " + capitalCount);
        }
    }
}


// Ouput:

// Name          Capital Letters Count
// Rajesh          1
// Amitabh          1
// Preeti          1
// Suman          1
// Devi          1
// Ravi          1
