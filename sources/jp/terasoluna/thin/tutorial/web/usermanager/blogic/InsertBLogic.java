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

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.fw.dao.UpdateDAO;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicMessage;
import jp.terasoluna.fw.service.thin.BLogicMessages;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.thin.tutorial.web.usermanager.dto.InsertInput;
import jp.terasoluna.thin.tutorial.web.usermanager.exception.InsertException;
import jp.terasoluna.thin.tutorial.web.usermanager.vo.SelectUserOutput;

/**
 * �o�^�������s���r�W�l�X���W�b�N�B
 *
 */
public class InsertBLogic implements BLogic<InsertInput> {

    /**
     * QueryDAO�B
     * Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    private QueryDAO queryDAO = null;
    
    /**
     * UpdateDAO�B
     * Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    private UpdateDAO updateDAO = null;
    
    /**
     * �o�^�������s���B
     */
    public BLogicResult execute(InsertInput param) {
        BLogicResult result = new BLogicResult();
            
        SelectUserOutput selectUserOutput 
            = queryDAO.executeForObject("getUser", param, SelectUserOutput.class);
        
        //�o�^����ID���d�����Ă�ꍇ�ُ͈폈��������
        if(selectUserOutput != null) {
            
            //�G���[���b�Z�[�W����
            BLogicMessages messages = new BLogicMessages();
            messages.add("message",
                    new BLogicMessage("errors.input.id.repeat"));
            result.setErrors(messages);
            
            result.setResultString("failure");
            return result;
        }
        
        //�o�^����
        updateDAO.execute("insertUser", param);
        
        //���b�Z�[�W����
        BLogicMessages messages = new BLogicMessages();
        messages.add("message",
                new BLogicMessage("message.regist",param.getId()));
        result.setMessages(messages);
        result.setResultString("success");
        
        return result;
        
        //�Ɩ���O���X���[����
        //throw new InsertException();
    }

    /**
     * QueryDAO��ݒ肷��B
     * @param queryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {
        this.queryDAO = queryDAO;
    }

    /**
     * UpdateDAO��ݒ肷��B
     * @param updateDAO
     */
    public void setUpdateDAO(UpdateDAO updateDAO) {
        this.updateDAO = updateDAO;
    }

}
