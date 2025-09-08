class RandomizedSet {
    Set<Integer> set;
    Random random;

    public RandomizedSet() {
        set = new HashSet<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (!set.contains(val)) {
            set.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        }
        return false;

    }

    public int getRandom() {
        Integer arr[] = set.toArray(new Integer[set.size()]);
        return arr[random.nextInt(set.size())];
    }
}
