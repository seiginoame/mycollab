/**
 * Copyright © MyCollab
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.project.view

import com.mycollab.common.GridFieldMeta
import com.mycollab.common.i18n.FollowerI18nEnum
import com.mycollab.common.i18n.GenericI18Enum
import com.mycollab.vaadin.web.ui.WebUIConstants

/**
 * @author MyCollab Ltd.
 * @since 1.0
 */
object FollowingTicketFieldDef {
    @JvmField
    val summary = GridFieldMeta(FollowerI18nEnum.FORM_SUMMARY, "name",
            WebUIConstants.TABLE_EX_LABEL_WIDTH)

    @JvmField
    val project = GridFieldMeta(FollowerI18nEnum.FORM_PROJECT_NAME, "projectName",
            (WebUIConstants.TABLE_EX_LABEL_WIDTH * 1.5).toInt())

    @JvmField
    val assignee = GridFieldMeta(GenericI18Enum.FORM_ASSIGNEE, "assignUser",
            WebUIConstants.TABLE_X_LABEL_WIDTH)

    @JvmField
    val createdDate = GridFieldMeta(FollowerI18nEnum.OPT_FOLLOWER_CREATE_DATE,
            "monitorDate", WebUIConstants.TABLE_DATE_WIDTH)
}