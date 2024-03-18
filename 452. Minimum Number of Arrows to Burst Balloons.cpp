// 452. Minimum Number of Arrows to Burst Balloons

class Solution {
public:
    int findMinArrowShots(vector<vector<int>>& points) {
        sort(points.begin(),points.end());

        int end = points[0][1];

        int cnt = 1;

        for(int i=1; i<points.size(); i++) {
            if(end>=points[i][0]) {
                end = min(end,points[i][1]);
            }else{
                cnt++;
                end=points[i][1];
            }
        }
        return cnt;
    }
};