
package nespresso.entity;

/**
 *
 * @author Angel Campos
 */
public class CoffeeMaker {
    private int maximunCapacity;
    private int currentAmount;

    public CoffeeMaker() {
    }

    public CoffeeMaker(int maximunCapacity, int currentAmount) {
        this.maximunCapacity = maximunCapacity;
        this.currentAmount = currentAmount;
    }

    public int getMaximunCapacity() {
        return maximunCapacity;
    }

    public void setMaximunCapacity(int maximunCapacity) {
        this.maximunCapacity = maximunCapacity;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" + "maximunCapacity=" + maximunCapacity + ", currentAmount=" + currentAmount + '}';
    }    
    
}
