package org.rumbledb.expressions;

public enum ExecutionMode {
    UNSET,
    LOCAL,
    RDD,
    DATAFRAME;

    public boolean isRDDOrDataFrame() {
        return this == ExecutionMode.RDD || this == ExecutionMode.DATAFRAME;
    }

    public boolean isDataFrame() {
        return this == ExecutionMode.DATAFRAME;
    }

    public boolean isRDD() {
        return this == ExecutionMode.RDD;
    }

    public String toString() {
        switch (this) {
            case UNSET:
                return "unset";
            case LOCAL:
                return "local";
            case RDD:
                return "rdd";
            case DATAFRAME:
                return "dataframe";
        }
        return null;
    }
}
