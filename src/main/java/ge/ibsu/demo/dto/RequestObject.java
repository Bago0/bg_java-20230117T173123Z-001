package ge.ibsu.demo.dto;

import org.springframework.data.domain.PageImpl;

public class RequestObject <T>{
    private T data;
    private Paging paging;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }
}
