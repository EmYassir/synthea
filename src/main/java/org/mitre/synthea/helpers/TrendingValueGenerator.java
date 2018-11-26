package org.mitre.synthea.helpers;

import java.security.SecureRandom;
import java.util.Random;

import org.mitre.synthea.world.agents.Person;

import static com.google.common.base.Preconditions.checkArgument;


/**
 * A Value Generator with the following properties:
 * - values will start at a time beginTime at a starting mean beginMean
 * - values will end at a time endTime at an ending mean endMean
 * - values will be bounded by a minimum and maximum value
 * - values will be distributed with a given standard deviation
 */
public class TrendingValueGenerator extends ValueGenerator {

    // TODO: How do I properly seed this prng?
    private static final Random prng = new SecureRandom();

    private double standardDeviation;
    private Double minimumValue;
    private Double maximumValue;

    private double beginMean;
    private double endMean;
    private long beginTime;
    private long endTime;


    public TrendingValueGenerator(Person person, double standardDeviation, double beginMean, double endMean, long beginTime, long endTime, Double minimumValue, Double maximumValue) {
        super(person);

        checkArgument(standardDeviation >= 0);

        checkArgument(minimumValue == null || maximumValue == null || minimumValue <= maximumValue);
        checkArgument(minimumValue == null || maximumValue == null || minimumValue <= maximumValue);

        this.standardDeviation = standardDeviation;
        this.beginMean = beginMean;
        this.endMean = endMean;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
    }


    /**
     * Return the value at the given time.
     * 
     * @param time
     * @return
     */
    public double getValue(long time) {
        if (time < beginTime)
            return nextValue(beginMean);
        else if (time > endTime)
            return nextValue(endMean);
        else
            return nextValue(beginMean + (endMean - beginMean) * (time - beginTime) / (endTime - beginTime));
    }


    /**
     * @param mean the mean of the random variable
     * @return the next value generated by the random variable
     */
    private Double nextValue(Double mean) {

        Double nextValue;

        do {
            nextValue = prng.nextGaussian() * standardDeviation + mean;

            if ((minimumValue == null || nextValue >= minimumValue) &&
                    (maximumValue == null || nextValue <= maximumValue)) {
                break;
            }
        }
        while (true);

        return nextValue;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("TrendingValueGenerator {");

        sb.append("standardDeviation=").append(standardDeviation);
        sb.append(", beginMean=").append(beginMean);
        sb.append(", endMean=").append(endMean);
        sb.append(", minimumValue=").append(minimumValue);
        sb.append(", maximumValue=").append(maximumValue);
        sb.append('}');

        return sb.toString();
    }
}
