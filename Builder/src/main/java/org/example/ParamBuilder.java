package org.example;

public class ParamBuilder {
    private String param1;
    private String param2;
    private String param3;
    private String param4;

    private ParamBuilder(Builder builder){
        this.param1 = builder.requiredParam;
        this.param2 = builder.param2;
        this.param3 = builder.param3;
        this.param4 = builder.param4;

    }

    @Override
    public String toString() {
        return "ParamBuilder{" +
                "param1='" + param1 + '\'' +
                ", param2='" + param2 + '\'' +
                ", param3='" + param3 + '\'' +
                ", param4='" + param4 + '\'' +
                '}';
    }

    public static class Builder{
        private String requiredParam;
        private String param2;
        private String param3;
        private String param4;

        Builder(String param){
            this.requiredParam = param;
        }
        Builder withParam2(String param){
            this.param2 = param;
            return this;
        }
        Builder withParam3(String param){
            this.param3 = param;
            return this;
        }
        Builder withParam4(String param){
            this.param4 = param;
            return this;
        }
       ParamBuilder build(){
            return new ParamBuilder(this);
       }
    }
}
