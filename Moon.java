public class Moon extends SolarObject {

    private double centreOfRotationDistance; 
    private double centreOfRotationAngle;

    public Moon(int distance, double angle, int diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle){

        super(distance, angle, diameter, col);
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;

    }

    public double getcentreOfRotationAngle()
    {
        return centreOfRotationAngle;
    }

    public double getcentreOfRotationDistance()
    {
        return centreOfRotationDistance;
    }

    public void moveMoon(double speed, double f, double g)
    {
        angle=angle+speed;
        this.centreOfRotationDistance = f;
        this.centreOfRotationAngle = g;

    }

}

            // private int distance;
        // private double angle;
        // private int diameter;
        // private String col;

    // public SolarObject(int x, double y, int diameter, String col, double c, double b)
    // {
    //     this.distance = x;
    //     this.angle = y;
    //     this.diameter = diameter;
    //     this.col = col;
    //     this.centreOfRotationDistance = c;
    //     this.centreOfRotationAngle = b;
    // }

    // public void Moon(SolarSystem d)
    // {
    //     d.drawSolarObjectAbout(this.diameter, this.angle, diameter, col, this.centreOfRotationDistance, this.centreOfRotationAngle);
        
    // }