/*
 * Copyright (c) 2007 NTT DATA Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.terasoluna.thin.tutorial.web.usermanager.blogic;

import java.util.List;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.thin.tutorial.web.usermanager.dto.ListInput;
import jp.terasoluna.thin.tutorial.web.usermanager.dto.ListOutput;
import jp.terasoluna.thin.tutorial.web.usermanager.vo.SelectUserOutput;

/**
 * �ꗗ�f�[�^���擾����r�W�l�X���W�b�N�B
 *
 */
public class AjaxJSONListBLogic implements BLogic<ListInput> {

    /**
     * QueryDAO�B
     * Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    private QueryDAO queryDAO = null;

    /**
     * �ꗗ�f�[�^�擾�������s��
     */
    public BLogicResult execute(ListInput param) {

        //�������擾����
        String totalCount
            = queryDAO.executeForObject("getUserCount", null, String.class);

        //�ꗗ�f�[�^���擾����
        List<SelectUserOutput> users = queryDAO.executeForObjectList("findUsers", param);

        //�r�W�l�X���W�b�N�̏o�̓N���X�Ɍ��ʂ�ݒ肷��
        ListOutput output = new ListOutput();
        output.setUsers(users);
        output.setTotalCount(totalCount);

        BLogicResult result = new BLogicResult();
        result.setResultObject(output);
        result.setResultString("success");

        return result;
    }

    /**
     * QueryDAO��ݒ肷��B
     * @param queryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {
        this.queryDAO = queryDAO;
    }
}
