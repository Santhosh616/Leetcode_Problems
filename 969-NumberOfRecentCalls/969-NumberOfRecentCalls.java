// Last updated: 7/30/2025, 9:20:38 AM
class RecentCounter {

    ArrayList<Integer> queue;

    public RecentCounter() {
        queue = new ArrayList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(t - queue.get(0) > 3000){
            queue.remove(0);
        }

        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */