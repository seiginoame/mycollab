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
package com.mycollab.vaadin.event

/**
 * @author MyCollab Ltd
 * @since 6.0.0
 */
interface PreviewFormHandler<T> {
    /**
     *
     * @param data
     */
    fun gotoNext(data: T)

    /**
     * @param data
     */
    fun gotoPrevious(data: T)

    /**
     * @param data
     */
    fun onAssign(data: T)

    /**
     * @param data
     */
    fun onEdit(data: T)

    /**
     *
     * @param data
     */
    fun onAdd(data: T)

    /**
     *
     * @param data
     */
    fun onDelete(data: T)

    fun onPrint(source: Any, data: T)

    /**
     * @param data
     */
    fun onClone(data: T)

    /**
     *
     */
    fun onCancel()

    /**
     * @param action
     * @param data
     */
    fun onExtraAction(action: String, data: T)
}