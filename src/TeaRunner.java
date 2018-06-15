
public class TeaRunner {
public static void main(String[] args) {
	TeaBag drink = new TeaBag(TeaBag.CHAMOMILE);
	Kettle boiling = new Kettle();
	boiling.getWater();
	Kettle.Water hotWater = null;
	Cup food = new Cup();
	food.makeTea(drink, hotWater);
}
}
