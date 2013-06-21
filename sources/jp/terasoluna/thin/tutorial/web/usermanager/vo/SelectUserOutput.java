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

package jp.terasoluna.thin.tutorial.web.usermanager.vo;

import java.io.Serializable;

/**
 * ���[�U���ێ�Bean�B
 * 
 * �f�[�^�x�[�X����̎擾���A��ʂ���̓��͎��Ɏg�p�����B
 *
 */
public class SelectUserOutput implements Serializable {

    /**
     * �V���A���o�[�W����ID�B
     */
    private static final long serialVersionUID = 161610379384156463L;

    /**
     * ID�B
     */
    private Long id = null;

    /**
     * ���O�B
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

    /**
     * ID��ԋp����B
     * 
     * @return �ێ�����ID
     */
    public Long getId() {
        return id;
    }

    /**
     * ID��ݒ肷��B
     * 
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ���O��ԋp����B
     * 
     * @return �ێ����閼�O
     */
    public String getName() {
        return name;
    }

    /**
     * ���O��ݒ肷��B
     * 
     * @param name ���O
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
}
