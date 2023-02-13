package basic.programs.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class FrequencyOfDigit {


	public int mostFrequent(List<Integer> values) {

		int mostFrequentNo = values.get(0);
		int count = 0;

		for (int i = 0; i < values.size(); i++) {
			int temp = 0;
			for (int j = i + 1; j < values.size(); j++) {
				if (values.get(i) == values.get(j)) {
					temp++;

					if (count < temp) {
						mostFrequentNo = values.get(i);
						count = temp;
					}
				}
			}
		}
		return mostFrequentNo;
	}

	public int leastFrequent(List<Integer> values) {

		int count = 1000000000;
		int leastFrequentNo = 0;


		for (int i = 0; i < values.size(); i++) {
			int temp = 0;
			for (int j = 0; j < values.size(); j++) {
				if (values.get(i) == values.get(j)) {
					temp++;
				}
			}
			if (count > temp) {
				leastFrequentNo = values.get(i);
				count = temp;
			}

		}
		return leastFrequentNo;
	}

}
