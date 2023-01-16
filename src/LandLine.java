public class LandLine implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging = false;
        this.isPowerOn = true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber(String PhoneNo) {
        if(isPowerOn){
            System.out.println("You are dialing the no : " + PhoneNo);
        }
        else {
            System.out.println("Your landline is off");
        }
        return;
    }

    @Override
    public void receiveCall(String PhoneNo) {
       if(isPowerOn && myPhoneNo.equals(PhoneNo)){
         this.isRinging = true;
           System.out.println("Hey, " + myPhoneNo + " you are receiving a call");
       }
       else{
           System.out.println("Call not received");
       }
       return;
    }

    @Override
    public boolean answerCall() {
        if(isRinging){
            System.out.println("Call answer");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
      return isRinging;
    }
}
