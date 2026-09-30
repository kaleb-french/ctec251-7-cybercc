public class NetworkTrafficController {
    //f
    //c
    //m
    void blockPort(int port){
        System.out.println("Port " + port + " is block for all traffic.");
    }
    void unblockPort(int port){
        System.out.println("Port " + port + " is now allowing all traffic.");
    }
    void divertTraffic(){
        System.out.println("All traffic is dirverted to 172.16.42.11");
    }
    void monitorPacketLoss(){

    }
}
