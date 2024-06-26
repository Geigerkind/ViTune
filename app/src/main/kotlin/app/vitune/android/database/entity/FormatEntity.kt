package app.vitune.android.database.entity

import androidx.compose.runtime.Immutable
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import app.vitune.android.database.entity.SongEntity
import app.vitune.android.domain.material.Song

@Immutable
@Entity(
    tableName = "Format",
    foreignKeys = [
        ForeignKey(
            entity = SongEntity::class,
            parentColumns = ["id"],
            childColumns = ["songId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class FormatEntity(
    @PrimaryKey val songId: String,
    val itag: Int? = null,
    val mimeType: String? = null,
    val bitrate: Long? = null,
    val contentLength: Long? = null,
    val lastModified: Long? = null,
    val loudnessDb: Float? = null
)
