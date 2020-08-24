package com.lhy.cloud.common.service;

import com.lhy.cloud.common.dto.ECooperateMer;
import com.lhy.cloud.common.response.QueryECooperateMerResponse;

/**
 * @author: LiuHeYong
 * @create: 2019-05-22
 * @description: ECooperateMerService
 **/
public interface ECooperateMerService {

    /**
     * @date: 2019/5/24
     * @param: [eCooperateMer]
     * @return: com.boot.com.alibabacloud.commons.serviceSub.ECooperateMer
     * @exception:
     * @description: 插入详情
     */
    void addECooperateMerInfo(ECooperateMer eCooperateMer) throws Exception;

    /**
     * @date: 2019/5/24
     * @param: [eCooperateMer]
     * @return: com.boot.com.alibabacloud.commons.serviceSub.ECooperateMer
     * @exception:
     * @description: 修改详情
     */
    void updateECooperateMerInfo(ECooperateMer eCooperateMer) throws Exception;

    /**
     * @date: 2019/5/24
     * @param: [eCooperateMer]
     * @return: com.boot.com.alibabacloud.commons.serviceSub.ECooperateMer
     * @exception:
     * @description: 详情
     */
    ECooperateMer queryECooperateMerInfo(ECooperateMer eCooperateMer) throws Exception;

    /**
     * @date: 2019/5/24
     * @param: [eCooperateMer]
     * @return: com.boot.com.alibabacloud.commons.serviceSub.ECooperateMer
     * @exception:
     * @description: 列表
     */
    QueryECooperateMerResponse queryECooperateMerListPage(ECooperateMer eCooperateMer) throws Exception;
}
