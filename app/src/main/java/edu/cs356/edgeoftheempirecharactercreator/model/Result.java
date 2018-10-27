package edu.cs356.edgeoftheempirecharactercreator.model;

public class Result {

    private boolean success;
    private Object result;

    public Result(boolean success, Object result) {
        this.success = success;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public Object getResult() {
        return result;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
