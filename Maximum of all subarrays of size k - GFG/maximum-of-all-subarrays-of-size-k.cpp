//{ Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++

class Solution
{
  public:
    //Function to find maximum of each subarray of size k.
    vector <int> max_of_subarrays(int *arr, int n, int k)
    {
        // your code here
        vector<int> answer;
        priority_queue<pair<int, int>> heap;
        
        for(int i=0; i<k; i++){
            heap.push({arr[i],i});
        }
        
        answer.push_back(heap.top().first);
        
        for(int i = k; i<n; i++){
            heap.push({arr[i], i});
            
            while(heap.top().second <= i-k){
                heap.pop();
            }
            answer.push_back(heap.top().first);
        }
        return answer;
    }
};

//{ Driver Code Starts.

int main() {
	
	int t;
	cin >> t;
	
	while(t--){
	    
	    int n, k;
	    cin >> n >> k;
	    
	    int arr[n];
	    for(int i = 0;i<n;i++) 
	        cin >> arr[i];
	    Solution ob;
	    vector <int> res = ob.max_of_subarrays(arr, n, k);
	    for (int i = 0; i < res.size (); i++) 
	        cout << res[i] << " ";
	    cout << endl;
	    
	}
	
	return 0;
}
// } Driver Code Ends