package collectionsHomework;

import java.util.HashMap;

public class CropRatio {

	private int totalWeight;
	private HashMap<String, Integer> crops;

	public void add(String name, int cropWeight) {

		if (crops == null) {
			crops = new HashMap<String, Integer>();
		}

		if (crops.containsKey(name)) {
			crops.put(name, crops.get(name) + cropWeight);
			totalWeight += cropWeight;
		} else {
			crops.put(name, cropWeight);
			totalWeight += cropWeight;
		}
	}

	public double proportion(String name) {

		return (double) crops.get(name) / (double) totalWeight;
	}

	public static void main(String[] args) {
		CropRatio cropRatio = new CropRatio();

		cropRatio.add("Wheat", 4);
		cropRatio.add("Wheat", 5);
		cropRatio.add("Rice", 1);

		System.out.println("Fraction of wheat: " + cropRatio.proportion("Wheat"));
	}
}
