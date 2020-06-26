package io.github.futurewl.data.mybatis.common.core.page;

import io.github.futurewl.data.mybatis.common.constant.Constants;
import io.github.futurewl.data.mybatis.common.utils.ServletUtils;

/**
 * 表格数据处理
 *
 * @author ruoyi
 */
public class TableSupport {

    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain() {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(Constants.PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(Constants.PAGE_SIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(Constants.ORDER_BY_COLUMN));
        pageDomain.setIsAsc(ServletUtils.getParameter(Constants.IS_ASC));
        return pageDomain;
    }

    public static PageDomain buildPageRequest() {
        return getPageDomain();
    }
}
