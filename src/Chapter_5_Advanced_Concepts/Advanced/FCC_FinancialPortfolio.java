package Chapter_5_Advanced_Concepts.Advanced;

import java.util.ArrayList;

abstract class Asset {
    double value;
    String riskLevel;
    abstract void annualReturn();
    abstract void applyRisk();
}

interface Tradable {

    public void Buy();
    public void Sell();
}

class Stock extends Asset implements Tradable {

    public Stock(double value, String riskLevel) {
        this.value = value;
        this.riskLevel = riskLevel;
    }

    @Override
    public void annualReturn() {
        double result = (value * 0.12) + value;
        System.out.println("Annual Return for Stock: " + result);
    }

    @Override
    public void applyRisk() {
        switch (riskLevel) {
            case "high" -> value -= value * 0.05;
            case "moderate" -> value -= value * 0.02;
            case "low" -> value = value;
            case null, default -> System.out.println("Error processing risk level!");
        }
    }

    @Override
    public void Buy() {
        System.out.println("Buying stock...");
        value += 10;
    }

    @Override
    public void Sell() {
        System.out.println("Selling stock...");
        value -= 10;
    }
}

class Bond extends Asset implements Tradable{

    public Bond(double value, String riskLevel) {
        this.value = value;
        this.riskLevel = riskLevel;
    }

    @Override
    public void annualReturn() {
        double result = (value * 0.10) + value;
        System.out.println("Annual Return for Bond: " + result);
    }

    @Override
    public void applyRisk() {
        switch (riskLevel) {
            case "high" -> value -= value * 0.05;
            case "moderate" -> value -= value * 0.02;
            case "low" -> value = value;
            case null, default -> System.out.println("Error processing risk level!");
        }
    }

    @Override
    public void Buy() {
        System.out.println("Buying bonds...");
        value += 10;
    }

    @Override
    public void Sell() {
        System.out.println("Selling bonds...");
        value -= 10;
    }
}

class SavingsAccount extends Asset {

    public SavingsAccount(double value, String riskLevel) {
        this.value = value;
        this.riskLevel = riskLevel;
    }

    @Override
    public void annualReturn() {
        double result = (value * 0.02) + value;
        System.out.println("Annual Return for SavingsAccount: " + result);
    }

    @Override
    public void applyRisk() {
        switch (riskLevel) {
            case "high" -> value -= value * 0.05;
            case "moderate" -> value -= value * 0.02;
            case "low" -> value = value;
            case null, default -> System.out.println("Error processing risk level!");
        }
    }
}

class Portfolio {
    ArrayList<Asset> assets = new ArrayList<>();

    public Portfolio() {
        this.assets = new ArrayList<>();
    }

    public void addAsset(Asset asset) {
        assets.add(asset);
    };

    public void removeAsset(Asset asset) {
        assets.remove(asset);
    };

    public double getPortfolioValue() {
        double total = 0;
        for (Asset asset : assets) {
            total += asset.value;
        }
        return total; 
    };
}

public class FCC_FinancialPortfolio {

    public static void main(String[] args) {

        Stock stock = new Stock(100, "high");
        Bond bond = new Bond(100, "moderate");
        SavingsAccount savingsAccount = new SavingsAccount(100, "low");

        Portfolio portfolio = new Portfolio();

        portfolio.addAsset(stock);
        portfolio.addAsset(bond);
        portfolio.addAsset(savingsAccount);

        System.out.println("Before evaluation: " + portfolio.getPortfolioValue());

        stock.applyRisk();
        bond.applyRisk();
        savingsAccount.applyRisk();

        System.out.println("After Risk evaluation: " + portfolio.getPortfolioValue());

        stock.Buy();
        stock.Sell();

        System.out.println("After Buy/Sell evaluation: " + portfolio.getPortfolioValue());


        stock.annualReturn();
        bond.annualReturn();
        savingsAccount.annualReturn();

        System.out.println("After Return evaluation: " + portfolio.getPortfolioValue());

    }
}
