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

package jp.terasoluna.thin.tutorial.web.logon.form;

import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;

/**
 * ���O�I���Ɩ��Ŏg�p����A�N�V�����t�H�[���B
 * 
 */
public class LogonForm extends ValidatorActionFormEx {

    /**
     * �V���A���o�[�W����ID�B
     */
    private static final long serialVersionUID = 1L;

    /**
     * ���[�UID�B
     */
    private String userId = null;

    /**
     * ���[�UID��ԋp����B
     * 
     * @return ���[�UID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ���[�UID��ݒ肷��B
     * 
     * @param userId ���[�UID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

}
