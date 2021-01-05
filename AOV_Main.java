
public class AOV_Main {
	public static void main(String[] args)
	{
		Shape square = new ShapeType("square");
		Shape rectangle = new ShapeType("rectangle");
		Shape triangle = new ShapeType("triangle");
		Shape circle = new ShapeType("circle");
		Shape StraightLine = new ShapeType("StraightLine");
		Shape star = new ShapeType("star");
			
		AgeOfVillagers house = new AgeOfVillagers("house");
		AgeOfVillagers tree = new AgeOfVillagers("tree");
		AgeOfVillagers water_source = new AgeOfVillagers("water_source");
		
		AgeOfVillagers village = new AgeOfVillagers("village");
		
		house.addShape(square);
		house.addShape(rectangle);
		house.addShape(triangle);
		
		tree.addShape(StraightLine);
		tree.addShape(star);
		
		water_source.addShape(circle);
		water_source.addShape(star);

		village.addShape(house);
		village.addShape(tree);
		village.addShape(water_source);
		
		village.showShapeType();
		
		house.showShapeType();
		tree.showShapeType();
		water_source.showShapeType();
		
		rectangle.showShapeType();
		
		
	}

}
