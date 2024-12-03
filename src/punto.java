public class punto {
    private int x;
    private int y;
    public  punto(int x , int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
public void setXY(int x, int y){
    this.x = x;
    this.y = y;
}

    public void desplaza(int dx, int dy){
        this.x += dx;
        this.y += dy;
        System.out.println(this.x + " " + this.y);
    }
    public int distancia(punto p){
      int x1 = this.x;
        int y1 = this.y;
        int x2 = p.x;
        int y2 = p.y;
        int d = (int) Math.sqrt(Math.pow((x2 - x1),2) +Math.pow((y2 - y1),2) );

        return d;
    }


    public void imprime() {
        System.out.println( "punto{" +
                "x=" + x +
                ", y=" + y +
                '}');
    }
}