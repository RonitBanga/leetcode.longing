// 2402. Meeting Rooms III

class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int[] roomsUsedCount = new int[n];
        long[] lastAvailableAt = new long[n];

        for (int[] meet : meetings) {
            int start = meet[0];
            int end = meet[1];
            boolean found = false;

            long earlyEndRoomTime = Long.MAX_VALUE;
            int earlyEndRoom = 0;

            for (int room = 0; room < n; room++) {
                if (lastAvailableAt[room] <= start) {
                    found = true;
                    lastAvailableAt[room] = end;
                    roomsUsedCount[room]++;
                    break;
                }

                if (lastAvailableAt[room] < earlyEndRoomTime) {
                    earlyEndRoom = room;
                    earlyEndRoomTime = lastAvailableAt[room];
                }
            }

            if (!found) {
                lastAvailableAt[earlyEndRoom] += (end - start);
                roomsUsedCount[earlyEndRoom]++;
            }
        }

        int resultRoom = -1;
        int maxUse = 0;
        for (int room = 0; room < n; room++) {
            if (roomsUsedCount[room] > maxUse) {
                maxUse = roomsUsedCount[room];
                resultRoom = room;
            }
        }

        return resultRoom;
    }
}