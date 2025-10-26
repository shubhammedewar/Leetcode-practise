class Solution {
public:

    

    int maxArea(vector<int>& height) {
        int i=0,j=height.size()-1;
        int maxarea = 0;
        
        while(i<j){
            int w = j-i;
            int h = min(height[i],height[j]);
            int area = w*h;
            if(area>maxarea) maxarea = area;
            if(height[i] < height[j]) i++;
            else j--;
        }
        
        return maxarea;
        
    }
};