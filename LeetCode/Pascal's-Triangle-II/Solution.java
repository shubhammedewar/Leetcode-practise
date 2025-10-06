class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer>list = new ArrayList<>();

        for(int row = 1 ; row<=rowIndex+1;row++){
            list.clear();
            long ans = 1;
            list.add(1);
            for(int col =1;col <row;col++){
                ans = ans * (row - col);
                ans = ans/col;
                list.add((int) ans);
            }
        }
        return list;
    }
}