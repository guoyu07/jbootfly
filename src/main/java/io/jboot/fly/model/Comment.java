package io.jboot.fly.model;

import io.jboot.db.annotation.Table;
import io.jboot.fly.model.base.BaseComment;

/**
 * Generated by Jboot.
 */
@Table(tableName = "comment", primaryKey = "id")
public class Comment extends BaseComment<Comment> {

    /**
     * 正常状态
     */
    public static final int STATUS_NORMAL = 0;

    /**
     * 回复被采纳
     */
    public static final int STATUS_ADOPTED = 9;


    public boolean isAdopted() {
        Integer status = getStatus();
        return status != null && STATUS_ADOPTED == status;
    }


}
