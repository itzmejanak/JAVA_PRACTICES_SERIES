import javax.swing.JOptionPane;

public class Bnking {
    private String customer;

    // Getter method to retrieve customer information
    public String getCustomer(){
    return customer;
    }
    
    public void setCustomer(String customer){
    this.customer = customer;
    if(customer.equals("hacker")){
    JOptionPane.showMessageDialog(null, "you are not valid user");
    }else{
    JOptionPane.showMessageDialog(null, "you are: "+ customer);
    }
    }
    
    public static void main(String[] args){
    Bnking info = new Bnking();
    String name = JOptionPane.showInputDialog("What is your name");
    info.setCustomer(name);
    
    String stored  = info.getCustomer();
    JOptionPane.showMessageDialog(null, "Retrieved customer information: " + stored);
    }
}

