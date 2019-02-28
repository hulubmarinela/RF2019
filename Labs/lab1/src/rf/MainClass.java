package rf;

public class MainClass {

	public static void main(String[] args) {
		double[][] learningSet = FileUtils.readLearningSetFromFile("in.txt");
		FileUtils.writeLearningSetToFile("out.csv",
		FileUtils.normalizeLearningSet(learningSet));

	}

}
