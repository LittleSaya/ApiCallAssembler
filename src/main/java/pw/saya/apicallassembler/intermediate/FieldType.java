package pw.saya.apicallassembler.intermediate;

import pw.saya.apicallassembler.enums.BasicFieldType;

/**
 * 支持的字段类型，非数组视为0维数组的特殊情况
 */
public class FieldType {

    private BasicFieldType basicFieldType;

    private int dimension;

    /**
     * 基本类型为Model时具体的Model名称，基本类型不为Model时为null
     */
    private String modelName;

    private FieldType(BasicFieldType basicFieldType, int dimension, String modelName) {
        this.basicFieldType = basicFieldType;
        this.dimension = dimension;
        this.modelName = modelName;
    }

    public static FieldType newNumber(int dimension) {
        return new FieldType(BasicFieldType.Number, dimension, null);
    }

    public static FieldType newBoolean(int dimension) {
        return new FieldType(BasicFieldType.Boolean, dimension, null);
    }

    public static FieldType newString(int dimension) {
        return new FieldType(BasicFieldType.String, dimension, null);
    }

    public static FieldType newModel(int dimension, @javax.annotation.Nonnull String modelName) {
        return new FieldType(BasicFieldType.Model, dimension, modelName);
    }

    public BasicFieldType getBasicFieldType() {
        return basicFieldType;
    }

    public int getDimension() {
        return dimension;
    }

    public String getModelName() {
        return modelName;
    }
}
