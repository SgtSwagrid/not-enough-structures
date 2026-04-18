package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.Field
import com.alecdorrington.structures.ordered.builder.OrderedFieldBuilder
import com.alecdorrington.structures.ordered.ops.OrderedFieldOps

/** An ordered version of [[Field]]. */
trait OrderedField[X]
  extends Field[X], OrderedEuclideanRing[X], OrderedSemifield[X]

/**
  * The companion object for [[OrderedField]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedField.{*, given}
  * ```
  * to receive all necessary syntax for working with ordered fields.
  */
object OrderedField extends OrderedFieldBuilder, OrderedFieldOps:

  export com.alecdorrington.structures.ordered.OrderedField

  /** The [[OrderedField]] instance describing the current algebra system. */
  inline def orderedField[X : OrderedField as orderedField]: OrderedField[X] =
    orderedField
