@file:UseSerializers(ViolationSerializer::class)

package systems.danger.kotlin.models.danger

import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import systems.danger.kotlin.sdk.Violation
import systems.danger.kotlin.models.serializers.ViolationSerializer

@Serializable
internal data class Meta(
    val runtimeName: String = "Danger Kotlin",
    val runtimeHref: String = "https://danger.systems"
)

@Serializable
internal data class DangerResults(
    var fails: MutableList<Violation> = mutableListOf(),
    var warnings: MutableList<Violation> = mutableListOf(),
    var messages: MutableList<Violation> = mutableListOf(),
    var markdowns: MutableList<Violation> = mutableListOf(),
    val meta: Meta = Meta()
)
