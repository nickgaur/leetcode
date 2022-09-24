class Solution {
public:
    
    vector<vector<int>> ans{};

void generate(int n, int k, vector<int>& cur) {
	if (k == 0) {
		ans.push_back(cur);
		return;
	}
	for (int i = n; i >= 1; --i) {
		cur.push_back(i);
		generate(i - 1, k - 1, cur);
		cur.pop_back();
	}
}

vector<vector<int>> combine(int n, int k) {
	vector<int> cur{};
	generate(n, k, cur);
	return ans;
}
};