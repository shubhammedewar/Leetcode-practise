1class Solution {
2public:
3    int thirdMax(vector<int>& nums) {
4        map<int,int>mp;
5
6        for(int i=0;i<nums.size();i++){
7            mp[nums[i]]++;
8        }
9
10        vector<int> vec;
11
12        for(auto &i:mp){
13            vec.push_back(i.first);
14        }
15        int n = vec.size();
16        if(n >=3 ){
17            return vec[n-3]; 
18        }
19        else if(n==2){
20            return vec[1];
21        }
22        else return vec[0];
23        
24
25    }
26};