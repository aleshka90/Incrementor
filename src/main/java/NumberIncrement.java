public class NumberIncrement implements IIncrementor {
    private int value = 0;
    private int maximumValue = 2147483647;

    /**
     * Возвращает текущее число.
     */
    @Override
    public synchronized int getNumber() {
        return value;
    }

    /**
     * Увеличивает текущее число на один.
     */
    @Override
    public synchronized void incrementNumber() {
        //  если текущее число достигает maximumValue значения, оно обнуляется
        if (value == maximumValue) {
            value = 0;
        } else {
            ++value;
        }
    }

    /*
     * Устанавливает максимальное значение текущего числа.
     * @param maximumValue
     * @throws Exception попытка установить значение меньше нуля
     */
    @Override
    public synchronized void setMaximumValue(int maximumValue) throws Exception {

        if (maximumValue < 0) {
            throw new Exception(String.format("максимальное значение должно быть больше нуля"));
        }
        value = maximumValue;
        this.maximumValue = maximumValue;
    }

    /*
     *Проставляет по умолчанию максимум -- максимальное значение int.
     */
    public void setMaximumValue() {
        value = maximumValue;
    }


}
