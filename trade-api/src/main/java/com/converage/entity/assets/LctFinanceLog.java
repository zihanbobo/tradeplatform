package com.converage.entity.assets;

import com.converage.architecture.mybatis.annotation.Column;
import com.converage.architecture.mybatis.annotation.Id;
import com.converage.architecture.mybatis.annotation.Table;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Alias("LctFinanceLog")
@Table(name = "lct_finance_log")
public class LctFinanceLog implements Serializable{

    private static final long serialVersionUID = 5941299534996041595L;
    @Id
    @Column(name = Id)
    private String id;

    @Column(name = User_id)
    private String userId; //用户id

    @Column(name = Record_type)
    private Integer recordType; //记录类型

    @Column(name = Coin_id)
    private String coinId; //币种Id

    @Column(name = Record_amount)
    private BigDecimal recordAmount; //记录金额

    @Column(name = Status)
    private Integer status; //状态

    @Column(name = Create_time)
    private Timestamp createTime; //创建时间

    @Column(name = Update_time)
    private Timestamp updateTime; //创建时间

    @Column(name = Remark)
    private String remark; //备注


    // --------------- 扩展 ----------------

    private String userAccount;

    //DB Column name
    public static final String Id = "id";
    public static final String User_id = "user_id";
    public static final String Record_type = "record_type";
    public static final String Coin_id = "coin_id";
    public static final String Record_amount = "record_amount";
    public static final String Poundage_amount = "poundage_amount";
    public static final String Status = "status";
    public static final String Create_time = "create_time";
    public static final String Update_time = "update_time";
    public static final String Remark = "remark";
    public static final String Transaction_hash = "transaction_hash";
    public static final String From_address = "from_address";
    public static final String To_address = "to_address";
    public static final String If_merge_assets = "if_merge_assets";
    public static final String If_confirm = "if_confirm";
}
