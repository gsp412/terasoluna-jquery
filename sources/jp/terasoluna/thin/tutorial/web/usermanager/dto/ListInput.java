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

package jp.terasoluna.thin.tutorial.web.usermanager.dto;

/**
 *
 * �ꗗ�f�[�^�擾�����̓��̓N���X
 *
 */
public class ListInput {

    /**
     * �\���s���B
     */
    private String row = null;

    /**
     * �J�n�C���f�b�N�X�B
     */
    private String startIndex = null;


    private String name = "";

    /**
     * �\���s����ԋp����B
     * @return �\���s��
     */
    public String getRow() {
        return row;
    }

    /**
     * �\���s����ݒ肷��B
     * @param row �\���s��
     */
    public void setRow(String row) {
        this.row = row;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
