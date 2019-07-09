import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {

	public class Interval {
		public int start;

		public int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}

		public int getEnd() {
			return end;
		}

		public int getStart() {
			return start;
		}
	}

	public class IntervalComparator implements Comparator<Interval> {
		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.start - o2.start;
		}

	}

	public static void main(String[] args) {

	}

	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		if (intervals == null || intervals.size() == 0) {
			return intervals;
		}
		// sort intervals
		Collections.sort(intervals, new MergeIntervals().new IntervalComparator());
		ArrayList<Interval> result = new ArrayList<Interval>();
		Interval prev = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval curr = intervals.get(i);
			if (prev.end >= curr.start) {
				// merge
				Interval merged = new MergeIntervals().new Interval(prev.start, Math.max(prev.end, curr.end));
				prev = merged;
			} else {
				result.add(prev);
				prev = curr;
			}
		}
		result.add(prev);
		return result;

	}

	// add interval
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newinterval) {
		ArrayList<Interval> result = new ArrayList<Interval>();
		for (Interval interval : intervals) {
			if (interval.end < newinterval.start) {
				result.add(interval);
			} else {
				if (interval.start > newinterval.end) {
					result.add(interval);
					newinterval = interval;
				} else if (interval.end >= newinterval.start || interval.start <= newinterval.end) {
					newinterval = new Interval(Math.min(interval.start, newinterval.start),
							Math.max(newinterval.end, interval.end));

				}
			}
		}
		result.add(newinterval);
		return result;
	}

}
