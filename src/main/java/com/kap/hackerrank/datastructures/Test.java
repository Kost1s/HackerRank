package com.kap.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Konstantinos Antoniou
 */
public class Test {

    private Row rowOne;
    private Row rowTwo;
    private Row rowThree;
    private Row rowFour;
    private Row rowFive;

    private List<Row> rowsList;

    private VolumeByField exchangeVolume;
    private VolumeByField marketVolume;
    private VolumeByField contractTypeVolume;
    private VolumeByField executionTypeVolume;

    public void fillRows() {
        rowOne = new Row();
        rowOne.setExchange("CME");
        rowOne.setMarket("6B");
        rowOne.setContractType("OP");
        rowOne.setExecutionType("Traded Volume");
        rowOne.setVolume(10);

        rowTwo = new Row();
        rowTwo.setExchange("CME");
        rowTwo.setMarket("6C");
        rowTwo.setContractType("OP");
        rowTwo.setExecutionType("Traded Volume");
        rowTwo.setVolume(11);

        rowThree = new Row();
        rowThree.setExchange("CME");
        rowThree.setMarket("6A");
        rowThree.setContractType("FUT");
        rowThree.setExecutionType("Traded Volume");
        rowThree.setVolume(14);

        rowFour = new Row();
        rowFour.setExchange("CME");
        rowFour.setMarket("ES");
        rowFour.setContractType("OP");
        rowFour.setExecutionType("Traded Volume");
        rowFour.setVolume(16);

        rowFive = new Row();
        rowFive.setExchange("CME");
        rowFive.setMarket("ES");
        rowFive.setContractType("FUT");
        rowFive.setExecutionType("Traded Volume");
        rowFive.setVolume(10);

        rowsList = new ArrayList<>();
        rowsList.add(rowOne);
        rowsList.add(rowTwo);
        rowsList.add(rowThree);
        rowsList.add(rowFour);
        rowsList.add(rowFive);
    }

    public void testXX() {
        exchangeVolume = new VolumeByField<String, VolumeByField>();
        for(Row row : rowsList) {
            if(!exchangeVolume.getEntries().containsKey(row.getExchange())) {
                marketVolume = new VolumeByField<String, VolumeByField>();
            } else {
                marketVolume = (VolumeByField) exchangeVolume.getEntries().get(row.getExchange());
            }

            exchangeVolume.getEntries().put(row.getExchange(), marketVolume);

            if(!marketVolume.getEntries().containsKey(row.getMarket())) {
                contractTypeVolume = new VolumeByField<String, VolumeByField>();
            } else {
                contractTypeVolume = (VolumeByField) marketVolume.getEntries().get(row.getMarket());
            }

            marketVolume.getEntries().put(row.getMarket(), contractTypeVolume);

            if(!contractTypeVolume.getEntries().containsKey(row.getContractType())) {
                executionTypeVolume = new VolumeByField<String, Integer>();
            } else {
                executionTypeVolume = (VolumeByField) contractTypeVolume.getEntries().get(row.getExecutionType());
            }

            contractTypeVolume.getEntries().put(row.getContractType(), executionTypeVolume);

            int volume;
            if(!executionTypeVolume.getEntries().containsKey(row.getExecutionType())) {
                volume = row.getVolume();
            } else {
                volume = (int) executionTypeVolume.getEntries().get(row.getExecutionType());
            }

            executionTypeVolume.getEntries().put(row.getExecutionType(), volume);
        }

    }

    public static void main(String[] args) {
        Test test = new Test();

        test.fillRows();

        test.testXX();
    }


}
