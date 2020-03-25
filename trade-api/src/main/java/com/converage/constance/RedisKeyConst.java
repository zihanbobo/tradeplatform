package com.converage.constance;

import com.converage.entity.shop.OrderInfo;
import com.converage.entity.shop.SampleMachineLocation;
import com.converage.entity.user.NearByUser;

public class RedisKeyConst {
    public static final String COMPUTE_POWER_RANK_NO = "computePowerRankNo";//用户算力排行榜名次key
    public static final String COMPUTE_POWER_RANK_LIST = "computePowerRankList";//用户算力排行榜名次key

    /** 文章点赞 set 类型*/
    public static final String ARTICLE_LIKE = "article:like:%s";

    /** 文章收藏 set 类型*/
    public static final String ARTICLE_COLLECT = "article:collect:%s";


    //用户坐标
    public static final String USER_COORDINATE = "userCoordinate:" + NearByUser.User_id;
    public static final String CNY_TO_USD_RATE = "cny_to_usd_rate";
    public static final String SEND_SMS_PHONENUMBER = "send_sms_phoneNumber:%s";

    public static String buildUserCoordinate(String userId, String provinceCode, String cityCode, String regionCode, String streetCode) {
        String newStr = USER_COORDINATE.replace(NearByUser.User_id, userId);
        newStr += "|" + provinceCode + cityCode + regionCode + streetCode;
        return newStr;
    }


    //小样机器坐标
    public static final String SAMPLE_MACHINE_ID = "machineId:" + SampleMachineLocation.CityCode;

    public static String buildSampleMachineId(String cityCode) {
        return SAMPLE_MACHINE_ID.replace(SampleMachineLocation.CityCode, cityCode);
    }

    //卡券兑换开关
    public static final String USE_VOUCHER_FLAG = "user_voucher_flag:";

    //商铺的未支付订单
    public static final String NONE_PAY_ORDER = "shop:" + OrderInfo.Shop_id + ":none_pay_order";

    //商铺的未支付订单
    public static final String USER_SHOPPINGCART = "shoppingcart:%s";

    public static String buildNonePayOrder(String shopId) {
        return NONE_PAY_ORDER.replace(OrderInfo.Shop_id, shopId);
    }

    //APP访问token (格式 appAccessToken:userId)
    public static final String APP_ACCESS_TOKEN = "appAccessToken:%s";

    public static final String ADMIN_ACCESS_TOKEN = "adminAccessToken:%s";

    /**
     * 国家省市区数据 hash 类型 hashKey 是父ID
     */
    public static final String ADDRESS_LIST = "address:lsit";

    /**
     * 一些公共的资源数据
     */
    public static final String COMMON_RESOURCE = "common:resource";

    /**
     * 全部用户的数据(用户id,邀请id)
     */
    public static final String ALL_USER_SAMPLE_INFO = "all_user_sample_info";

    /**
     * 图形验证码key
     */
    public static final String VERTIFY_PICTURE = "vertifyImg";


    public static final String HUOBI = "huobi";
}