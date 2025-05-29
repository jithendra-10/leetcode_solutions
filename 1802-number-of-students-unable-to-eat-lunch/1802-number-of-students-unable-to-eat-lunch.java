class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for (int student : students) {
            queue.offer(student);
        }
        int index = 0;
        int unableToEat = 0;
        while (!queue.isEmpty() && unableToEat < queue.size()) {
            if (queue.peek() == sandwiches[index]) {
                queue.poll();
                index++;
                unableToEat = 0;
            } else {
                queue.offer(queue.poll());
                unableToEat++;
            }
        }
        return queue.size();
    }
}