// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: routeguide/RouteGuideProto.proto
package routeguide

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.TagHandler
import com.squareup.wire.WireField
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.jvm.JvmField
import okio.ByteString

data class RouteSummary(
  @field:WireField(tag = 1, adapter = "com.squareup.wire.ProtoAdapter#INT32") val point_count: Int?
      = null,
  @field:WireField(tag = 2, adapter = "com.squareup.wire.ProtoAdapter#INT32") val feature_count:
      Int? = null,
  @field:WireField(tag = 3, adapter = "com.squareup.wire.ProtoAdapter#INT32") val distance: Int? =
      null,
  @field:WireField(tag = 4, adapter = "com.squareup.wire.ProtoAdapter#INT32") val elapsed_time: Int?
      = null,
  val unknownFields: ByteString = ByteString.EMPTY
) : Message<RouteSummary, RouteSummary.Builder>(ADAPTER, unknownFields) {
  @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Builder = Builder(this.copy())

  class Builder(private val message: RouteSummary) : Message.Builder<RouteSummary, Builder>() {
    override fun build(): RouteSummary = message
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<RouteSummary> = object : ProtoAdapter<RouteSummary>(
      FieldEncoding.LENGTH_DELIMITED, 
      RouteSummary::class.java
    ) {
      override fun encodedSize(value: RouteSummary): Int = 
        ProtoAdapter.INT32.encodedSizeWithTag(1, value.point_count) +
        ProtoAdapter.INT32.encodedSizeWithTag(2, value.feature_count) +
        ProtoAdapter.INT32.encodedSizeWithTag(3, value.distance) +
        ProtoAdapter.INT32.encodedSizeWithTag(4, value.elapsed_time) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: RouteSummary) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.point_count)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.feature_count)
        ProtoAdapter.INT32.encodeWithTag(writer, 3, value.distance)
        ProtoAdapter.INT32.encodeWithTag(writer, 4, value.elapsed_time)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): RouteSummary {
        var point_count: Int? = null
        var feature_count: Int? = null
        var distance: Int? = null
        var elapsed_time: Int? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> point_count = ProtoAdapter.INT32.decode(reader)
            2 -> feature_count = ProtoAdapter.INT32.decode(reader)
            3 -> distance = ProtoAdapter.INT32.decode(reader)
            4 -> elapsed_time = ProtoAdapter.INT32.decode(reader)
            else -> TagHandler.UNKNOWN_TAG
          }
        }
        return RouteSummary(
          point_count = point_count,
          feature_count = feature_count,
          distance = distance,
          elapsed_time = elapsed_time,
          unknownFields = unknownFields
        )
      }
    }
  }
}
