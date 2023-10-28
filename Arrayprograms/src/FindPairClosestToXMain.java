public class FindPairClosestToXMain {
public static void findPairWithClosestToX(int arr[],int X) {
 
    int minimumDiff = Integer.MAX_VALUE;
    int n=arr.length;
    if(n<0)
        return;
    // left and right index variables
    int l = 0, r = n-1;
 
    // variable to keep track of the left and right pair for minimumSum
    int minLeft = l, minRight = n-1;
 
    while(l < r)
    {
 
        int currentDiff= Math.abs(arr[l] + arr[r]-X);
        /*If abs(diff) is less than min dif, we need to update sum and pair */
        if(currentDiff < minimumDiff)
        {
            minimumDiff = currentDiff;
            minLeft = l;
            minRight = r;
        }
        if(arr[l] + arr[r] < X)
            l++;
        else
            r--;
    }
 
    System.out.println(" The pair whose sum is closest to X : "+arr[minLeft]+" "+ arr[minRight]);
}
public static void main(String[] args)
{
    int array[]={-40,-5,1,3,6,7,8,20};
    findPairWithClosestToX(array,5);
    
}
}