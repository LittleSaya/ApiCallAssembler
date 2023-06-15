package pw.saya.apicallassembler.intermediate;

import pw.saya.apicallassembler.enums.HttpMethod;

import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.List;

/**
 * 一个API包含名称、路径、参数列表、返回值类型和HTTP请求方法
 */
public class Api {

    private final String name;

    private final String path;

    private final List<Parameter> parameterList;

    private final Type returnType;

    private final HttpMethod httpMethod;

    public Api(String name, String path, List<Parameter> parameterList, Type returnType, HttpMethod httpMethod) {
        this.name = name;
        this.path = path;
        this.parameterList = parameterList;
        this.returnType = returnType;
        this.httpMethod = httpMethod;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public List<Parameter> getParameterList() {
        return parameterList;
    }

    public Type getReturnType() {
        return returnType;
    }

    public HttpMethod getHttpMethod() {
        return httpMethod;
    }
}
