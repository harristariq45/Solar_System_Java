public class Moon extends SolarObject 
{

    private double centreOfRotationDistance; 
    private double centreOfRotationAngle;

    /**
     * 
     * @param distance
     * @param angle
     * @param diameter
     * @param col
     * @param centreOfRotationDistance
     * @param centreOfRotationAngle
     */

    public Moon(int distance, double angle, int diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle){

        super(distance, angle, diameter, col);
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;

    }

    /**
     * get method for centre of rotation angle
     * @return will return the coordinate around which this Moon will orbit
     */
    public double getcentreOfRotationAngle()
    {
        return centreOfRotationAngle;
    }

    /**
     * get method for centre of rotation distance
     * @return will return the coordinate around which this Moon will orbit
     */

    public double getcentreOfRotationDistance()
    {
        return centreOfRotationDistance;
    }

    /**
     * this method will be used to move the moon 
     * @param speed this will be the speed
     * @param f this is will be the coordinate around which it will orbit
     * @param g will be the angle around which this object will orbit
     */

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