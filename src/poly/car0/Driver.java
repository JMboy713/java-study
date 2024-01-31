package poly.car0;

public class Driver {
    private K3Car k3Car; // 변수 생성
    private Model3Car model3Car;
    public void setK3Car(K3Car k3Car){ // set 으로 밖에서 설정.  ( null 로 생성됨)
        this.k3Car=k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        if (k3Car!=null){

            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        }else if(model3Car!=null){
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }

    }
}
