package com.alecdorrington.structures
package ordered.ops

import com.alecdorrington.structures.ops.FieldOps
import com.alecdorrington.structures.ordered.OrderedField

/** Extension methods for [[OrderedField]]. */
trait OrderedFieldOps
  extends FieldOps, OrderedEuclideanRingOps, OrderedMultiplicativeGroupOps
