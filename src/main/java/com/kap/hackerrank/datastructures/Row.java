package com.kap.hackerrank.datastructures;

/**
 * @author Konstantinos Antoniou
 */
public class Row {

    private String exchange;
    private String market;
    private String contractType;
    private String executionType;
    private int volume;

    public String getExchange() {
        return exchange;
    }

    public String getMarket() {
        return market;
    }

    public String getContractType() {
        return contractType;
    }

    public String getExecutionType() {
        return executionType;
    }

    public int getVolume() {
        return volume;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
