public class FindDistanceValues {
    public static void main(String[] args) {
        int [] arr1={4,5,8};
        int [] arr2={10,9,1,8};
        int distanceValue=2;
        int finalcount=0;
        for(Integer i:arr1){
            int count=0;
            for(Integer j:arr2){
                if(Math.abs(i-j)>distanceValue){
                    count++;
                }
                if(count==arr2.length){
                    finalcount++;
                }
            }
        }
        System.out.println(finalcount);
    }
}
