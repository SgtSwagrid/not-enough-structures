package com.alecdorrington.structures

import com.alecdorrington.structures.builder.FieldBuilder
import com.alecdorrington.structures.ops.FieldOps

/** For algebraic structures with addition, multiplication, and inverses. */
trait Field[X] extends EuclideanRing[X], Semifield[X]:

  override inline def mod(x: X, y: X): X = zero

/**
  * The companion object for [[Field]]. Import as
  * ```scala
  * import com.alecdorrington.structures.Field.{*, given}
  * ```
  * to receive all necessary syntax for working with fields.
  */
object Field extends FieldBuilder, FieldOps:

  export com.alecdorrington.structures.Field

  /** The [[Field]] instance describing the current algebra system. */
  inline def field[X : Field as field]: Field[X] = field
