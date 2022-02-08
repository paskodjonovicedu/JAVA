package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(getBucketCount(2.75,3.25,2.5, 1));
        System.out.println(getBucketCount(7.25,4.3,2.35));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        } else {
            double buckets = Math.ceil((width * height / areaPerBucket) - extraBuckets);
            return (int) buckets;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        } else {
            double buckets = Math.ceil(width * height / areaPerBucket);
            return (int) buckets;
        }
    }

    public static int getBucketCount(double area, double arePerBucket) {
        if ((area <= 0) || (arePerBucket <= 0)) {
            return -1;
        } else {
            double buckets = Math.ceil(area / arePerBucket);
            return (int) buckets;
        }
    }
}
