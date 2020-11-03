import javax.swing.text.JTextComponent.KeyBinding;


public class Coolpool 
{
    private  GameArena table = new GameArena(1200,700,true);
    Ball ball [] = new Ball[21];
    private  Ball white = new Ball(250, 270, 20, "WHITE", 2);
    private  double friction = 5;
    private double frictionX=0, frictionY=0;


    private double whiteBallHitPositionX = 0;
    private double whiteBallHitPositionY = 0;

    private double shotposY = 0;
    private double shotposX = 0;


    public Coolpool() 
    {

        Rectangle one = new Rectangle(10, 10, 1150 , 550, "GREY", 1);
        Rectangle two = new Rectangle(30, 30, 1100 , 500, "GREEN", 2);

        table.addRectangle(one);    
        table.addRectangle(two); 

        Line startLine = new Line(250, 30, 250, 530, 0.7, "WHITE", 2);
        table.addLine(startLine);
        table.addBall(white);
        
        //
        ball[0] = new Ball(750, 270, 20, "RED", 2);

        ball[1] = new Ball(770, 260, 20, "RED", 2);
        ball[2] = new Ball(770, 280, 20, "YELLOW", 2);
    
        ball[3] = new Ball(790, 290, 20, "RED", 2);
        ball[4] = new Ball(790, 270, 20, "BLACK", 2);
        ball[5] = new Ball(790, 250, 20, "YELLOW", 2);
    
        ball[6] = new Ball(810, 240, 20, "RED", 2);
        ball[7] = new Ball(810, 260, 20, "YELLOW", 2);
        ball[8] = new Ball(810, 280, 20, "RED", 2);
        ball[9] = new Ball(810, 300, 20, "YELLOW", 2);
    
        ball[10] = new Ball(830, 230, 20, "YELLOW", 2);
        ball[11] = new Ball(830, 250, 20, "RED", 2);
        ball[12] = new Ball(830, 270, 20, "YELLOW", 2);
        ball[13] = new Ball(830, 290, 20, "YELLOW", 2);
        ball[14] = new Ball(830, 310, 20, "RED", 2);

        //POTHOLES
        ball[15] = new Ball(45, 45, 30, "BLACK", 2);
        ball[16] = new Ball(570, 45, 30, "BLACK", 2);
        ball[17] = new Ball(1115,45, 30, "BLACK", 2);

        ball[18] = new Ball(40, 520, 30, "BLACK", 2);
        ball[19] = new Ball(570, 520, 30, "BLACK", 2);
        ball[20] = new Ball(1115, 520, 30, "BLACK", 2);

        for (int i = 0; i<21; i++){
            table.addBall(ball[i]);
        }

        table.addBall(white);

        Line cue = new Line(white.getXPosition(), white.getYPosition(), table.getMousePositionX(), table.getMousePositionY(), 2, "WHITE", 2);
        table.addLine(cue);



        Rectangle three = new Rectangle(30, 600, 140 , 50, "RED", 1);
        table.addRectangle(three);

        int width = 100;
            int Powerlimit = 1;


        while(true)
        {

        if(Powerlimit<13){
        if (table.rightPressed())
        {
            three.setWidth((width = width +70));
            friction=friction+4;
            Powerlimit++;
            System.out.println("powerlimit=" +Powerlimit);
        }
        }
        if(Powerlimit>1) {
        if (table.leftPressed())
        {
            three.setWidth((width = width - 70));
            friction=friction-4;
            Powerlimit--;
            System.out.println("powerlimit2=" +Powerlimit);
        }
        }

            cue.setLinePosition(white.getXPosition(), white.getYPosition(),
            table.getMousePositionX(), table.getMousePositionY());

            frictionX = friction;
            frictionY = friction;

            whiteBallHitPositionX = white.getXPosition();
            whiteBallHitPositionY = white.getYPosition();

            shotposX = table.getMousePositionX(); 
            shotposY= table.getMousePositionY();

            if(table.leftMousePressed()){
                
                System.out.println("out of while loop3");
                table.removeLine(cue);
                
                while(true){
                    ballMovement();
                    table.pause();

                    if (frictionX == 0 && frictionY == 0){
                        table.addLine(cue);
                        friction =30;
                        break;
                    }
                    
                    for(int i = 15; i<21; i++){
                    if(white.collides(ball[i])){
                        white.setXPosition(250);
                        white.setYPosition(270);
                    }

                }
                
                for(int i = 0; i<15; i++){
                    if(white.collides(ball[i])){
                        table.removeBall(ball[i]);
                   }   }
                    //break;
                }
                //break;
            }

            table.pause();
        }
    }

    public void ballMovement()
    {               
        
        double X = whiteBallHitPositionX;
        double Y = whiteBallHitPositionY;

        double gradientX = (shotposX - X);

        double gradientY = (shotposY - Y);

        double difference = Math.sqrt((gradientX*gradientX) + (gradientY*gradientY));

        double movementX =(gradientX*frictionX)/difference;
        double movementY =(gradientY*frictionY)/difference;

        white.move(movementX,movementY);

        if(white.getXPosition()<40)
        frictionX=-frictionX;
        else if(white.getXPosition()>1120)
        frictionX=-frictionX;

        if(white.getYPosition()<40)
        frictionY=-frictionY;
        else if(white.getYPosition()>520)
        frictionY=-frictionY;

        // if (white.getXPosition()>= 1125 || white.getXPosition()<= 30 || white.getYPosition() >=525 || white.getYPosition() <= 30 ){

        //     //white.move(-movementX,-movementY);
        //     friction = -friction;
        //     // movementX = -movementX;
        //     // movementY = -movementY;
        //     System.out.println(white.getXPosition() + "  "+ white.getYPosition());

        // }
        // else if (white.getXPosition()< 1125 || white.getXPosition()> 30 || white.getYPosition() < 525 || white.getYPosition() > 30 ){
        //     
        // }

        if (frictionX>0){
            frictionX=frictionX-1;
            System.out.println("frictionX"+frictionX);
            //System.out.println(white.getXPosition() + "  "+ white.getYPosition());
        }
        else if (frictionX<0){
            frictionX=frictionX+1;
            System.out.println("frictionX"+frictionX);
            System.out.println(X + "  "+ Y);

        }

        if (frictionY>0){
            frictionY=frictionY-1;
            System.out.println("frictionY"+frictionY);
            //System.out.println(white.getXPosition() + "  "+ white.getYPosition());
        }
        else if (frictionY<0){
            frictionY=frictionY+1;
            System.out.println("frictionY"+frictionY);
            System.out.println(X + "  "+ Y);

        }


        

    }

    


    public static void main( String[] args){
    new Coolpool();   
    }
}

