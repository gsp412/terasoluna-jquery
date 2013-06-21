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

package jp.terasoluna.thin.tutorial.web.usermanager.form;

import java.util.List;

import com.google.gson.Gson;

import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;
import jp.terasoluna.thin.tutorial.web.usermanager.vo.SelectUserOutput;

/**
 * ���[�U�[�Ǘ��Ɩ��Ŏg�p����A�N�V�����t�H�[���B
 *
 */
public class UserManagerForm extends ValidatorActionFormEx {

    /**
     * �V���A���o�[�W����ID�B
     */
    private static final long serialVersionUID = 1L;

    /*�o�^��ʂŎg�p����*/
    /**
     * ���[�UID�B
     */
    private Long id = null;

    /**
     * ���[�U���B
     */
    private String name = null;

    /**
     * �N��B
     */
    private String age = null;

    /**
     * ���N�����B
     */
    private String birth = null;

    /*�ꗗ��ʂŎg�p����*/

    /**
     * �\���s���B
     */
    private String row = "10";

    /**
     * �J�n�C���f�b�N�X�B
     */
    private String startIndex ="0";

    /**
     * �S�����B
     */
    private String totalCount = null;

    /**
     * �\���p���[�U���X�g�B
     */
    private List<SelectUserOutput> users = null;

    /**
     * ���[�UID��ԋp����B
     *
     * @return �ێ����郆�[�UID
     */
    public Long getId() {
        return id;
    }

    /**
     * ���[�UID��ݒ肷��B
     *
     * @param id ���[�UID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ���[�U����ԋp����B
     *
     * @return �ێ����郆�[�U��
     */
    public String getName() {
        return name;
    }

    /**
     * ���[�U����ݒ肷��B
     *
     * @param name ���[�U��
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * �N���ԋp����B
     *
     * @return �ێ�����N��
     */
    public String getAge() {
        return age;
    }

    /**
     * �N���ݒ肷��B
     *
     * @param age �N��
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * ���N������ԋp����B
     *
     * @return �ێ����鐶�N����
     */
    public String getBirth() {
        return birth;
    }

    /**
     * ���N������ݒ肷��B
     *
     * @param birth ���N����
     */
    public void setBirth(String birth) {
        this.birth = birth;
    }

    /**
     * �\���s����ԋp����B
     * @return �\���s��
     */
    public String getRow() {
        return row;
    }

    /**
     * �J�n�C���f�b�N�X��ԋp����B
     * @return �J�n�C���f�b�N�X
     */
    public String getStartIndex() {
        return startIndex;
    }

    /**
     * �J�n�C���f�b�N�X��ݒ肷��B
     * @param startIndex �J�n�C���f�b�N�X
     */
    public void setStartIndex(String startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * �S������ԋp����B
     * @return �S����
     */
    public String getTotalCount() {
        return totalCount;
    }

    /**
     * �S������ԋp����B
     * @param totalCount �S����
     */
    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * �\���p���[�U���X�g��ԋp����B
     * @return �\���p���[�U���X�g
     */
    public List<SelectUserOutput> getUsers() {
        return users;
    }

    /**
     * �\���p���[�U���X�g��ݒ肷��B
     * @param users �\���p���[�U���X�g
     */
    public void setUsers(List<SelectUserOutput> users) {
        this.users = users;
    }

    /**
     * ���[�U���X�g��JSON�ɕϊ����Ď擾
     * @return
     */
    public String getUserListJson() {
    	Gson gson = new Gson();
    	return gson.toJson(users);
    }
}
