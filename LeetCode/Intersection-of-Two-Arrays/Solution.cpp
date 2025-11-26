1class Solution {
2public:
3    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
4        map<int ,int>mp;
5
6        for(int i=0;i<nums1.size();i++){
7            for(int j=0;j<nums2.size();j++){
8                if(nums1[i] == nums2[j]){
9                    mp[nums1[i]] ++;
10                }
11            }
12        }
13        vector<int>ans;
14        for(auto &i:mp){
15            ans.push_back(i.first);
16        }
17
18        return ans;
19
20        
21    }
22};