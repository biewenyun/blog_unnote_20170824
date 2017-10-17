package site.zkd.unnote.model.custom;

/**
 * 服务器返回给前端的信息
 * @param <T>
 */
public class ResponseList<T> {


    private int code;
    private String msg;
    private Object data;
    private PageSplit pageSplit;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public PageSplit getPageSplit() {
        return pageSplit;
    }

    public void setPageSplit(PageSplit pageSplit) {
        this.pageSplit = pageSplit;
    }
}