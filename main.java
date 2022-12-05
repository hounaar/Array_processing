public class Program
{
    public static void main(String[] args) {
        System.out.println("Array Processing");
        double[]arr1={2.4,5.6,2.3};
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+"");
    }
    double t=0;
    for(int i=0;i<arr1.length;i++){
        t+=arr1[i];
        
        System.out.println("t:"+t);
        
    
    }
    double mx=arr1[0];
    for(int i=0;i<arr1.length;i++){
        if(arr1[i]>mx){
            mx=arr1[i];
            
            System.out.println("mx:"+mx);
        }
    }
    double av=0;
    for(int i=0;i<arr1.length;i++){
        av=t/3;
        System.out.println("av:"+av);
    }
  
}
}




















