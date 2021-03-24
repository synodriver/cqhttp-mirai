/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package com.github.yyuueexxiinngg.onebot.data.common

import kotlinx.serialization.Serializable

interface DTO

@Serializable
abstract class EventDTO : DTO {
    abstract var post_type: String
    abstract var self_id: Long
    abstract var time: Long
}

@Serializable
abstract class CQEventDTO {
    abstract var post_type: String
    abstract var self_id: Long
    abstract var time: Long
}

@Serializable
class CQIgnoreEventDTO(override var self_id: Long) : CQEventDTO() {
    override var post_type = "IGNORED"
    override var time = System.currentTimeMillis()
}