package org.example;

public class Currency {
    private Meta meta;
    private myCurrency data;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public myCurrency getData() {
        return data;
    }
    public void setData(myCurrency data) {
        this.data = data;
    }



    static class Meta {
        private String last_updated_at;

        public String getLastUpdatedAt() {
            return last_updated_at;
        }

        public void setLastUpdatedAt(String lastUpdatedAt) {
            this.last_updated_at = lastUpdatedAt;
        }
    }

    static class myCurrency {
        private name USD;
        public name getName(){
            return USD;
        }
        static class name{
            private String code;
            private double value;
            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public double getValue() {
                return value;
            }

            public void setValue(double value) {
                this.value = value;
            }
        }
    }
}
