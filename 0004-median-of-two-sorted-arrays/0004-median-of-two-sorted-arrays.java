class Solution {
    public double findMedianSortedArrays(int[] nums1,int[] nums2) 
    {
        int m=nums1.length;
        int n=nums2.length;
        int i=0,j=0;
        int prev=0,curr=0;
        int k=0;
        int mid=(m+n)/2;

        while(i<m&&j<n&&k<=mid)
        {
            prev=curr;
            if(nums1[i]>nums2[j])
            {
                curr=nums2[j];
                j++;
            }
            else
            {
                curr=nums1[i];
                i++;
            }
            k++;
        }

        while(i<m&&k<=mid)
        {
            prev=curr;
            curr=nums1[i];
            i++;
            k++;
        }

        while(j<n&&k<=mid)
        {
            prev=curr;
            curr=nums2[j];
            j++;
            k++;
        }

        int l=m+n;

        return(l%2==0)?(prev+curr)/2.0:curr;
    }
}