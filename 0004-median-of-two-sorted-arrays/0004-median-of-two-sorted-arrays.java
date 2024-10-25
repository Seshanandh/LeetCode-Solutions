class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int [] merge=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            merge[k++]=nums1[i];
        }
        for(int i=0;i<m;i++){
            merge[k++]=nums2[i];
        }
        Arrays.sort(merge);
        int t=merge.length;
        if(t%2==1){
            return (double) merge[t/2];
        }
        else{
            int middle1 = merge[t/2 - 1];
            int middle2 = merge[t/ 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
}