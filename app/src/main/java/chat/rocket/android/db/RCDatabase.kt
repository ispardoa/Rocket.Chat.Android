package chat.rocket.android.db

import androidx.room.Database
import androidx.room.RoomDatabase
import chat.rocket.android.db.model.AttachmentActionEntity
import chat.rocket.android.db.model.AttachmentEntity
import chat.rocket.android.db.model.AttachmentFieldEntity
import chat.rocket.android.db.model.ChatRoomEntity
import chat.rocket.android.db.model.MessageChannels
import chat.rocket.android.db.model.MessageEntity
import chat.rocket.android.db.model.MessageFavoritesRelation
import chat.rocket.android.db.model.MessageMentionsRelation
import chat.rocket.android.db.model.MessagesSync
import chat.rocket.android.db.model.ReactionEntity
import chat.rocket.android.db.model.UrlEntity
import chat.rocket.android.db.model.UserEntity

@Database(
    entities = [
        UserEntity::class, ChatRoomEntity::class, MessageEntity::class,
        MessageFavoritesRelation::class, MessageMentionsRelation::class,
        MessageChannels::class, AttachmentEntity::class,
        AttachmentFieldEntity::class, AttachmentActionEntity::class, UrlEntity::class,
        ReactionEntity::class, MessagesSync::class
    ],
    version = 10,
    exportSchema = true
)
abstract class RCDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun chatRoomDao(): ChatRoomDao
    abstract fun messageDao(): MessageDao
}