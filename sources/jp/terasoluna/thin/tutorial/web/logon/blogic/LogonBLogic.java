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

package jp.terasoluna.thin.tutorial.web.logon.blogic;

import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.fw.web.UserValueObject;
import jp.terasoluna.thin.tutorial.web.common.uvo.TutorialUVO;
import jp.terasoluna.thin.tutorial.web.logon.dto.LogonInput;
import jp.terasoluna.thin.tutorial.web.logon.dto.LogonOutput;

/**
 * ���O�I���������s���r�W�l�X���W�b�N�B
 *
 */
public class LogonBLogic implements BLogic<LogonInput> {

    /**
     * ���O�I���������s���B
     *
     * @param param ���͂��ꂽ���[�UID��ێ�����Map
     * @return BLogicResult ���O�I���������ʂ�ێ�����BLogicResult
     */
    public BLogicResult execute(LogonInput param) {

        //���͂��ꂽ���[�UID�̎擾
        String userId = param.getUserId();

        //UVO�̐���
        TutorialUVO uvo = (TutorialUVO) UserValueObject.createUserValueObject();

        //���[�UID��UVO�ɐݒ肷��B
        uvo.setUserId(userId);

        //UVO��ԋp�p�̃N���X�ɐݒ肷��B
        LogonOutput output = new LogonOutput();
        output.setUvo(uvo);

        //BLogicResult�̐����A�ݒ�
        BLogicResult result = new BLogicResult();
        result.setResultObject(output);
        result.setResultString("success");

        return result;
    }

}
