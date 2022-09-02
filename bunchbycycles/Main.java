package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    for (int i = 0; i < cycles.length; i++) {     //iterating through the cycles array which has the count of how many times batteries have been used.
      
            if (cycles[i] < 400) {            //checking the conditions if charged less than 400 times
                counts.lowCount++;
            }

            else if (cycles[i] >= 400 && cycles[i] <= 919) {    //checking the conditions if charged between 400 and 919 times
                counts.mediumCount++;
            } else {
                counts.highCount++;     //checking the conditions if charged more than 920 times
            }
        }
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
