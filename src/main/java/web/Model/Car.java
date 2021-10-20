package web.Model;

public class Car {
	private String carName;
	private int carModel;
	private String carColor;

	public Car(){
	}

	public Car(String carName, int carModel, String carColor) {
		this.carName = carName;
		this.carModel = carModel;
		this.carColor = carColor;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarModel() {
		return carModel;
	}

	public void setCarModel(int carModel) {
		this.carModel = carModel;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	@Override
	public String toString() {
		return "Car{" +
				"carName='" + carName + '\'' +
				", carModel=" + carModel +
				", carColor='" + carColor + '\'' +
				'}';
	}
}
