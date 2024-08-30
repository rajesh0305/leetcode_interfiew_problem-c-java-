class Solution {
    public static int findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static boolean possible(int arr[],int day,int m,int k){
          int count =0;
          int no_of_bouquet = 0;
          for(int i = 0;i<arr.length;i++){
            if(arr[i]<=day){
                  count++;
            }else{
                 no_of_bouquet = no_of_bouquet+(count/k);
                 count = 0;
            }
          }
          no_of_bouquet = no_of_bouquet+(count/k);
          if(no_of_bouquet>=m)
            return true;
          else
          return false;
    }
    public  int minDays(int[] bloomDay, int m, int k) {
        // if(m*k>bloomDay.length){
        //     return -1;
        // }
        // int min = findMin(bloomDay);
        // int max = findMax(bloomDay);
        // for(int i = min;i<=max;i++){
        //     if(possible(bloomDay,i,m,k)==true){
        //         return i;
        //     }    
        // }
        // return -1;
       long val = (long) m * k;
        int n = bloomDay.length; // Size of the array
        if (val > n) return -1; // Impossible case.
        // Find maximum and minimum:
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }

        // Apply binary search:
        int low = mini, high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    }
