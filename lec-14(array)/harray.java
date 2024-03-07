public class harray {
    public static boolean search(int array[]){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    return false;
                }
                
            }
            System.out.println();
        }
        return true;

    }

    public static int blah(int array[], int key){
        for(int i=0; i<array.length; i++){
            int index=i;
            //for(int j=i+1; j<array.length; j++){
                if(array[i]==key){
                    return index;
                }

            }
            return -1;

        }
    public static void main(String args[]){
        int array[]={3,4,5,8};
        int key=5;
        //search(array);
        System.out.println(search(array));
        System.out.println(blah(array, key));
    }
}
    

