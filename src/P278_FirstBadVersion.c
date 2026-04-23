// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

int firstBadVersion(int n) {
  int low = 1;
  int high = n;
  int mid = low + (high - low) / 2;
  while (low != mid) {
    if (isBadVersion(mid)) {
      high = mid;
    } else {
      low = mid;
    }
    mid = low + (high - low) / 2;
  }
  return isBadVersion(mid) ? low : high;
}