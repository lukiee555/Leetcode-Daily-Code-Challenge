class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m];
        System.arraycopy(nums1, 0, temp, 0, m);
        int left = 0,right = 0, i = 0 ;
        while(left < m && right < n && i < m + n){
            if(temp[left] > nums2[right]){
                nums1[i] = nums2[right];
                right++;
                i++;
            }else{
                nums1[i] = temp[left];
                left++;
                i++;
            }
        }
        while(left < m && i < m + n){
            nums1[i] = temp[left];
            left++;
            i++;
        }
        while(right < n && i < m + n){
            nums1[i] = nums2[right];
            right++;
            i++;
        }
    }
    public void mergeOptimal(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}